package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NumberGenerator generator = new RandomNumberGenerator();
        NumberGenerator generator1 = new IncrementalNumberGenerator(10, 50, 5);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator1.addObserver(observer1);
        generator1.addObserver(observer2);
//        generator.execute();
        generator1.execute();
    }
}
