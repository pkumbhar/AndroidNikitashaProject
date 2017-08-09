package com.background;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.dbAdapter.DBAdapter;
import com.dbAdapter.TableBase;
import com.model.ItemType;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 08-August-8-2017.
 */

public class DownloadProductType extends AsyncTask<String,Void,String> {
    private Activity mActivity;
    private Context mContext;
    private Handler mHandler;
    private ProgressDialog progressDialog;
    private String RESULT="1";
    private String RESULTFAIL="0";

    public DownloadProductType(Activity mActivity, Context mContext, Handler mHandler) {
        this.mActivity = mActivity;
        this.mContext = mContext;
        this.mHandler = mHandler;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog = new ProgressDialog(mActivity);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("please wait..!");
        progressDialog.show();
    }

    @Override
    protected String doInBackground(String... params) {
        List<ItemType> itemTypesList=new ArrayList<ItemType>();
        try{
            BufferedInputStream in;
            URL url=new URL("http://192.168.0.111:8081/Nikitasha/rest/RestService/getItemType");
            HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            int status=urlConnection.getResponseCode();
            if(status>400){
                try{
                    in=new BufferedInputStream(urlConnection.getErrorStream());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(status<400){
                List<ItemType> itemTypeList =new ArrayList<ItemType>();

                try{
                    in=new BufferedInputStream(urlConnection.getInputStream());
                    BufferedReader reader=new BufferedReader(new InputStreamReader(in));
                    String line;
                    StringBuffer buffer=new StringBuffer();
                    while ((line=reader.readLine())!=null){
                        buffer.append(line+"\n");
                    }
                    if(!(buffer.toString().isEmpty())){
                        JSONArray jsonArray=new JSONArray(buffer.toString());
                        if(jsonArray.length()>0){
                            DBAdapter db=new DBAdapter(mContext);
                            Log.i("json operation"," "+jsonArray.toString());
                            for(int i=0;i<jsonArray.length();i++){
                                ItemType itemType=new ItemType();
                                JSONObject object=jsonArray.getJSONObject(i);
                                ContentValues cv=new ContentValues();
                                cv.put(TableBase.ColumnName.ItemType.ITEM_TYPE_ID,object.getString("item_type_id"));
                                cv.put(TableBase.ColumnName.ItemType.ITEM_NAME,object.getString("item_type_name"));
                                db.OpenDatabase();
                                long l=db.insert(TableBase.Tables.item_type,null,cv);
                                Log.i("inserted",""+l);
                                db.CloseDatabase();
                            }
                            progressDialog.dismiss();
                            return RESULT;
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                    progressDialog.dismiss();
                    return RESULTFAIL;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            progressDialog.dismiss();
            return RESULTFAIL;
        }
        return RESULTFAIL;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        if(s.equals(RESULT)){
            mHandler.obtainMessage(1).sendToTarget();
        }else if(s.equals(RESULTFAIL)){
            mHandler.obtainMessage(0).sendToTarget();

        }
    }
}
