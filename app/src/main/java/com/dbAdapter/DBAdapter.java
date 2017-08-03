package com.dbAdapter;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Admin on 03-August-3-2017.
 */

public class DBAdapter {
    private final String DATABASE_NAME="NIKITASHA_VECTA";
    private final int DATABASE_VERSION=3;
    private DBHelper dbHelper=null;
    private String TAG="DBAdapter";
    private SQLiteDatabase db;
    private Context mContext;


    public DBAdapter(Context mContext){
        this.mContext=mContext;
        dbHelper=new DBHelper(mContext,DATABASE_NAME,null,DATABASE_VERSION);
        Log.i("--->",TAG);
        }

    public class DBHelper extends SQLiteOpenHelper{

        public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(TableBase.create_table.employee);
            db.execSQL(TableBase.create_table.employee_role_mapping);
            db.execSQL(TableBase.create_table.facebook_like);
            db.execSQL(TableBase.create_table.item);
            db.execSQL(TableBase.create_table.item_detail);
            db.execSQL(TableBase.create_table.item_size);
            db.execSQL(TableBase.create_table.item_type);
            db.execSQL(TableBase.create_table.purchase_order);
            db.execSQL(TableBase.create_table.purchase_order_detail);
            db.execSQL(TableBase.create_table.rating);
            db.execSQL(TableBase.create_table.sales_bill_detail);
            db.execSQL(TableBase.create_table.seq);
            db.execSQL(TableBase.create_table.stock);
            db.execSQL(TableBase.create_table.uom);
            db.execSQL(TableBase.create_table.vendor);
            Log.i("Table Created",""+db.getPath());
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        }

    }
    public Cursor getTableDetails(){
        Cursor mCursor=null;
        db=dbHelper.getWritableDatabase();
        mCursor=db.query(false,TableBase.Tables.item,null,null,null,null,null,null,null);
        return mCursor;

    }
}
