package io.javaclasses.brainfuck;

import java.util.HashMap;
import java.util.Map;

public class CommandCreator {
    public Map<Character, Command> commands = new HashMap<>();
    public void addCommand(Character symbol, Command command) {
        commands.put(symbol, command);
    }
    public void setupCommands() {
        addCommand('>', new PointerIncrement());
        addCommand('<', new PointerDecrement());
        addCommand('+', new DataIncrement());
        addCommand('-', new DataDecrement());
        addCommand('.', new OutputCommand());
    }
}
