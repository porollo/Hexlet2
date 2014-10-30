package com.lesson3;

import com.lesson3.ui.message.MesssageShower;
import com.lesson3.ui.message.console.ConsoleMessageShower;
import com.lesson3.ui.message.console.DotMessageShower;
import com.lesson3.ui.message.console.NumberMessageShower;
import com.lesson3.ui.message.console.StarMessageShower;

/**
 * Created by Spider on 07.10.2014.
 */

public class Main {
    public static void main(String[] args) {


        StringListener stringListener = new StringListener();

        showMesssage(new NumberMessageShower("What is tor name? ", new InputNameListener()));
        showMesssage(new DotMessageShower("What is your age? ", new InputAgeListener()));
    }

    private static void showMesssage(MesssageShower ms){
        ms.show();
    }
}
