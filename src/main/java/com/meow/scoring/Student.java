package com.meow.scoring;

public class Student {
    String name;
    int english;
    int math;
    int thesis;

    //建構特別方法，建構值，需和Class為同名稱，且無回傳值
    //第二種建構方法，特別方法可以再內部產生建構值，須注意種類及屬性
    public Student(String name, int english , int math){
//        this(name);
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public Student(){
        this("Jhon Doe",-1,-1);}
        /*name = "Jhon Doe";
        english = -1;
        math = -1;*/

    //建構void print
    public void print(){
        int average = getAverage() ;
        System.out.print(name + "\t" + english + "\t" + math + "\t" + average);

        if (average<60)
            System.out.print("*");
        System.out.println();
    }
    public int getAverage(){
        return (english + math)/2;
    }
}
