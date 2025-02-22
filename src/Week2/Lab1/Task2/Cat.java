package Week2.Lab1.Task2;

public class Cat extends Pet{
    private static final int startHealth = 10;
    private static final String sound = "MEOW";

    public Cat() {
        super();
    }
    public Cat(String name, int age) {
        super(name, age, startHealth);
    }
    public Cat(String name, int age, String hair) {
        super(name, age, startHealth, hair);
    }
    public void eat() {
        health += 1;
    }
    public void speak() {
        super.speak(this.sound);
    }
}