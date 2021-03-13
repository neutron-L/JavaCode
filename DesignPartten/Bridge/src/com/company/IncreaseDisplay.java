package com.company;

import java.io.IOException;

public class IncreaseDisplay extends CountDisplay {
    private int step;
    public IncreaseDisplay(DisplayImpl impl, int step) {
        super(impl);
        this.step = step;
    }

    public void increaseDisplay(int level) throws IOException {
        int count = 0;

        for (int i = 0; i < level; i++) {
            multiDisplay(count);
            count += step;
        }
    }
}
