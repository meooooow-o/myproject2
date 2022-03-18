package com.meow;

public class Vip extends Customer {
    int point;
    public Vip(String name,int spend){
        super(name, spend);
    }
    public int getPoint(){
        point = getDiscount();
        return point;
    }

    @Override
    public void print(){
        int discount = getDiscount();
        System.out.println(name + "\t" + spend + "\t" + (spend - discount) +
                "(" + getPoint() + ")");
    }

}
