package com.example.toanncth.quizapp;

import android.app.Activity;

/**
 * Created by DAT NGUYEN on 2017-04-11.
 */

public class HighScore extends Activity {
    private String THELOAI;
    private String DIEM;
    private int ID;

    public HighScore() {
        ID = 0;
        THELOAI = "";
        DIEM = "";

    }

    public HighScore(String tHELOAI, String dIEM) {
        THELOAI = tHELOAI;
        DIEM = dIEM;
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        ID = id;
    }

    public String getTheloai() {
        return THELOAI;
    }

    public void setTheloai(String tHELOAI) {
        THELOAI = tHELOAI;
    }

    public String getDiem() {
        return DIEM;
    }

    public void setDiem(String dIEM) {
        DIEM = dIEM;
    }
}
