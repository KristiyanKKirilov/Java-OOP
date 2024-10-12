package bg.tu_varna.sit.a2.f23621649.homework2.task3;

public class Account {
    String accountNumber;
    String currency;
    double balance;

    Account(){}

    Account(String accountNumber, String currency, double balance) {
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }
}

