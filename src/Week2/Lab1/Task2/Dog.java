package Week2.Lab1.Task2;

public class Dog extends Pet{
    private static final int startHealth = 20;
    private static final String sound = "WOOF MY BOI";

    public Dog() {
        super();
    }
    public Dog(String name, int age) {
        super(name, age, startHealth);
    }
    public Dog(String name, int age, String hair) {
        super(name, age, startHealth, hair);
    }
    public void eat() {
        health += 2;
    }
    public void speak() {
        super.speak(this.sound);
    }
}