package Week2.Lab1.Task2;

public class Pet {
    private String hair;
    private String name;
    private int age;
    protected int  health;

    public Pet() {

    }

    public Pet(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }

    public Pet(String name, int age, int health, String hair){
        this(name, age, health);
        this.hair = hair;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

        public String getHair() {
        return hair;
    }

    public int getHealth() {
        return health;
    }

    public void eat(){

    }

    public void speak(String sound){
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return "\n\nPet\n"  + "Name: " + name + "\nAge: "+ age + "\nHair: " + hair + "\nHealth: "+ health ;
    }
}

