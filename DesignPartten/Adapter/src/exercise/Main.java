package exercise;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("D:\\algorithm\\JavaCode\\DesignPartten\\Adapter\\file.txt");
            f.setValue("year", "2021");
            f.setValue("month", "2");
            f.setValue("day", "21");
            f.writeToFile("D:\\algorithm\\JavaCode\\DesignPartten\\Adapter\\newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
