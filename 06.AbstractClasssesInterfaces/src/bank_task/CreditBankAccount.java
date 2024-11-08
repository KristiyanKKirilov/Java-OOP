package bank_task;

public class CreditBankAccount extends BankAccount implements Depositable{
    CreditBankAccount(Client client, double balance, double monthlyInterestRate) {
        super(client, balance, monthlyInterestRate);
    }

    @Override
    public double calculateInterest(int months) {
        if(!(months <= 3 && checkIfClientIsIndividual(this.client)) &&
                !(months <= 2 && checkIfClientIsCompany(this.client))){
            return months * this.monthlyInterestRate;
        }
        else{
            return 0;
        }
    }

    @Override
    public void depositMoney(double amount){
        if(amount > 0){
            this.balance += amount;
        }
        else{
            throw new IllegalArgumentException("Cannot deposit negative amount of money");
        }
    }
}
