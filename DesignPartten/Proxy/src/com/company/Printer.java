package com.company;

public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("now creating instance of Printer...");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("now creating instance of Printer (" + name + ")...");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.print('.');
        }
        System.out.println("end..");
    }
}
