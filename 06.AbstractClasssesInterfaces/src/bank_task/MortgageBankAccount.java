package bank_task;

public class MortgageBankAccount extends BankAccount{
    MortgageBankAccount(Client client, double balance, double monthlyInterestRate) {
        super(client, balance, monthlyInterestRate);
    }

    @Override
    public double calculateInterest(int months) {
        if(!(checkIfClientIsCompany(this.client) && months <= 12) &&
        !(checkIfClientIsIndividual(this.client) && months <= 6)){
            return months * this.monthlyInterestRate;
        }
        else if(checkIfClientIsIndividual(this.client)){
            return 0;
        }
        else{
            return (months * this.monthlyInterestRate) / 2;
        }
    }
}
