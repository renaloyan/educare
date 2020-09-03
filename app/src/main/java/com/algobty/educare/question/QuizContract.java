package com.algobty.educare.question;

import android.provider.BaseColumns;

public final class QuizContract {

    private QuizContract() {}

    public static class QuestionTable implements BaseColumns {
        public static final String TABLE_NAME = "quiz_questions";
        public static final String COLUMN_GRADE = "grade";
        public static final String COLUMN_QUARTER = "quarter";
        public static final String COLUMN_SUBJECT = "subject";
        public static final String COLUMN_QUESTIONS = "question";
        public static final String COLUMN_OPTION_A = "option_a";
        public static final String COLUMN_OPTION_B = "option_b";
        public static final String COLUMN_OPTION_C = "option_c";
        public static final String COLUMN_OPTION_D = "option_d";
        public static final String COLUMN_CORRECT_ANS = "correct_ans";

    }

}
