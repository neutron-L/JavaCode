package com.company;

import java.util.ArrayList;

public class MultiStringDisplay extends Display {
    private ArrayList<String> strings = new ArrayList<>();
    private int cols;

    public void add(String str) {
        strings.add(str);
        cols = Math.max(cols, str.length());
    }

    @Override
    public int getColumns() {
        return cols;
    }

    @Override
    public int getRows() {
        return strings.size();
    }

    @Override
    public String getRowText(int row) {
        StringBuffer buffer = new StringBuffer(strings.get(row));
        int blanks = getColumns() - buffer.length();
        for (int i = 0; i < blanks; i++)
            buffer.append(" ");
        return buffer.toString();
    }
}
