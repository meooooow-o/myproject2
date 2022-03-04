package com.meow;

public class ScoringNG {
    public static void main(String[] args) {
        String[] name = {"Alice","Joyce","Peggy"};
        int[] english = {70,80,96};
        int[] math = {50,60,98};
        for (int i = 0; i < 3; i++) {
            System.out.println(name[i] + "\t" + english[i] + "\t" + math[i] + "\t" + (english[i]+math[i])/2);
        }
    }
}
