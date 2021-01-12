package BankAccount;

public class WithdrawRunnable implements Runnable{

    private static final int DELAY = 1;
    private BankAccount account;
    private double amount;
    private int count;

    /*
        Constructs a withdraw runnable
        @param anAccount the account from which to withdraw moeny
        @param anAccount the amount to withdraw in each repetition
        @param aCount the number of repetition
     */
    WithdrawRunnable(BankAccount anAccount, double anAmount, int aCount){
        account = anAccount;
        amount = anAmount;
        count = aCount;
    }

    @Override
    public void run() {
        try{
            for (int i=1; i<=count; i++){
                account.withdraw(amount);
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException exception){}
    }
}
