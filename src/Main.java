public class Main {
    public static void main(String[] args){
        BankCustomer bank = new BankCustomer();
        //حساب جاری
        BankAccount account1 = new TransactionAccount("Fateme", "58869", 1200);
        BankAccount account2 = new TransactionAccount("Ali", "8777420", 500);
        BankAccount account3 = new TransactionAccount("Baran", "255406", 1500);
        // حساب پس انداز
        BankAccount account4 = new SavingAccount("Nima", "888570", 2000);
        BankAccount account5 = new SavingAccount("Arman", "6882058", 2500);
        BankAccount account6 = new SavingAccount("Sina", "88450589", 4000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);
        bank.addAccount(account6);
        //جستجو حساب موجود و ناموجود
        bank.findAccount("58569");
        bank.findAccount("10");
        //اضافه کردن پول
        System.out.println("balance of account3:" + account3.getBalance());
        account3.deposit(600);
        System.out.println("Upadate balance of account3:" + account3.getBalance());
        account5.deposit(-900);
        //سود  و چاپ موجودی
        account2.calculateInterest();
        System.out.println("Update the balance of account2:" + account2.getBalance());
        account6.calculateInterest();
        System.out.println("Update the balance of account6:" + account6.getBalance());
        //سه تا برداشت از هر دو نوع حساب
        account1.withdraw(900);
        account2.withdraw(700);
        account3.withdraw(6000);
        account4.withdraw(800);
        account5.withdraw(3000);
        account6.withdraw(7500);

        System.out.println("Displaying all accounts:");
        bank.showAllBalances();
    }

}