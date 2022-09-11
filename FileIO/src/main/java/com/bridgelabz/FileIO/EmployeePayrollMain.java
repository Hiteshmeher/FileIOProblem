package com.bridgelabz.FileIO;

import java.util.Scanner;

public class EmployeePayrollMain {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // creating object of EmployeePayrollService class
        EmployeePayrollService emp = new EmployeePayrollService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Employee Payroll System");
        while (true) {
            // taking user input and calling the methods
            System.out.println("Please select \n1.Add Employee Data\n2.View Employee Data\n3.EXIT");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    emp.readEmployeeData();
                    break;
                case 2:
                    emp.writeEmployeeData();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Please enter valid details");
            }
        }
    }
}