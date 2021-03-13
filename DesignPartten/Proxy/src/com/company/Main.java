package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Printable p = new PrinterProxy("Alice");
        System.out.println("now name is " + p.getPrinterName() + ".");
        p.setPrinterName("Bob");
        System.out.println("now name is " + p.getPrinterName() + ".");
        p.print("Hello, world");
        p.setPrinterName("Eric");
        p.print("Hello, world");
    }
}
