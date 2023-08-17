/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urmsgui;

/**
 *
 * @author Student
 */
public class Faculty extends Person {
    
    private String phone;
    private String email;

    public Faculty(String phone, String email, String name, String dept) {
        super(name, dept);
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
    
    
}
