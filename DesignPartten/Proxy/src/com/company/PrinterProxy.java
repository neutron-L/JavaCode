package com.company;

public class PrinterProxy implements Printable {
    private String name;
    private Printable real;
    private String className;

    public PrinterProxy(){}

    public PrinterProxy(String name, String className) {
        this.name = name;
        this.className = className;
    }

    @Override
    public void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }

        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            try {
                real = (Printable)Class.forName(className).newInstance();
                real.setPrinterName(name);
            } catch (ClassNotFoundException ignored){

            } catch (IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
