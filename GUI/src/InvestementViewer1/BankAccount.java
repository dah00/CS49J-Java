package InvestementViewer1;

public class BankAccount {
    //double intialBalance;
    double balance;

    public BankAccount(double initial){
        balance = initial;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double interest) {
        balance += interest;
    }
}
