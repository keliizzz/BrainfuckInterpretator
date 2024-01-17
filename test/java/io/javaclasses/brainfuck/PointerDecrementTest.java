package io.javaclasses.brainfuck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointerDecrementTest {

    @Test
    @DisplayName("Test method for decrementing the data pointer by one")
    void executeCommand() {
        Memory cells = new Memory();
        PointerIncrement pointerIncrement = new PointerIncrement();
        pointerIncrement.executeCommand(cells);
        PointerDecrement pointerDecrement = new PointerDecrement();
        pointerDecrement.executeCommand(cells);
        assertEquals(0, cells.getPointer());
    }
}