import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList;

    public BankCustomers() {
        accountsList = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accountsList.add(account);
        System.out.println("Account with number " + account.getAccountNumber() + " added successfully.");
    }

    public void showAllBalances() {
        // نمایش اطلاعات تمام حساب‌ها
        for (BankAccount account : accountsList) {
            System.out.println("Account Holder Name: " + account.getAccountHolderName() +
                    ", Account Number: " + account.getAccountNumber() +
                    ", Your Balance: " + account.getBalance());
        }
    }

    // متد برای پیدا کردن حساب با استفاده از شماره حساب
    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                // حساب پیدا شد، اطلاعات آن را چاپ می‌کنیم
                System.out.println("Account found!");
                System.out.println("Account Holder: " + account.getAccountHolderName() + "   Account Number: " + account.getAccountNumber() + "  Balance: " + account.getBalance());
                return account;
            }
        }
        return null;
    }
}
