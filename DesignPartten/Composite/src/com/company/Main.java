package com.company;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            rootdir.printList();

            System.out.println("");
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            tomura.add(new File("game.doc", 400));
            File junk = new File("junk.mail", 500);
            tomura.add(junk);
            rootdir.printList();
            System.out.println("path:");
            System.out.println(rootdir.getPath());
            System.out.println(junk.getPath());

        } catch (FileTreatmentException ex) {
            ex.printStackTrace();
        }
    }
}
