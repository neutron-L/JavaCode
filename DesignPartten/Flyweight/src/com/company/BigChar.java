package com.company;

import java.io.*;

public class BigChar {
    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("big" + charname + ".txt")
            );
            String line;
            StringBuffer buf = new StringBuffer();


            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(){
        System.out.println(fontdata);
    }
}
