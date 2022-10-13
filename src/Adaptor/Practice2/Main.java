package Adaptor.Practice2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("D:\\DesignPattern\\src\\Adaptor\\Practice2\\file.txt");
            f.setValue("year", "2001");
            f.setValue("month", "1");
            f.setValue("day", "30");
            // getValue Test
            System.out.println(f.getValue("year"));
            f.writeToFile("D:\\DesignPattern\\src\\Adaptor\\Practice2\\test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
