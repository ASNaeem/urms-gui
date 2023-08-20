package urmsgui;

public abstract class Person {

    private String name;
    private Department dept;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Person(String name, Department dept, String password) {
        this.name = name;
        this.dept = dept;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void resetPassword();

}
