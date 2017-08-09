package com.DataAcessObject;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLException;

/**
 * Created by Admin on 08-August-8-2017.
 */

public interface NikitashtaDAO {
   public long insert(String table, String nullColumnHack, ContentValues values);
   public SQLiteDatabase OpenDatabase();
   public void CloseDatabase();
   public Cursor getTableCurser(boolean distinct, String table, String[] columns,
                                String selection, String[] selectionArgs, String groupBy,
                                String having, String orderBy, String limit) throws SQLException;

}
