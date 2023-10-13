public class SavingsAccount extends Account{
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (amount <= get_balance()) {
            set_balance(get_balance() - amount);
        } else {
            System.out.println("Недостаточно средств.");
        }
    }
}
