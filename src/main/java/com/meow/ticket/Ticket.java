package com.meow.ticket;

public class Ticket {
    Station startPlace;
    Station arrivePlace;
    int price;

    public Ticket(Station startPlace, Station arrivePlace){
        this.startPlace = startPlace;
        this.arrivePlace = arrivePlace;
    }

    public void print(){

    }
}
