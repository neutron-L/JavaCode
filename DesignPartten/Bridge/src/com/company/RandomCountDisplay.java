package com.company;

import java.io.IOException;
import java.util.Random;

public class RandomCountDisplay extends CountDisplay {
    private Random random = new Random();
    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) throws IOException {
        multiDisplay(random.nextInt(times));
    }
}
