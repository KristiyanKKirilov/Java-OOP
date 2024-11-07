package bg.tu_varna.task2;

public class Calculator {
    public static long arithmeticExpression(String expression) {
        long result = 0;
        int i = 0;
        String[] currentCommands = expression.split(" ");

        while (currentCommands.length > i && !currentCommands[i].equals("END") && !currentCommands[i].equals("EN")) {
            String currentCommand = currentCommands[i];

            switch (currentCommands[i]) {
                case "INC": {
                    int operandOne = Integer.parseInt(currentCommands[i + 1]);
                    result += operandOne + 1;
                    i+=2;
                    break;
                }
                case "DEC": {
                    int operandOne = Integer.parseInt(currentCommands[i + 1]);
                    result += operandOne - 1;
                    i+=2;
                    break;
                }
                case "ADD": {
                    int operandOne  = Integer.parseInt(currentCommands[i + 1]);
                    int operandTwo = Integer.parseInt(currentCommands[i + 2]);
                    result += operandOne + operandTwo;
                    i+=3;
                    break;
                }
                case "MLA": {
                    int operandOne  = Integer.parseInt(currentCommands[i + 1]);
                    int operandTwo = Integer.parseInt(currentCommands[i + 2]);
                    result += (long)operandOne * operandTwo;
                    i+=3;
                    break;
                }
                default:
                    break;
            }
        }
        return result;
    }
}

