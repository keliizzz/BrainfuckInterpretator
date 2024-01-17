package io.javaclasses.brainfuck;

import java.util.ArrayList;
import java.util.List;

/**
 * A Brainfuck command that defines a loop with commands been applied for data in memory
 */
public class LoopCommand implements Command {

    private final List<Command> innerCommands;

    public LoopCommand(List<Command> innerCommands) {
        this.innerCommands = new ArrayList<>(innerCommands);
    }

    @Override
    public void executeCommand(Memory cells) {
        while (cells.getCurrentCell() > 0) {
            for (Command command : innerCommands) {
                command.executeCommand(cells);
            }
        }
    }
}
