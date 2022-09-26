package com.example.javapodstawytesty.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private int id;
    private String name;
    private List<Employee> employeeList;

    public Company(int id, String name) {
        this.id = id;
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public boolean addEmployee(Employee employee){
        return employeeList.add(employee);
    }

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

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


}
