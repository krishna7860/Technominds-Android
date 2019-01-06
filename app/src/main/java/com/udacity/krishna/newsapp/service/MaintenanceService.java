package com.udacity.krishna.newsapp.service;

import android.annotation.SuppressLint;
import android.os.AsyncTask;

import com.firebase.jobdispatcher.JobParameters;
import com.firebase.jobdispatcher.JobService;
import com.udacity.krishna.newsapp.Dependency;
import com.udacity.krishna.newsapp.database.ArticleMaintenanceDao;
import com.udacity.krishna.newsapp.model.ArticleType;

public class MaintenanceService extends JobService {

    AsyncTask<Void, Void, Void> maintenanceTask;

    @SuppressLint("StaticFieldLeak")
    @Override
    public boolean onStartJob(JobParameters job) {
        maintenanceTask = new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                ArticleMaintenanceDao maintenanceDao = Dependency.getMaintenanceDao(getApplicationContext());
                for (int type : ArticleType.Type.types) {
                    maintenanceDao.deleteOldArticles(type);
                }
                maintenanceDao.deleteOldArticles(ArticleType.Type.TOP_HEAD);
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                jobFinished(job, false);
            }
        };
        maintenanceTask.execute();
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters job) {
        if (maintenanceTask != null) {
            maintenanceTask.cancel(true);
            maintenanceTask = null;
            return true;
        }
        return false;
    }
}
