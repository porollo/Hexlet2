package com.lesson3;

import com.lesson3.ui.message.IOnStringInput;

/**
 * Created by Spider on 21.10.2014.
 */

public class InputNameListener implements IOnStringInput {

    @Override
    public void onSrtingInput(String input) {
        System.out.println("Your name is " + input);
    }
}
