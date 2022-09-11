package com.bridgelabz.FileIO;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {
    // creating arraylist of EmployeePayRoll class
    ArrayList<EmployeePayRoll> list = new ArrayList<EmployeePayRoll>();
    Scanner input = new Scanner(System.in);
    public void readEmployeeData(){
        // taking employee data from user through scanner input
        EmployeePayRoll employeePayRoll = new EmployeePayRoll();
        System.out.println("Enter employee id");
        employeePayRoll.setId(input.nextInt());
        System.out.println("Enter employee name");
        employeePayRoll.setName(input.next());
        System.out.println("Enter employee salary");
        employeePayRoll.setSalary(input.nextDouble());
        // adding data to array list
        list.add(employeePayRoll);
    }
    public void writeEmployeeData(){
        // Printing all the Employee data stored in array list
        for(EmployeePayRoll employeePayRoll : list){
            System.out.println(employeePayRoll.toString());
        }
    }
}