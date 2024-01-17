package io.javaclasses.brainfuck;

/**
 * A Brainfuck command that output the byte at the data pointer
 */
public class OutputCommand implements Command {
    @Override
    public void executeCommand(Memory cells) {
        System.out.println(cells.getCurrentCell());
    }
}
