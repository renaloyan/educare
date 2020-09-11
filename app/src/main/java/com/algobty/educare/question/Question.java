package com.algobty.educare.question;

public class Question {

    private int grade;
    private int quarter;
    private int subject;
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private int correctAns;

    public Question() {}

    public Question(int grade, int quarter, int subject, String question, String optionA, String optionB, String optionC, String optionD, int correctAns) {
        this.grade = grade;
        this.quarter = quarter;
        this.subject = subject;
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAns = correctAns;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public int getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(int correctAns) {
        this.correctAns = correctAns;
    }
}
