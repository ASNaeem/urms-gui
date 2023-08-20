package urmsgui;

/**
 *
 * @author Student
 */
public class Faculty extends Person {

    private String phone;
    private String email;

    public Faculty(String name, Department dept, String phone, String email) {
        super(name, dept, "ulabfaculty123");
        this.phone = phone;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void resetPassword() {
        super.setPassword("ulabfaculty123");
    }

}
