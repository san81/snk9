package com.nslabs.entity;



//@Entity
public class Employee {


    //@Id
    private int id;

    //@Column(name="name")
    private String name;

    //@Column(name="salary")
    private float salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}
