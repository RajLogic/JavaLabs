package Week2.Lab1.Task2;

public class RunPets {

    public static void main( String[] args ) {
        Cat c1 = new Cat("Poop" , 2, "Short");
        System.out.println("cat" + c1);
        c1.eat();
        c1.speak();
        System.out.println("cat" + c1);

        Dog d1 = new Dog("Shit", 4 , "Long");
        System.out.println("dog" + d1);
        d1.eat();
        d1.speak();
        System.out.println("dog" + d1);
    }
}
