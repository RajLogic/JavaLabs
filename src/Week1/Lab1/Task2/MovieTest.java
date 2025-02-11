package Week1.Lab1.Task2;

public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.setTitle("");
        m1.setDirector(" ");
        m1.setYear(0);
        m1.setRating(0);
        System.out.println("Movie 1 Details: " + m1.toString());


        Movie m2 = new Movie("", "",10 ,10 );
        System.out.println("Movie 2 Details: " + m2.toString());


        m1.setRating(10);
        System.out.println("Movie 1 After Invalid Rating: " + m1.toString());
    }

}
