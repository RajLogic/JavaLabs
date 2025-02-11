package Week1.Lab2.Task1;

import Week1.Lab1.Task2.Movie;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        Computer c1 = new Computer();
        c1.setMake("Dell");
        c1.setProcessor("Poop");
        c1.setMemory(100);
        c1.setYear(2000);
        c1.setPrice(1000);

        System.out.println("Computer:" + c1.toString());




    }

}
