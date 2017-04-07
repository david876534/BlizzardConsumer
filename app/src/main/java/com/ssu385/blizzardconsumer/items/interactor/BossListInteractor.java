package com.ssu385.blizzardconsumer.items.interactor;

import com.ssu385.blizzardconsumer.core.model.BossList;
import com.ssu385.blizzardconsumer.network.BossListAsyncTask;

/*
    Concrete implementation of the BossInteractor meant to retrieve a collection of boss data from a
    remote API
 */
public class BossListInteractor implements BossInteractor {
    @Override
    public void getBossData(String id, final BossDataCallback callback) {
        //This code will create a new BossListAsyncTask.
        //The first step after basic creation is to set the BossListResponseListener so that this
        //BossListInteractor will receive the response after the execute call is performed.

        BossListAsyncTask asyncTask = new BossListAsyncTask();

        //This step ONLY DEFINES the methods to which the response from the asyncTask will be handled
        //it DOES NOT call the asyncTasks execute (which subsequently calls doInBackground()
        asyncTask.setBossListResponseListener(new BossListAsyncTask.BossListResponseListener() {
            //None of this code will be called until the point at which execute has been called and the
            //response has been received from asyncTask
            @Override
            public void onBossListResponse(BossList bosses) {
                //callback is the same callback as was passed into this function initially
                callback.onBossDataCallback(bosses);
            }
        });
        //This next line is where the call is made
        asyncTask.execute();
    }
}
