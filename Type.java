package com.example.toanncth.quizapp;

import java.io.Serializable;

/**
 * Created by ToanNcTh on 3/28/2017.
 */
public class Type implements Serializable{
    String name;

    public Type(String name){
    this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
