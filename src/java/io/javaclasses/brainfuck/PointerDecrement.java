package io.javaclasses.brainfuck;

/**
 * A Brainfuck command that decrement the data pointer by one
 */
public class PointerDecrement implements Command {
    @Override
    public void executeCommand(Memory cells) {
        if (cells.getPointer() == 0) {
            cells.setPointer(cells.getMemorySize() - 1);
        } else {
            cells.setPointer(cells.getPointer() - 1);
        }
    }
}
