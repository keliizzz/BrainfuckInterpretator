package io.javaclasses.brainfuck;

public class Brainfuck {
    public static void main(String[] args) {
        String program = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]" +
                ">>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";
        Compiler compiler = new Compiler();
        compiler.compile(program);
    }
}
