package com.company;

public class Hand {
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    public static final Hand[] hand = {
            new Hand(ROCK),
            new Hand(PAPER),
            new Hand(SCISSORS)
    };

    public static final String[] name = {
            "ROCK", "PAPER", "SCISSORS"
    };

    private int handvalue;

    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue) {
        return hand[handvalue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    public int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else return -1;
    }
}
