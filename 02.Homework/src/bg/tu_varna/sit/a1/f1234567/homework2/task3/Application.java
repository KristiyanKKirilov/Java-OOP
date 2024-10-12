package bg.tu_varna.sit.a2.f23621649.homework2.task3;

public class Application {
    public static void main(String[] args) {
        Account firstAccount = new Account("BG712313JAS", "BGN", 8000.00);
        Account secondAccount = new Account("BGFASFJA121", "EUR", 2500.00);
        Account thirdAccount = new Account("BGF7885SFJA", "EUR", 6500.00);
        Account fourthAccount = new Account("BGASDASJ123", "BGN", 9010.00);
        Account[] accounts = {firstAccount, secondAccount, thirdAccount, fourthAccount};
        Bank bank = new Bank(accounts);

        double averageEurBalance = bank.calculateAverageBalanceByCurrency("EUR");
        System.out.println("Average EUR balance: " + averageEurBalance);

        double averageBgnBalance = bank.calculateAverageBalanceByCurrency("BGN");
        System.out.println("Average BGN balance: " + averageBgnBalance);
    }
}

