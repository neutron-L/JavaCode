package com.company;

import java.io.IOException;

public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) throws IOException {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
