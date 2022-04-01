package com.meow.ticket;

import javax.xml.namespace.QName;

public class StudentTicket extends Ticket {

    public StudentTicket(Station startPlace, Station destinationPlace) {
        super(startPlace, destinationPlace);
    }

    public int getSale(){
        price = (getPrice() * 9)/10;
        return price;
    }
    @Override
    public void print(){
        price = getSale();
        System.out.println("您的起站: " + startPlace.name +
                "\t" + "您的迄站: " + destinationPlace.name +
                "\t" + "票價: " + price);

    }
}
