package com.meow.scoring;

public class GraduatedStudent extends Student {//extends 繼承副類別
    public GraduatedStudent(String name , int english , int math , int thesis){
        super(name, english, math);
        this.thesis = thesis;
    }
//    public GraduatedStudent() { super(); }
    public void print(){
        System.out.println(name + "\t" +
                english + "\t" + math + "\t" +
                getAverage() + "\t" + thesis);
    }


}
