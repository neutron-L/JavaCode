package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Display d1 = new Display(new StringDisplayImpl("Hello, China"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, universe"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
        RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("Hello, Tang"));
        d4.randomDisplay(9);

        IncreaseDisplay d5 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);

        d5.increaseDisplay(5);
        CountDisplay d6 = new CountDisplay(new FileDisplayImpl("D:\\algorithm\\JavaCode\\DesignPartten\\Bridge\\star.txt"));
        d6.multiDisplay(4);
    }
}
