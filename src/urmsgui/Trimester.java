package urmsgui;

import java.util.ArrayList;

public class Trimester {

    public static int getTrimesterCount() {
        return trimesterCount;
    }

    public static void setTrimesterCount(int aTrimesterCount) {
        trimesterCount = aTrimesterCount;
    }

    private int batch;
    private ArrayList<Course> courses;
    private static int trimesterCount;
    private boolean completed = false;
    private double gpa;

    public Trimester(int batch, ArrayList<Course> courses) {
        this.courses = new ArrayList<>();
        this.courses = courses;
        this.batch = batch;
        this.gpa = 0.0;

    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static Course returnCourse(ArrayList<Course> courses, String code) {
        Course course = null;
        for (var x : courses)
            if (x.getCode().equalsIgnoreCase(code))
                course = x;
        return course;
    }

    public double gpaCalc() {
        double credits = 0.0;
        double gpa = 0.00;
        for (var x : courses) {
            gpa += x.getCreditHour() * x.getCg();
            credits += x.getCreditHour();
        }
        return gpa /= credits;
    }

    public void update() {

        gpaCalc();
    }

}
