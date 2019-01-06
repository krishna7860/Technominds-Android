package com.udacity.krishna.newsapp.ui;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.preference.PreferenceManager;

import com.udacity.krishna.newsapp.Dependency;
import com.udacity.krishna.newsapp.R;
import com.udacity.krishna.newsapp.Repository;
import com.udacity.krishna.newsapp.database.ArticleDao;
import com.udacity.krishna.newsapp.model.Article;
import com.udacity.krishna.newsapp.model.ArticleType;

import java.util.List;

public class MainViewModel extends AndroidViewModel implements SharedPreferences.OnSharedPreferenceChangeListener {

    private final Repository repository;
    private final ArticleDao articleDao;
    private SharedPreferences pref;

    public MainViewModel(Application application) {
        super(application);
        articleDao = Dependency.getArticleDao(getApplication().getApplicationContext());
        repository = Dependency.getRepository(getApplication().getApplicationContext());

        pref = PreferenceManager.getDefaultSharedPreferences(getApplication().getApplicationContext());
        pref.registerOnSharedPreferenceChangeListener(this);
    }


    LiveData<List<Article>> getArticleList() {
        loadTopHeadlines(false);
        return articleDao.getArticles(ArticleType.Type.TOP_HEAD);
    }

    LiveData<List<Article>> getArticlesByCategory(int type) {
        loadArticlesByCategory(type, false);
        return articleDao.getArticles(type);
    }

    void loadTopHeadlines(boolean onDemand) {
        repository.getTopHeadlines(onDemand);
    }

    void loadArticlesByCategory(int type, boolean onDemand) {
        repository.getArticlesByCategory(type, onDemand);
    }

    void getNextTopHeadlines() {
        repository.getNextTopHeadlines();
    }

    void getNextArticlesByCategory(int type) {
        repository.getNextArticleByCategory(type);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        Context context = getApplication().getApplicationContext();
        if (key.equals(context.getString(R.string.pref_key_update_frequency))) {
            Dependency.scheduleUpdateJob(context, true);
        } else if (key.equals(context.getString(R.string.pref_key_country))) {
            repository.onCountryCodeChanged();
        }
    }

    @Override
    protected void onCleared() {
        pref.unregisterOnSharedPreferenceChangeListener(this);
        super.onCleared();
    }
}
