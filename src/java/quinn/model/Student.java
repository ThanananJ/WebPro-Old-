/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinn.model;

/**
 *
 * @author Mark
 */
public class Student {
    
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String classId;

    public Student(String userName, String firstName, String lastName, String password, String classId) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.classId = classId;
    }

    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String level) {
        this.classId = level;
    }
  
    public boolean equalPassword(String password){
        return password.equals(this.password);
    }
    
    public static void main(String[] args) {
        StudentController sc = new StudentController();
        String username = "00001";
        Student s = sc.findByStudentId(username);
        System.out.println(s.equalPassword("12345"));
    }
}
