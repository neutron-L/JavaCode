package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world");
        d1.display();
        d2.display();

    }
}
