package com.company;

import exercise.TicketMarker;
import exercise.Triple;

import java.util.concurrent.TransferQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Start...");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2)
            System.out.println("obj1 equals obj2");
        else
            System.out.println("obj1 does not equal obj2");

//        5-1
        System.out.println("5-1");
        TicketMarker t1 = TicketMarker.getInstance();
        TicketMarker t2 = TicketMarker.getInstance();
        System.out.println(t1.getNextTicketNumber());
        System.out.println(t2.getNextTicketNumber());
        System.out.println("end.");

        System.out.println("5-2");
        System.out.println("Start...");
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i%3);
            System.out.println(triple);
        }
        System.out.println("end.");


    }
}

