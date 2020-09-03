package com.algobty.educare.question;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.algobty.educare.question.QuizContract.*;

import androidx.annotation.Nullable;

public class QuizDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Quiz.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizDbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_GRADE + " TEXT, " +
                QuestionTable.COLUMN_QUARTER + " TEXT, " +
                QuestionTable.COLUMN_SUBJECT + " TEXT, " +
                QuestionTable.COLUMN_QUESTIONS + " TEXT, " +
                QuestionTable.COLUMN_OPTION_A + " TEXT, " +
                QuestionTable.COLUMN_OPTION_B + " TEXT, " +
                QuestionTable.COLUMN_OPTION_C + " TEXT, " +
                QuestionTable.COLUMN_OPTION_D + " TEXT, " +
                QuestionTable.COLUMN_CORRECT_ANS + " INTEGER" +
                " ) ";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {

        Question q1 = new Question("SEVEN", "FIRST", "ENGLISH", "A is correct", "A", "B", "C", "D", 1);
        addQuestion(q1);
    }

    private void addQuestion(Question question){

        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_GRADE, question.getGrade());
        cv.put(QuestionTable.COLUMN_QUARTER, question.getQuarter());
        cv.put(QuestionTable.COLUMN_SUBJECT, question.getSubject());
        cv.put(QuestionTable.COLUMN_QUESTIONS, question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION_A, question.getOptionA());
        cv.put(QuestionTable.COLUMN_OPTION_B, question.getOptionB());
        cv.put(QuestionTable.COLUMN_OPTION_C, question.getOptionC());
        cv.put(QuestionTable.COLUMN_OPTION_D, question.getOptionD());
        cv.put(QuestionTable.COLUMN_CORRECT_ANS, question.getCorrectAns());
        db.insert(QuestionTable.TABLE_NAME, null, cv);
    }



}
