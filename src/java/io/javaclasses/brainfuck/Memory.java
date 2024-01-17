package io.javaclasses.brainfuck;

/**
 * A space for storing data to apply Brainfuck commands for
 */
public class Memory {
    private final int memorySize = 1024;
    private byte[] cells = new byte[memorySize];
    private int pointer = 0;

    public int getMemorySize() {
        return memorySize;
    }

    public byte[] getCells() {
        return cells;
    }

    public int getPointer() {
        return pointer;
    }

    public void setPointer(int pointer) {
        this.pointer = pointer;
    }

    public byte getCurrentCell() {
        try {
            return cells[pointer];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
