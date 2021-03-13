package com;

import framework.*;
import idcard.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("lilin");
        Product card2 = factory.create("liuyongfei");
        card1.use();
        card2.use();
    }
}
