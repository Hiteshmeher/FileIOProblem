package com.bridgelabz.FileIO;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeePayRollTest {
    private static String FILE_PATH = "E:\\JAVA2\\day27FileIO\\FileIOProblem\\FileIO\\src";
    private static String PERFORM_FILE_IO = "Test_IO_Operations";

    @Test
    public void givenPathChecked_ThenConfirm() throws IOException {
        // check if file exists
        Path homePath = Paths.get(FILE_PATH);
        Assertions.assertTrue(Files.exists(homePath));


        // Delete file and check file not exist
        Path operationsPath = Paths.get(FILE_PATH+"/"+PERFORM_FILE_IO);
        if (Files.exists(operationsPath))  {
            EmployeeFile.deleteFiles(operationsPath.toFile());
        }
        Assertions.assertTrue(Files.notExists(operationsPath));


        // Create directory
        Files.createDirectory(operationsPath);
        Assertions.assertTrue(Files.exists(operationsPath));


        // Create file
        IntStream.range(1,10).forEach(i->{
            Path testFile = Paths.get(operationsPath+"/test"+i);
            Assertions.assertTrue(Files.notExists(testFile));
            try{
                Files.createFile(testFile);
            }catch(IOException e){}
            Assertions.assertTrue(Files.exists(testFile));
        });

        // List Files, Directories as well as Files with extension
        Files.list(operationsPath).filter(Files::isRegularFile).forEach(System.out::println);
        Files.newDirectoryStream(operationsPath).forEach(System.out::println);
        Files.newDirectoryStream(operationsPath, path -> path.toFile().isFile() &&
                path.toString().startsWith("test")).forEach(System.out::println);

    }
}