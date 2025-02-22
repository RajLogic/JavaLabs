package Week2.Lab1.Task1;

public class Person {
    private String firstName;
    private String lastName;
    private String occupation;
    private int age;

    public Person(){
        this.firstName = "";
        this.lastName = "";
        this.occupation = "";
        this.age = 0;
    }
    public Person(String firstName, String lastName, String occupation, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.age = age;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getAge() {
        return age;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
