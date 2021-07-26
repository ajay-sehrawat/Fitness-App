package com.example.Gym_Log;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class db extends SQLiteOpenHelper {
    public db(Context context) {
        super(context, "data.db",null , 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table details(name Text ,weight TEXT ,date TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists details");

    }
    public Boolean insertuserdata(String name,String weight,String date){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name",name);
        contentValues.put("weight",weight);
        contentValues.put("date",date);
        long result = db.insert("details",null,contentValues);
        if (result==-1){
            return false;
        }else {
            return true;
        }
    }
    public Cursor getdata(){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.rawQuery("select * from details",null);
    }

}
