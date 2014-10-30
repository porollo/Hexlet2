package com.lesson3.ui.message;

/**
 * Created by Spider on 07.10.2014.
 */

public abstract class MesssageShower {
    private final IOnStringInput onStringInput;

    protected MesssageShower(IOnStringInput onStringInput, String message) {
        this.onStringInput = onStringInput;
        this.message = message;
    }

    private final String message;

    public IOnStringInput getOnStringInput() {
        return onStringInput;
    }

    public String getMessage() {
        return message;
    }

    public abstract void show();
}
