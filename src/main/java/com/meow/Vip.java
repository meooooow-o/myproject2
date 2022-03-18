package com.meow;

public class Vip extends Customer {
    int point;
    public Vip(String name,int spend){
        super(name, spend);
    }
    @Override
    public void print(){
        int discount = getDiscount();
        int point = getDiscount();
        System.out.println(name + "\t" + spend + "\t" + (spend - discount) +
                "(" + point + ")");
    }

}
