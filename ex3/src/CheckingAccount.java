public class CheckingAccount extends Account{
    private double _overdraftLimit;

    public CheckingAccount() {
        super();
        _overdraftLimit = 0.0;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this._overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount <= (get_balance() + _overdraftLimit)) {
            set_balance(get_balance() - amount);
        } else {
            System.out.println("Превышен лимит");
        }
    }
}
