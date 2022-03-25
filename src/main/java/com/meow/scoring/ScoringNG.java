package com.meow.scoring;

public class ScoringNG {
    public static void main(String[] args) {
        String[] name = {"Alice","Joyce","Peggy","Lisa","Iris"};
        int[] english = {70,80,96,85,100};
        int[] math = {50,60,98,60,100};

        for (int i = 0; i < 5; i++) {
            if (i != 3) {
                System.out.println(name[i] + "\t" + english[i] + "\t" + math[i] + "\t" + (english[i] + math[i]) / 2);
            }
        }
    }
}
