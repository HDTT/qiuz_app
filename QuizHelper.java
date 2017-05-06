package com.example.toanncth.quizapp;

/**
 * Created by ToanNcTh on 3/28/2017.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class QuizHelper extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	// Database Name
	private static final String DATABASE_NAME = "mathsone";
	// tasks table name
	private static final String TABLE_QUEST = "quest";
	private static final String TABLE_QUEST1 = "quest1";
	private static final String TABLE_QUEST2 = "quest1";
	private static final String TABLE_QUEST3 = "quest1";
	private static final String TABLE_QUEST4 = "quest1";
	private static final String TABLE_QUEST5 = "quest1";
	// tasks Table Columns names
	private static final String KEY_ID = "qid";
	private static final String KEY_QUES = "question";
	private static final String KEY_ANSWER = "answer"; // correct option
	private static final String KEY_OPTA = "opta"; // option a
	private static final String KEY_OPTB = "optb"; // option b
	private static final String KEY_OPTC = "optc"; // option c

	private SQLiteDatabase dbase;

	public QuizHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		dbase = db;
		String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
				+ " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
				+ KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";

		String sql1 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST1 + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
				+ " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
				+ KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
		String sql2 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST2 + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
				+ " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
				+ KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
		String sql3 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST3 + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
				+ " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
				+ KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
		String sql4 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST4 + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
				+ " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
				+ KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
		String sql5 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST5 + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
				+ " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
				+ KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
		db.execSQL(sql);
		db.execSQL(sql1);
		db.execSQL(sql2);
		db.execSQL(sql3);
		db.execSQL(sql4);
		db.execSQL(sql5);
		addQuestion1();
		// db.close();
	}

	private void addQuestion1() {
		Question q5 = new Question("ai la nguoi da hy sinh trong chiên thắng điện biên phủ ?", "phan đình giót", "tố hữu", "Bác Hồ", "phan đình giót");
		this.addQuestion(q5,TABLE_QUEST);
		Question q6 = new Question("0+1 = ?", "1", "0", "10", "1");
		this.addQuestion(q6,TABLE_QUEST);
		Question q7 = new Question("9-9 = ?", "0", "9", "1", "0");
		this.addQuestion(q7,TABLE_QUEST);
		Question q8 = new Question("3+6 = ?", "8", "7", "9", "9");


		this.addQuestion(q8,TABLE_QUEST1);
		Question q9 = new Question("1+5 = ?", "6", "7", "5", "6");
		this.addQuestion(q9, TABLE_QUEST1);
		Question q10 = new Question("7-5 = ?", "3", "2", "6", "2");
		this.addQuestion(q10, TABLE_QUEST1);
		Question q11 = new Question("7-2 = ?", "7", "6", "5", "5");
		this.addQuestion(q11, TABLE_QUEST1);
		Question q12 = new Question("3+5 = ?", "8", "7", "5", "8");
		this.addQuestion(q12, TABLE_QUEST1);


		Question q13 = new Question("1+5 = ?", "6", "7", "5", "6");
		this.addQuestion(q13, TABLE_QUEST2);
		Question q14 = new Question("7-5 = ?", "3", "2", "6", "2");
		this.addQuestion(q14, TABLE_QUEST2);
		Question q15 = new Question("7-2 = ?", "7", "6", "5", "5");
		this.addQuestion(q15, TABLE_QUEST2);
		Question q16 = new Question("3+5 = ?", "8", "7", "5", "8");


		this.addQuestion(q16,TABLE_QUEST3);
		Question q17 = new Question("1+5 = ?", "6", "7", "5", "6");
		this.addQuestion(q17, TABLE_QUEST3);
		Question q18 = new Question("7-5 = ?", "3", "2", "6", "2");
		this.addQuestion(q18, TABLE_QUEST3);
		Question q19 = new Question("7-2 = ?", "7", "6", "5", "5");
		this.addQuestion(q19, TABLE_QUEST3);
		Question q20 = new Question("3+5 = ?", "8", "7", "5", "8");


		this.addQuestion(q20,TABLE_QUEST4);
		Question q21 = new Question("1+5 = ?", "6", "7", "5", "6");
		this.addQuestion(q21, TABLE_QUEST4);
		Question q22 = new Question("7-5 = ?", "3", "2", "6", "2");
		this.addQuestion(q22, TABLE_QUEST4);
		Question q23 = new Question("7-2 = ?", "7", "6", "5", "5");
		this.addQuestion(q23, TABLE_QUEST4);
		Question q24 = new Question("3+5 = ?", "8", "7", "5", "8");


		this.addQuestion(q24,TABLE_QUEST5);
		Question q25 = new Question("1+5 = ?", "6", "7", "5", "6");
		this.addQuestion(q25, TABLE_QUEST5);
		Question q26 = new Question("7-5 = ?", "3", "2", "6", "2");
		this.addQuestion(q26, TABLE_QUEST5);
		Question q27 = new Question("7-2 = ?", "7", "6", "5", "5");
		this.addQuestion(q27, TABLE_QUEST5);
		//Question q12 = new Question("3+5 = ?", "8", "7", "5", "8");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
		//Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST1);
		//Create tables again
		onCreate(db);
	}
	// Adding new question
	public void addQuestion(Question quest,String x) {
		// SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(KEY_QUES, quest.getQUESTION());
		values.put(KEY_ANSWER, quest.getANSWER());
		values.put(KEY_OPTA, quest.getOPTA());
		values.put(KEY_OPTB, quest.getOPTB());
		values.put(KEY_OPTC, quest.getOPTC());

		// Inserting Row
		dbase.insert(x, null, values);
	}

	public List<Question> getAllQuestions() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
		Query(selectQuery, quesList);
		return quesList;
	}
	public List<Question> getAllQuestions1() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST1;
		Query(selectQuery,quesList);
		return quesList;
	}
	public List<Question> getAllQuestions2() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST2;
		Query(selectQuery,quesList);
		return quesList;
	}
	public List<Question> getAllQuestions3() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST3;
		Query(selectQuery,quesList);
		return quesList;
	}
	public List<Question> getAllQuestions4() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST4;
		Query(selectQuery,quesList);
		return quesList;
	}
	public List<Question> getAllQuestions5() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST5;
		Query(selectQuery,quesList);
		return quesList;
	}
	private void Query(String x,List<Question> quesList){

		dbase = this.getReadableDatabase();
		Cursor cursor = dbase.rawQuery(x, null);
		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				Question quest = new Question();
				quest.setID(cursor.getInt(0));
				quest.setQUESTION(cursor.getString(1));
				quest.setANSWER(cursor.getString(2));
				quest.setOPTA(cursor.getString(3));
				quest.setOPTB(cursor.getString(4));
				quest.setOPTC(cursor.getString(5));
				quesList.add(quest);
			} while (cursor.moveToNext());
		}
	}
}