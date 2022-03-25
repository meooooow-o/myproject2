package com.meow.ticket;

import java.util.Scanner;

public class BuyTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(
                Station.TAIPEI_STATION,
                Station.KAOHSIUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start station? (1.Taipei 2.Taichung 3.Kaohsiung)");
        Station startStation = null;
        int choiceStart = Integer.parseInt(scanner.next());
        switch (choiceStart){
            case 1:
                startStation = Station.TAIPEI_STATION;
            case 2:
                startStation = Station.TAICHUNG_STATION;
            case 3:
                startStation = Station.KAOHSIUNG_STATION;
        }
        System.out.println("Destination station? (1.Taipei 2.Taichung 3.Kaohsiung)");
        Station endStation = null;
        int choiceEnd = Integer.parseInt(scanner.next());
        switch (choiceEnd){
            case 1:
                endStation = Station.TAICHUNG_STATION;
            case 2:
                endStation = Station.TAICHUNG_STATION;
            case 3:
                endStation = Station.KAOHSIUNG_STATION;
        }
    }
}
