package com.example.toanncth.quizapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DAT NGUYEN on 2017-04-12.
 */

public class HSHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "mathsonev";
    private static final String TABLE_QUEST = "questc";
    private static final String KEY_ID = "qid1"; // option score
    private static final String KEY_LOAI = "loai";
    private static final String KEY_HIGH = "high";

    private SQLiteDatabase dbase;

    public HSHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_LOAI
                + " TEXT, " + KEY_HIGH + " TEXT)";
        db.execSQL(sql);
        addHighScore();

    }
    private void addHighScore(){
        HighScore h1 = new HighScore("Khoa Học Xã hội", "0");
        this.addTheLoai(h1, TABLE_QUEST);
        HighScore h2 = new HighScore("Toán Học", "0");
        this.addTheLoai(h2, TABLE_QUEST);
        HighScore h3 = new HighScore("Văn Học - Lịch Sử", "0");
        this.addTheLoai(h3, TABLE_QUEST);
        HighScore h4 = new HighScore("Địa Lý", "0");
        this.addTheLoai(h4, TABLE_QUEST);
        HighScore h5 = new HighScore("Câu Đố Vui", "0");
        this.addTheLoai(h5, TABLE_QUEST);
        HighScore h6 = new HighScore("Câu Đố Mẹo", "0");
        this.addTheLoai(h6, TABLE_QUEST);
        HighScore h7 = new HighScore("Câu Đố Hay", "0");
        this.addTheLoai(h7, TABLE_QUEST);
        HighScore h8 = new HighScore("Câu Đố Cười", "0");
        this.addTheLoai(h8, TABLE_QUEST);


    }
    // Adding the loai
    public void addTheLoai(HighScore highScore,String x) {
        // SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        //values.put(KEY_ID, highScore.getIDHS());
        values.put(KEY_LOAI, highScore.getTheloai());
        values.put(KEY_HIGH, highScore.getDiem());
        // Inserting Row
        dbase.insert(x, null, values);
    }

    public List<HighScore> getHighScore() {
        List<HighScore> highScores = new ArrayList<HighScore>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        QueryHighScore(selectQuery,highScores);
        return highScores;
    }

    private void QueryHighScore(String x, List<HighScore> highScores){

        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(x, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                HighScore highScore = new HighScore();
                highScore.setID(cursor.getInt(0));
                highScore.setTheloai(cursor.getString(1));
                highScore.setDiem(cursor.getString(2));
                highScores.add(highScore);
            } while (cursor.moveToNext());
        }
    }

    public void updateContact(HighScore highScore) {
        ContentValues values = new ContentValues();
      //  values.put(TABLE_QUEST, highScore.getTheloai());
        values.put(KEY_HIGH, highScore.getDiem());

        // updating row
         dbase.update(TABLE_QUEST, values, KEY_ID + " = ?", new String[] { String.valueOf(highScore.getID()) });
        dbase.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);

    }
}
