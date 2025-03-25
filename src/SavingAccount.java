public class SavingAccount extends BankAccount{

    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance){
        super(accountHolderName, accountNumber, initialBalance);
    }

    @Override
    public void calculateInterest() {
        double profit = interestRate * getBalance();
        deposit(profit);
    }

}
