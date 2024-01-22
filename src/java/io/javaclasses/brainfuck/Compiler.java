package io.javaclasses.brainfuck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A compiler that interpret Brainfuck commands to Java commands
 */
public class Compiler {

    public List<Command> compile(String inputProgram) {

        char[] symbols = inputProgram.toCharArray();
        int pointer = 0;
        CommandHandler commandHandler = new CommandHandler();
        List<Command> commands = new ArrayList<>();

        while (pointer < symbols.length) {
            commands.add(commandHandler.handleCommand(symbols[pointer]));
            pointer++;
        }

        return commands;




//        char[] program = inputProgram.toCharArray();
//        List<Command> commands = new ArrayList<>();
//        char[] loopCommands;
//        int pointer = 0;
//
//        while (pointer < program.length) {
//            int count = 1;
//            switch (program[pointer]) {
//                case '>':
//                    count = foldCommand('>', program, pointer);
//                    commands.add(new PointerIncrement());
//                    break;
//                case '<':
//                    count = foldCommand('<', program, pointer);
//                    commands.add(new PointerDecrement());
//                    break;
//                case '+':
//                    count = foldCommand('+', program, pointer);
//                    commands.add(new DataIncrement());
//                    break;
//                case '-':
//                    count = foldCommand('-', program, pointer);
//                    commands.add(new DataDecrement());
//                    break;
//                case '.':
//                    count = foldCommand('.', program, pointer);
//                    commands.add(new OutputCommand());
//                    break;
//                case '[':
//                    loopCommands = Arrays.copyOfRange(program, pointer + 1, findLastOccursionOfCommand(program, ']'));
//                    for (int i = 0; i < loopCommands.length; i++) {
//                        new Compiler().compile(String.valueOf(loopCommands));
//                    }
//                    break;
//                case ']':
//                    commands.add(new LoopCommand(commands));
//                    break;
//            }
//            pointer += count;
//        }

    }

}
