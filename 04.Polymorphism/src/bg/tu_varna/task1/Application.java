package bg.tu_varna.task1;

public class Application {
    public static void main(String[] args) {
        double[] grades = new double[] {5, 3.5, 4.44, 6.00, 2.20, 3.11};
        double average = Calculator.getAverage(grades);
        System.out.printf("%.2f", average);
    }
}
