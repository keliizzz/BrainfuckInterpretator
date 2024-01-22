package io.javaclasses.brainfuck;

import java.util.List;

/**
 * An interpretator of Brainfuck language
 */
public class Brainfuck {

    public static void main(String[] args) {

        String program = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";
        Compiler compiler = new Compiler();
        Memory memory = new Memory();
        List<Command> commandList = compiler.compile(program);
        for (Command command : commandList) {
            command.executeCommand(memory);
        }
    }
}
