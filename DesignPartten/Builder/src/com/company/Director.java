package com.company;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("from morning to afternoon");
        builder.makeItems(new String[]{
                "Good morning",
                "Good afternoon"
        });
        builder.makeString("Evening");
        builder.makeItems(new String[]{
                "Good evening",
                "Good night",
                "Good bye"
        });
        builder.close();
    }
}
