package com.meow.scoring;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack",50,42);
        Student hank = new Student("Hank",80,60);
        GraduatedStudent jane = new GraduatedStudent("Jane",80,50,70);
        jack.print();
        hank.print();
        jane.print();

    }
}
