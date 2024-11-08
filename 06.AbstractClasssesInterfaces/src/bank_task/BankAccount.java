package bank_task;

public abstract class BankAccount implements Bank{
    protected Client client;
    protected double balance;
    protected double monthlyInterestRate;

    BankAccount(Client client, double balance, double monthlyInterestRate){
        this.client = client;
        this.balance = balance;
        this.monthlyInterestRate = monthlyInterestRate;
    }

    boolean checkIfClientIsCompany(Client client){
        return client instanceof Company;
    }
    boolean checkIfClientIsIndividual(Client client){
        return client instanceof Individual;
    }
}
