package io.javaclasses.brainfuck;

/**
 * A Brainfuck command that increment the byte at the data pointer by one
 */
public class DataIncrement implements Command {
    @Override
    public void executeCommand(Memory cells) {
        cells.getCells()[cells.getPointer()]++;
    }
}
