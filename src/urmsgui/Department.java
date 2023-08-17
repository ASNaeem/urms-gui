package urmsgui;

import java.util.ArrayList;

public class Department {

    private String name;
    private String acronym;
    private String school;
    private String departmentOffice;
    private ArrayList<Trimester> courses;

    public Department(String name, String acronym, String school, String departmentOffice) {
        this.name = name;
        this.acronym = acronym;
        this.school = school;
        this.departmentOffice = departmentOffice;
        courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDepartmentOffice() {
        return departmentOffice;
    }

    public void setDepartmentOffice(String departmentOffice) {
        this.departmentOffice = departmentOffice;
    }

    public ArrayList<Trimester> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Trimester> courses) {
        this.courses = courses;
    }

}
