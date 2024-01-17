package io.javaclasses.brainfuck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A compiler that interpret Brainfuck commands to numerical
 */
public class Compiler {

    public List<Command> compile(String inputProgram) {

        char[] program = inputProgram.toCharArray();
        List<Command> commands = new ArrayList<>();
        char[] loopCommands = new char[1024];
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

                    loopCommands = Arrays.copyOfRange(program, pointer + 1, findLastOccursionOfCommand(program, ']'));
                    for (int i = 0; i < loopCommands.length; i++) {
                        new Compiler().compile(String.valueOf(loopCommands));
                    }
                    break;
                case ']':
                    commands.add(new LoopCommand(commands));
                    break;
            }
            pointer += count;
        }
        return commands;
    }

    private int findLastOccursionOfCommand(char[] commands, char command) {
        int i = 0, pointer = 0;
        while (i < commands.length) {
            if (command == commands[i]) {
                pointer = i;
            }
            i++;
        }
        return pointer;
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
