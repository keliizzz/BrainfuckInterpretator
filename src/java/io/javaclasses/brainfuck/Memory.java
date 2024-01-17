package io.javaclasses.brainfuck;

/**
 * A space for storing data to apply Brainfuck commands for
 */
public class Memory {
    private byte[] memory = new byte[1024];
    private int pointer = 0;
}
