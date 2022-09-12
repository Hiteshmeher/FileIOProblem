package com.bridgelabz.FileIO;

public class EmployeePayRoll {
    private int id;
    private String name;
    private double salary;

    public EmployeePayRoll(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}