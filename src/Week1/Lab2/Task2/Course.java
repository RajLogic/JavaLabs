package Week1.Lab2.Task2;


public class Course {
    private String code;
    private String title;
    private Tutor tutor;
    private int weeks;

    public Course (String code, String title, int Weeks) {
        this.code = code;
        this.title = title;
        this.weeks = weeks;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }


    public String toString() {
        return "\nCode: " + code + "\nTitle: " + title + "\nTutor: " + tutor + "\nWeeks: " + weeks;
    }
}
