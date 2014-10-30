package com.game;

/**
 * Created by Spider on 09.10.2014.
 */

public class Field {

    private static final int FIELD_SIZE = 3;

    private static final String FIELD = "[ ]";

    char[][] lineArray = new char[FIELD_SIZE][FIELD_SIZE];


    public void showLine() {

        for (int i = 0; i < FIELD_SIZE; i++) {

            System.out.print(FIELD);
        }
    }

    public void showField(){

    }


}