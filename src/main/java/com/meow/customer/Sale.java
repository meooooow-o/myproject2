package com.meow.customer;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001", 1200));
        customers.add(new Customer("0002", 800));
        customers.add(new Vip("0003", 2000));
        customers.add(new Vvip("0004",5000));
        for (int i = 0 ; i < 3 ; i++){
            customers.get(i).print();
        }
/*        for (Customer c : customers){
            c.print();
*/
        }
    }

