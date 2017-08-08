package com.background;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;

/**
 * Created by Admin on 08-August-8-2017.
 */

public class DownloadAllItems  extends AsyncTask<String,Void,String>{

    private Activity mActivity;
    private Context mContext;
    private Handler mHandler;
    private ProgressDialog progressDialog;
    private String itemTypeId;

    public DownloadAllItems(Activity mActivity, Context mContext, Handler mHandler, String itemTypeId) {
        this.mActivity = mActivity;
        this.mContext = mContext;
        this.mHandler = mHandler;
        this.itemTypeId = itemTypeId;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

    @Override
    protected String doInBackground(String... params) {
        return null;
    }
}
