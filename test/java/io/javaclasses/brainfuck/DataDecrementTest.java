package io.javaclasses.brainfuck;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataDecrementTest {
    @Test
    @DisplayName("Test method for decrementing the byte at the data pointer by one")
    void executeCommand() {
        Memory cells = new Memory();
        DataIncrement dataIncrement = new DataIncrement();
        DataDecrement dataDecrement = new DataDecrement();
        dataIncrement.executeCommand(cells);
        dataDecrement.executeCommand(cells);
        assertEquals(0, cells.getCurrentCell());
    }
}