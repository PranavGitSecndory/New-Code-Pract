package com.map.OneToMany;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {

    @Id
    private int compId;
    private String compName;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Employee> list;

    
    public int getCompId() {
        return compId;
    }
    public void setCompId(int compId) {
        this.compId = compId;
    }
    public String getCompName() {
        return compName;
    }
    public void setCompName(String compName) {
        this.compName = compName;
    }
    public List<Employee> getList() {
        return list;
    }
    public void setList(List<Employee> list) {
        this.list = list;
    }
}