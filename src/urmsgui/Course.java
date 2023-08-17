package urmsgui;

import java.util.ArrayList;

public class Course implements GradeCalculation {

    private String title;
    private String code;
    private double creditHour;
    private ArrayList<Course> prerequisites;
    private String content;
    private String departments;
    private double midMarks;
    private double finalMarks;
    private double otherMarks;
    private double totalMarks;
    private String grade;
    private double cg;

    public Course(String title, String code, double creditHour, ArrayList<Course> prerequisites, String content, String departments) {

        this.title = title;
        this.code = code;
        this.creditHour = creditHour;
        this.prerequisites = prerequisites;
        this.content = content;
        this.departments = departments;
        midMarks = 0.0;
        finalMarks = 0.0;
        otherMarks = 0.0;
        totalMarks = 0.0;
        grade = "F";
        cg = 0.0;

    }

    public Course(String title, String code, double creditHour, String content, String departments) {

        this.title = title;
        this.code = code;
        this.creditHour = creditHour;
        this.content = content;
        this.departments = departments;
        totalMarks = 0.0;
        grade = "F";
        cg = 0.0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(double creditHour) {
        this.creditHour = creditHour;
    }

    public ArrayList<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(Course course) {
        this.prerequisites.add(course);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
        grade = gradeCalc();
        cg = cgCalc();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade() {
        this.grade = gradeCalc();
    }

    public double getCg() {
        return cg;
    }

    public void setCg() {
        this.cg = cgCalc();
    }

    @Override
    public final double cgCalc() {
        double cg = 0.0;
        switch (grade) {
            case "A+":
                cg = 4.0;
            case "A":
                cg = 4.0;
            case "A-":
                cg = 3.80;
            case "B+":
                cg = 3.30;
            case "B":
                cg = 3.0;
            case "B-":
                cg = 2.80;
            case "C+":
                cg = 2.50;
            case "C":
                cg = 2.20;
            case "D":
                cg = 1.50;
            default:
                cg = 0.0;
        }
        return cg;
    }

    @Override
    public final String gradeCalc() {
        String grade = "F";
        if (totalMarks >= 50 && totalMarks < 55)
            grade = "D";
        else if (totalMarks >= 55 && totalMarks < 60)
            grade = "C";
        else if (totalMarks >= 60 && totalMarks < 65)
            grade = "C+";

        else if (totalMarks >= 65 && totalMarks < 70)
            grade = "B";
        else if (totalMarks >= 70 && totalMarks < 75)
            grade = "B-";
        else if (totalMarks >= 75 && totalMarks < 80)
            grade = "B";
        else if (totalMarks >= 80 && totalMarks < 85)
            grade = "B+";
        else if (totalMarks >= 85 && totalMarks < 90)
            grade = "A-";
        else if (totalMarks >= 90 && totalMarks < 95)
            grade = "A";
        else if (totalMarks >= 95)
            grade = "A+";
        return grade;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public double getMidMarks() {
        return midMarks;
    }

    public void setMidMarks(double midMarks) {
        this.midMarks = midMarks;
    }

    public double getFinalMarks() {
        return finalMarks;
    }

    public void setFinalMarks(double finalMarks) {
        this.finalMarks = finalMarks;
    }

    public double getOtherMarks() {
        return otherMarks;
    }

    public void setOtherMarks(double otherMarks) {
        this.otherMarks = otherMarks;
    }

}
