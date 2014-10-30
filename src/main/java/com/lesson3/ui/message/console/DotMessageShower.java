package com.lesson3.ui.message.console;

import com.lesson3.ui.message.IOnStringInput;
import com.lesson3.ui.message.console.ConsoleMessageShower;

/**
 * Created by Spider on 07.10.2014.
 */

public class DotMessageShower extends ConsoleMessageShower {

    public static final char SYMBOL = '.';

    public DotMessageShower(String message, IOnStringInput onStringInput) {
        super(message, SYMBOL, onStringInput);
    }
}
