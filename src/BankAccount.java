public abstract class BankAccount {

    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount){
        if (amount >= 0) {
            balance += amount;
            System.out.println(amount + "added to your" + accountNumber + "account");
        }
        else
            System.out.println("Wrong amount!");
    }

    public void withdraw(double amount){
        if (amount >= 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println(amount + "deducted from your" + accountNumber + "account");
        }
        else
            System.out.println("Wrong amount!");
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setBalance(balance){
        this.balance = balance;
    }
}



