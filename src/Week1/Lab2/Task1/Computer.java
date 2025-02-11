package Week1.Lab2.Task1;

import java.time.Year;

public class Computer {
    private String make;
    private String processor;
    private int memory;
    private int year;
    private double price;

    public Computer() {
        this.make = "";
        this.processor = "";
        this.memory = 0;
        this.year = 0;
        this.price = 0.0;
    }

    public Computer(String make, String processor) {
        this.make = make;
        this.processor = processor;
        this.memory = 0;
        this.year = 0;
        this.price = 0.0;
    }

    public Computer(String make, String processor, int memory){
        this(make, processor);
        setMemory(memory);
    }


    public String getMake() {
        return make;
    }

    public String getProcessor() {
        return processor;
    }

    public int getMemory() {
        return memory;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setMemory(int memory) {
        if (memory >= 4 && memory <= 20) {
            this.memory = memory;
        } else {
            this.memory = 0;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Make: " + make + "\nProcessor: " + processor + "\nMemory: " + memory + "GB\nYear: " + year + "\nPrice: $" + price;
    }

}
