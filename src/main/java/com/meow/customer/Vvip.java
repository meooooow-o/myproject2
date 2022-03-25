package com.meow.customer;

public class Vvip extends Vip {
    public Vvip(String name,int spend){
        super(name, spend);
    }

    @Override
    public void print(){
        int discount = getDiscount()*2;
        System.out.println(name + "\t" + spend + "\t" + (spend - discount) +
                "(" + (getPoint()*2) + ")");
    }

}
