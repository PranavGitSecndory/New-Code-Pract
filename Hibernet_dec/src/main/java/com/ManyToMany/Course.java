package com.ManyToMany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    private int Cou_RollNo;
    private String Cou_name;

    @ManyToMany(mappedBy = "li")
    private List<Student> students;

    // Getters and Setters
    public int getCou_RollNo() {
        return Cou_RollNo;
    }

    public void setCou_RollNo(int cou_RollNo) {
        Cou_RollNo = cou_RollNo;
    }

    public String getCou_name() {
        return Cou_name;
    }

    public void setCou_name(String cou_name) {
        Cou_name = cou_name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
