package com.lesson2;

/**
 * Created by Spider on 30.09.2014.
 */
public class Main {

    public static void main(String[] args) {
        Human human = new Human("Vasya");
        System.out.println(human.getName());
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        Student student = new Student("Dima");
        System.out.println(student.getName());
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        House house = new House();
        house.setHuman(student);
        System.out.println("Owner name is " + house.getOwnerName());
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        Teacher teacher = new Teacher("T1");
        house.setHuman(teacher);
        System.out.println("Owner name 2 is " + house.getOwnerName());

    }
}
