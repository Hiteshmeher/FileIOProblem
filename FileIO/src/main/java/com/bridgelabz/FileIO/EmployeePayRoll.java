package com.bridgelabz.FileIO;

public class EmployeePayRoll {
    private int id;
    private String Name;
    private Double salary;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {

        this.Name = name;
    }

    public Double getSalary() {

        return salary;
    }

    public void setSalary(Double salary) {

        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayRoll{" + "id=" + id + ", Name='" + Name + '\'' + ", salary=" + salary + '}';
    }
}
