package bank_task;

public class DepositBankAccount extends BankAccount implements Depositable, Withdrawable{

    DepositBankAccount(Client client, double balance, double monthlyInterestRate){
        super(client, balance, monthlyInterestRate);
    }

    @Override
    public double calculateInterest(int months) {
        return this.balance >= 0 && this.balance < 1000 ? 0 : months * this.monthlyInterestRate;
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

    @Override
    public void withdrawMoney(double amount){
        if(amount <= this.balance){
            balance -= amount;
        }
        else{
            throw new IllegalArgumentException("Cannot withdraw higher amount of available balance");
        }
    }
}
