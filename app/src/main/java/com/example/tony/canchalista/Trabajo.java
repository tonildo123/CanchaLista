package com.example.tony.canchalista;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

/**
 * Created by usuario on 20/01/2018.
 */

public class Trabajo extends JobService{
    private static final String TAG = "MyJobService";
    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d(TAG, "Performing long running task in scheduled job");
        // TODO(developer): add long running task here.
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
