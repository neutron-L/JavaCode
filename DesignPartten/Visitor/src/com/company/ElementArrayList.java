package com.company;

import java.util.ArrayList;

public class ElementArrayList extends ArrayList implements Element {
    @Override
    public void accept(Visitor v) {
        for (Object obj : this) {
            ((Entry) obj).accept(v);
        }
    }
}
