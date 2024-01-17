package io.javaclasses.brainfuck;

/**
 * A Brainfuck command that increment the data pointer by one
 */
public class PointerIncrement implements Command {
    @Override
    public void executeCommand(Memory cells) {
        if (cells.getPointer() >= cells.getMemorySize() - 1) {
            cells.setPointer(0);
        } else {
            cells.setPointer(cells.getPointer() + 1);
        }
    }
}
