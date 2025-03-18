public class  abstract BankAccount {

    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHoldName = accountHoldName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount){

    }
}



