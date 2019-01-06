package com.udacity.krishna.newsapp.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.udacity.krishna.newsapp.model.Article;
import com.udacity.krishna.newsapp.model.ArticleType;

@Database(entities = {Article.class, ArticleType.class}, version = 1, exportSchema = false)
public abstract class ArticleDatabase extends RoomDatabase {
    public abstract ArticleDao getArticleDao();

    public abstract ArticleMaintenanceDao getMaintenanceDao();
}
