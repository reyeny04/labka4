public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1, 1000.0);
        CheckingAccount checkingAccount = new CheckingAccount(2, 1500.0, 500.0);
        SavingsAccount savingsAccount = new SavingsAccount(3, 2000.0);

        account1.deposit(500.0);
        account1.withdraw(300.0);
        System.out.println("Account 1 Баланс: " + account1.get_balance());
        System.out.println("Account 1 Ежемесячный процент: " + account1.getMonthlyInterest());

        checkingAccount.deposit(200.0);
        checkingAccount.withdraw(2300.0);
        System.out.println("Checking Account Баланс: " + checkingAccount.get_balance());
        System.out.println("Checking Account Ежемесячный процент: " + checkingAccount.getMonthlyInterest());

        savingsAccount.deposit(300.0);
        savingsAccount.withdraw(2500.0);
        System.out.println("Savings Account Баланс: " + savingsAccount.get_balance());
        System.out.println("Savings Account Ежемесячный процент: " + savingsAccount.getMonthlyInterest());
    }
}
