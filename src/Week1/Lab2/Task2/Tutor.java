package Week1.Lab2.Task2;

public class Tutor {
    private String staffName;
    private String staffID;

    public Tutor(String staffName, String staffID) {
        this.staffID = staffID;
        this.staffName = staffName;

    }

    public String getStaffName() {
        return staffName;
    }

    public String getStaffID() {
        return staffID;
    }

    public String toString() {
        return "Staff Name: " + staffName + ", Staff ID: " + staffID + "\n";
    }
}
