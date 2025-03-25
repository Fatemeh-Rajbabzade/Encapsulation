public class TransactionAccount extends BankAccount{
    //حداکثر مقدار قایل برداشت بیشتر از موجودی کاربر
    private final double overDraftLimit = 500;

    public TransactionAccount (String accountHolderName, String accountNumber, double initialBalance){
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest(){
        System.out.println("There is no interest for this account.");
    }

    @Override
    public void withdraw (double amount) {
        if (amount > 0) {
            if (getBalance() + overDraftLimit >= amount) {
                double newBalance = getBalance() - amount;
                setBalance(newBalance);
                System.out.println(amount + " were withdrawal from yout account");
            } else
                System.out.println("Your account balance is not sufficient");
        } else
            System.out.println("Wrong amount!");
    }
        public void setBalance(double balance) {
            this.balance = balance;
        }
}
