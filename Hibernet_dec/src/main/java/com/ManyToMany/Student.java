package com.ManyToMany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    private int Stu_RollNo;
    private String Stu_name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> li;

    // Getters and Setters
    public int getStu_RollNo() {
        return Stu_RollNo;
    }

    public void setStu_RollNo(int stu_RollNo) {
        Stu_RollNo = stu_RollNo;
    }

    public String getStu_name() {
        return Stu_name;
    }

    public void setStu_name(String stu_name) {
        Stu_name = stu_name;
    }

    public List<Course> getLi() {
        return li;
    }

    public void setLi(List<Course> li) {
        this.li = li;
    }
}
