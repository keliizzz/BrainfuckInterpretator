package io.javaclasses.brainfuck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataIncrementTest {

    @Test
    @DisplayName("Test method for incrementing the byte at the data pointer by one")
    void executeCommand() {
        Memory cells = new Memory();
        DataIncrement dataIncrement = new DataIncrement();
        dataIncrement.executeCommand(cells);
        assertEquals(1, cells.getCurrentCell());
    }
}