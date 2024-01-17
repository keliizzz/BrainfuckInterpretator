package io.javaclasses.brainfuck;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OutputCommandTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    @DisplayName("Test method for outputting the byte at the data pointer")
    void executeCommand() {
        Memory cells = new Memory();
        DataIncrement dataIncrement = new DataIncrement();
        dataIncrement.executeCommand(cells);
        OutputCommand outputCommand = new OutputCommand();
        outputCommand.executeCommand(cells);
        assertEquals("1", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}