package com.lesson3.ui.message.console;

import com.lesson3.ui.message.IOnStringInput;
import com.lesson3.ui.message.console.ConsoleMessageShower;

/**
 * Created by Spider on 09.10.2014.
 */

public class NumberMessageShower extends ConsoleMessageShower {

    public static final char SYMBOL = 'X';

    public NumberMessageShower(String message, IOnStringInput onStringInput) {
        super(message, SYMBOL, onStringInput);
    }

}
