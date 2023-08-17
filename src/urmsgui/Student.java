package urmsgui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Student extends Person{

    public static int getCount() {
        return count;
    }

    public static void setCount(int aCount) {
        count = aCount;
    }
  
    private int id;  
    private double creditsAquired;
    private double cgpa;
    private double gpa;
    private Faculty advisor;
    private ArrayList<Trimester> trimesters;
    private Trimester currentTrimester;
    private final int batch;
    private static int count = 100;
    private final LocalDate date;
    private String adress;

    public Student(String name, String dept, String address) {
        super(name, dept);
        date = LocalDate.now();
        count++;
        this.adress = address;
        this.name = name;
        this.dept = dept;
        batch = batchCalc();
        id = Integer.parseInt(String.valueOf(batch) + deptCode(dept) + String.valueOf(count));
        this.creditsAquired = 0;
        cgpa = 0.0;
        gpa = 0.0;

    }

    public String getName() {
        return getName();
    }

    public void setName(String name) {
        this.setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return getDept();
    }

    public void setDept(String dept) {
        this.setDept(dept);
    }

    public double getCreditsAquired() {
        return creditsAquired;
    }

//    public void setCreditsAquired() {
//        creditsAquired = 0.0;
//
//
//    }
    public ArrayList<Trimester> getCompletedCourses() {
        return trimesters;
    }

    public void setCompletedCourses(ArrayList<Trimester> trimesters) {
        this.trimesters = trimesters;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ArrayList<Trimester> getTrimesters() {
        return trimesters;
    }

    public void setTrimesters(ArrayList<Trimester> trimesters) {
        this.trimesters = trimesters;
    }

    public Trimester getCurrentTrimester() {
        return currentTrimester;
    }

    public void setCurrentTrimester(Trimester currentTrimester) {
        this.currentTrimester = currentTrimester;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    ///----------class behaviours------------------//

    private int batchCalc() {
        int year = date.getDayOfYear();
        int month = date.getMonthValue();
        String batch = String.valueOf(year).substring(2);
        batch += String.valueOf(month / 4);
        return Integer.parseInt(batch);
    }

    private static String deptCode(String dept) {
        String code = null;
        switch (dept) {
            case "BBA":
                code = "011";
            case "MSJ":
                code = "012";
            case "ENG":
                code = "013";
            case "CSE":
                code = "014";
            case "EEE":
                code = "016";
            case "BNG":
                code = "018";
            default:
                System.out.println("Unexpected error occured!");
        }
        return code;
    }

    public double cgpaCalc() {
        creditsAquired = 0.0;
        double cgpa = 0.0;
        int count = 0;
        for (var x : trimesters) {
            creditsAquired += x.getCourses().listIterator().next().getCreditHour();
            cgpa += x.getGpa();
            count++;
        }
        return cgpa / count;
    }

    public void update() {
        if (!trimesters.contains(currentTrimester))
            Collections.addAll(trimesters, currentTrimester);
    }

}
