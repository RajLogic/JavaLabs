package Week1.Task1;

public class Car {
    static int nextID = 1;

    private String make;
    private String model;
    private int year;
    private int carID;
    //Car.nextID ---- need to make next id a number which increments

    public Car(String make,String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.carID = nextID ++;

    }

    public Car(){
        carID = nextID++;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public int getCarID() {
        return carID;
    }

    public String toString(){
        return "\nCar ID: " + carID + " \nMake: " + make + " \nModel: " + model + " \nYear: " + year;
    }
}
