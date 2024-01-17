package io.javaclasses.brainfuck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointerIncrementTest {

    @Test
    @DisplayName("Test method for incrementing the data pointer by one")
    void executeCommand() {
        Memory cells = new Memory();
        PointerIncrement pointerIncrement = new PointerIncrement();
        pointerIncrement.executeCommand(cells);
        assertEquals(1, cells.getPointer());
    }
}