import java.util.Date;

public class Account {
    private int _id;
    private double _balance;
    private double _annualInterestRate;
    private Date _dateCreated;

    public Account() {
        this(0, 0.0);
    }

    public Account(int id, double balance) {
        this._id = id;
        this._balance = balance;
        this._annualInterestRate = 0.0;
        this._dateCreated = new Date();
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public double get_balance() {
        return _balance;
    }

    public void set_balance(double _balance) {
        this._balance = _balance;
    }

    public double get_annualInterestRate() {
        return _annualInterestRate;
    }

    public void set_annualInterestRate(double _annualInterestRate) {
        this._annualInterestRate = _annualInterestRate;
    }

    public Date get_dateCreated() {
        return _dateCreated;
    }

    public double getMonthlyInterestRate() {
        return _annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return _balance * (getMonthlyInterestRate());
    }

    public void withdraw(double amount) {
        if (amount <= _balance) {
            _balance -= amount;
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public void deposit(double amount) {
        _balance += amount;
    }
}
