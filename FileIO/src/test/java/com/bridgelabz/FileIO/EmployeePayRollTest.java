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
    private static String HOME = "E:\\JAVA2\\day27FileIO\\FileIOProblem\\FileIO\\src";
    private static String PLAY_WITH_NIO = "TempPlayGround";

    @Test
    public void givenPathWhenCheckedThenConfirm() throws IOException {
        /**
         * Check File exists
         */
        Path homePath = Paths.get(HOME);
        Assertions.assertTrue(Files.exists(homePath));
        System.out.println(homePath);

        /**
         * Delete file and check file does not exist
         */
        Path playPath = Paths.get(HOME + "/" + PLAY_WITH_NIO);
        if (Files.exists(playPath))
            EmployeePayrollService.deleteFiles(playPath.toFile());
        assertTrue(Files.notExists(playPath));

        /**
         * Create a directory
         */
        Files.createDirectory(playPath);
        assertTrue(Files.exists(playPath));

        /**
         * Create File
         */
        IntStream.range(1, 10).forEach(cntr -> {
            Path tempFile = Paths.get(playPath + "/temp" + cntr);
            assertTrue(Files.notExists(tempFile));
            try {
                Files.createFile(tempFile);
            } catch (IOException e) {
            }
            assertTrue(Files.exists(tempFile));
        });

        /**
         * List files, directories as well as files with extensions
         */
        System.out.println("Files.list");
        Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
        System.out.println("Files.newDirectory");
        Files.newDirectoryStream(playPath).forEach(System.out::println);
        System.out.println("Files.newDirectory with temp");
        Files.newDirectoryStream(playPath, path -> path.toFile().isFile() && path.toString().contains("temp"))
                .forEach(System.out::println);
    }
}