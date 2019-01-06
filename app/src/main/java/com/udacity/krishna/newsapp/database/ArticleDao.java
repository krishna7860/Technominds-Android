package com.udacity.krishna.newsapp.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.RoomWarnings;

import com.udacity.krishna.newsapp.model.Article;
import com.udacity.krishna.newsapp.model.ArticleType;

import java.util.List;

@Dao
public interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insert(Article article);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(ArticleType articleType);

    @SuppressWarnings(RoomWarnings.CURSOR_MISMATCH)
    @Query("select * from articles a, article_type at  where a.id = at.id and at.type =:type order by published_at desc")
    LiveData<List<Article>> getArticles(int type);

    @Query("select * from articles order by published_at desc")
    LiveData<List<Article>> getAllArticles();

    @Query("select id from articles where title = :title and url = :url and published_at = :publishedAt")
    long getArticleId(String title, String url, String publishedAt);

    @SuppressWarnings(RoomWarnings.CURSOR_MISMATCH)
    @Query("select a.id, title from articles a, article_type at  where a.id = at.id and at.type =" + ArticleType.Type.TOP_HEAD + " order by published_at desc")
    List<Article> getHeadlines();
}
