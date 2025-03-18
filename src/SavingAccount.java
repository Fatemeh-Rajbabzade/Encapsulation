public class SavingAccount extends BankAccount{

    private final double interestRate = 0.03;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance){
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        double profit = interestRate * getBalance();
        deposit(profit);
    }

}
