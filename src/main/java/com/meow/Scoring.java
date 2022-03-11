package com.meow;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack");
        jack.name = "Jack";
        jack.english = 70;
        jack.math = 80;
        jack.print();

        Student hank = new Student("Hank",80,60);
        hank.print();

    }
}
