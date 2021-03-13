package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            try {
                o.update(this);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}
