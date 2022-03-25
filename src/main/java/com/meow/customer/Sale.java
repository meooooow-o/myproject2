package com.meow.customer;

public class Sale {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001", 1200);
        Customer c2 = new Customer("0002", 800);
        Customer c3 = new Vip("0003", 2000);
        Customer c4 = new Vvip("0004",5000);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }

}
