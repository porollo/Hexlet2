package com.lesson3.ui.message.console;

import com.lesson3.ui.message.IOnStringInput;
import com.lesson3.ui.message.MesssageShower;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;

/**
 * Created by Spider on 07.10.2014.
 */

public class ConsoleMessageShower extends MesssageShower {

    private final char symbol;

    public ConsoleMessageShower(String message, char symbol, IOnStringInput onStringInput)
    {
        super(onStringInput, message);
        this.symbol = symbol;
    }

    @Override
    public void show() {
        showLine();
        out.println(getMessage());
        showLine();
        inputString();
    }

    private void inputString(){
        InputStreamReader bufferedInputReader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(bufferedInputReader);
        try{
            String stringFromUser = bufferedReader.readLine();
            getOnStringInput().onSrtingInput(stringFromUser);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showLine(){
        for (int i = 0; i < getMessage().length(); i++ )
            System.out.print(symbol);
            System.out.println();
    }

}
