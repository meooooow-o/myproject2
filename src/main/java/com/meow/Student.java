package com.meow;

public class Student {
    String name;
    int english;
    int math;
    //建構特別方法，建構值，需和Class為同名稱，且無回傳值
    public Student(String name){
        this.name = name; //需顏色不同，使用this來表示非方法內的name，而是int name

        //super();
    }
    //第二種建構方法，特別方法可以再內部產生建構值，須注意種類及屬性
    public Student(String name, int english , int math){
        this.name = name;
        this.english = english;
        this.math = math;
    }

    //建構void
    public void print(){
        System.out.println(name + "\t" + english + "\t" + math);
    }
}
