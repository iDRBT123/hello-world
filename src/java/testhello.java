package com.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testhello {

    @Test
    void testOutput() {
        String expectedOutput = "Hello, World!";
        String actualOutput = "";

        // Redirect standard output to a string
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        // Call the main method of the HelloWorld class
        HelloWorld.main(new String[] {});

        // Get the actual output from the redirected standard output
        actualOutput = outputStream.toString().trim();

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput);
    }
}

