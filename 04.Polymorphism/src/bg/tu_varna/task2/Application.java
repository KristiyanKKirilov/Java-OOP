package bg.tu_varna.task2;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            long result = Calculator.arithmeticExpression(args[i]);
            System.out.println(result);
        }
    }
}

