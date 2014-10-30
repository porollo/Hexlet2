package com.lesson2;

/**
 * Created by Spider on 30.09.2014.
 */
public class Student extends Human{

    private int cource = 1;

    public Student (String name) {
        super(name);
        System.out.println("In student");
    }

    public int getCource() {
        return cource;
    }

    public void setCource(int cource) {
        this.cource = cource;
    }
}
