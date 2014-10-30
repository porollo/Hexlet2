package com.lesson2;

public class Human {

    private final String name;
    private int age = 0;

    public Human(String name){
        super();
        this.name = name;
        System.out.println("In Human");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void birthDay(){
        age++;
    }
}
