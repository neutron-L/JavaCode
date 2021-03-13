package com.company;

import game.Gamer;
import game.Memento;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for (int i = 0; i < 100; i++) {
            System.out.println("=====" + i);
            System.out.println("now state: " + gamer);

            gamer.bet();
            System.out.println(gamer.getMoney() + "yuan");
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println();
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
