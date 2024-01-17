package io.javaclasses.brainfuck;

/**
 * A Brainfuck command that decrement the byte at the data pointer by one
 */
public class DataDecrement implements Command {
    @Override
    public void executeCommand(Memory cells) {
        cells.getCells()[cells.getPointer()]--;
    }
}
