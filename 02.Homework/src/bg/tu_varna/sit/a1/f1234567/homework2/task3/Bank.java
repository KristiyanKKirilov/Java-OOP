package bg.tu_varna.sit.a2.f23621649.homework2.task3;

public class Bank {
    Account[] accounts;

    Bank(){}

    Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    public double calculateAverageBalanceByCurrency(String currency) {
        double totalBalance = 0;
        int count = 0;

        for (Account currentAccount : accounts) {
            if (currentAccount.getCurrency().equalsIgnoreCase(currency)) {
                totalBalance += currentAccount.getBalance();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return totalBalance / count;
    }
}

