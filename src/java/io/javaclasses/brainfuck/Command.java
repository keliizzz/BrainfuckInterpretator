package io.javaclasses.brainfuck;

/**
 * An abstract foundation for Brainfuck commands
 */
public interface Command {
    void executeCommand(Memory memory);
}
