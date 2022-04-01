package com.meow.ticket;

public class Ticket {
    Station startPlace;
    Station destinationPlace;
    int price;

    public Ticket(Station startPlace, Station destinationPlace){
        this.startPlace = startPlace;
        this.destinationPlace = destinationPlace;
    }

    public int getPrice(){
        price = 0;
        if (startPlace == Station.TAIPEI_STATION){
            if (destinationPlace == Station.TAICHUNG_STATION)
                price = 600;
            else
                price = 1500;
        }
        if (startPlace == Station.TAICHUNG_STATION){
            if (destinationPlace == Station.TAIPEI_STATION)
                price = 600;
            else
                price = 900;
        }
        if (startPlace == Station.KAOHSIUNG_STATION){
            if (destinationPlace == Station.TAIPEI_STATION)
                price = 1500;
            else
                price = 900;
        }
        return price;
    }

    public void print(){
        price = getPrice();
        System.out.println("您的起站: " + startPlace +
                "\t" + "您的迄站: " + destinationPlace +
                "\t" + "票價: " + price);

    }
}
