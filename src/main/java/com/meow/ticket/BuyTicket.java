package com.meow.ticket;

import java.util.Scanner;

public class BuyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請選擇起站: (1.Taipei 2.Taichung 3.Kaohsiung)");
        Station startStation = null;
        int choiceStart = Integer.parseInt(scanner.next());
        switch (choiceStart){
            case 1:
                startStation = Station.TAIPEI_STATION;
                break;
            case 2:
                startStation = Station.TAICHUNG_STATION;
                break;
            case 3:
                startStation = Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("請選擇迄站: (1.Taipei 2.Taichung 3.Kaohsiung)");
        Station endStation = null;
        int choiceEnd = Integer.parseInt(scanner.next());
        switch (choiceEnd){
            case 1:
                endStation = Station.TAIPEI_STATION;
                break;
            case 2:
                endStation = Station.TAICHUNG_STATION;
                break;
            case 3:
                endStation = Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("請選擇票種: (1.普通票 2.學生票 3.敬老票)");
        int choice = Integer.parseInt(scanner.next());
        Ticket ticket = null;
        switch (choice){
            case 1:
                ticket = new Ticket(startStation,endStation);
                break;
            case 2:
                ticket = new StudentTicket(startStation,endStation);
                break;
            case 3:
                ticket = new ElderTicket(startStation,endStation);
                break;

        }
        ticket.print();
    }
}
