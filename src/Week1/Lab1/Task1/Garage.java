package Week1.Lab1.Task1;

public class Garage {

    public static void main(String[] args) {
        System.out.println("Garage");
        Car car0 = new Car("Toyota", "Corolla", 2015);
        System.out.println(car0.toString());
        Car car1 = new Car("Honda", "Civic", 2016);
        System.out.println(car1.toString());
        Car car2 = new Car("Ford", "Fiesta", 2017);
        System.out.println(car2.toString());

    }
}
