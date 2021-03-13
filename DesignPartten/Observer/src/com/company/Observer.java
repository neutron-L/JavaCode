package com.company;

public interface Observer {
    void update(NumberGenerator generator) throws InterruptedException;
}
