/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urmsgui;

public class Person {
    private String name;
    private String dept;
    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public String getDept() {
        return dept;
    }

   
    public void setDept(String dept) {
        this.dept = dept;
    }
    

    public Person(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
    
}
