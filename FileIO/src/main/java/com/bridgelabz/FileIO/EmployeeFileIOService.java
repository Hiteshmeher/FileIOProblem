package com.bridgelabz.FileIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmployeeFileIOService {
    public static String PAYROLL_FILE_NAME = "E:\\JAVA2\\day27FileIO\\FileIOProblem\\FileIO\\src\\main\\java\\com\\bridgelabz\\FileIO\\Emppayrollfile.txt";
    public void writeDataToFile(List<EmployeePayRoll> employeePayrollList) {
        StringBuffer empBuffer = new StringBuffer();
        employeePayrollList.forEach(employee -> {
            String employeeDataString = employee.toString().concat("\n");
            empBuffer.append(employeeDataString);
        });
        try {
            Files.write(Paths.get(PAYROLL_FILE_NAME), empBuffer.toString().getBytes());
        }catch (IOException e) {
            System.out.println(e);
        }
    }

    public void printData() {
        try {
            Files.lines(new File( PAYROLL_FILE_NAME ).toPath()).forEach(System.out::println);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}