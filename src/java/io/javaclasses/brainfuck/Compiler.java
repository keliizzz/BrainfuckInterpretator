package io.javaclasses.brainfuck;

import java.util.ArrayList;
import java.util.List;

public class Compiler {

    public List<Command> compile(String inputProgram) {

        char[] program = inputProgram.toCharArray();
        List<Command> commands = new ArrayList<>();
        int pointer = 0;

        while (pointer < program.length) {
            int count = 1;
            switch (program[pointer]) {
                case '>':
                    count = foldCommand('>', program, pointer);
                    commands.add(new PointerIncrement());
                    break;
                case '<':
                    count = foldCommand('<', program, pointer);
                    commands.add(new PointerDecrement());
                    break;
                case '+':
                    count = foldCommand('+', program, pointer);
                    commands.add(new DataIncrement());
                    break;
                case '-':
                    count = foldCommand('-', program, pointer);
                    commands.add(new DataDecrement());
                    break;
                case '.':
                    count = foldCommand('.', program, pointer);
                    commands.add(new OutputCommand());
                    break;
                case '[':
                    commands.add(new LoopCommand(commands));
                    char[] innerCommands = new char[1024];
                    int currentLoopCommand = 0;
                    while (program[currentLoopCommand] != ']') {
                        innerCommands[currentLoopCommand] = program[currentLoopCommand];
                        currentLoopCommand++;
                    }
                case ']':
                    commands.add(new LoopCommand(commands));
                    break;
            }
            pointer += count;
        }
        return commands;
    }
    private int foldCommand(char command, char[] commands, int currentPosition) {
        int count = 1;

        if (currentPosition == commands.length - 1)
            return count;

        for (int i = currentPosition + 1; i < commands.length; i++) {
            if (commands[i] == command)
                count++;
            else
                break;
        }
        return count;
    }
}
