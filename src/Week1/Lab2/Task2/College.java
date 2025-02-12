package Week1.Lab2.Task2;



public class College {
    public static void main(String[] args) {
        Tutor t1 = new Tutor("rajvansh", "1000");

        Course c1 = new Course("100", "title", 3);
        Course c2 = new Course("101", "IDK", 2);

        c1.setTutor(t1);
        c2.setTutor(t1);

        System.out.println("Classes");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("\nTutors");
        System.out.println(t1.toString());





    }
}
