package com.company;

import javax.swing.plaf.TableHeaderUI;

public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) throws InterruptedException {
        System.out.println("DigitObserver: " + generator.getNumber());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
