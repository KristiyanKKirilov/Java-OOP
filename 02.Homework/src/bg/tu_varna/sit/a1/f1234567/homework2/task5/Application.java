package bg.tu_varna.sit.a2.f23621649.homework2.task5;

public class Application {
    public static void main(String[] args) {
        SoftDrink firstDrink = new SoftDrink("Coca-Cola", "2024-12-16", 1.5, 10.6);
        SoftDrink secondDrink = new SoftDrink("Pepsi", "2025-01-23", 1.5, 11.0);
        SoftDrink thirdDrink = new SoftDrink("Fanta", "2025-11-21", 1.5, 9.5);
        SoftDrink fourthDrink = new SoftDrink("Coca-Cola", "2024-12-16", 1.5, 10.6);
        SoftDrink fifthDrink = new SoftDrink("Pepsi", "2025-01-23", 1.5, 11.0);
        SoftDrink sixthDrink = new SoftDrink("Coca-Cola", "2024-12-16", 1.5, 10.6);

        SoftDrink[] drinks = {firstDrink, secondDrink, thirdDrink, fourthDrink, fifthDrink, sixthDrink};

        SoftDrinkShelf softDrinkShelf = new SoftDrinkShelf(drinks);

        SoftDrink mostFrequentDrink = softDrinkShelf.getMostFrequentSoftDrink();
        if (mostFrequentDrink != null) {
            System.out.println("Most frequent soft drink:");
            System.out.println(mostFrequentDrink.toString());
        } else {
            System.out.println("No drinks on the shelf.");
        }
    }
}
