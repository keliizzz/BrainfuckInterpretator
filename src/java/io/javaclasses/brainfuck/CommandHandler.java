package io.javaclasses.brainfuck;

import java.util.HashMap;
import java.util.Map;

public class CommandHandler {
    public Command handleCommand(char symbol) {
        CommandCreator commandCreator = new CommandCreator();
        commandCreator.setupCommands();

        if (commandCreator.commands.containsKey(symbol)) {
            return commandCreator.commands.get(symbol);
        }
        return null;
    }
}
