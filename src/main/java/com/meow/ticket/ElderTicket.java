package com.meow.ticket;

public class ElderTicket extends StudentTicket{

    public ElderTicket(Station startPlace, Station destinationPlace) {
        super(startPlace, destinationPlace);
    }
    @Override
    public int getSale(){
        price = (getPrice()*5)/10;
        return price;
    }
}
