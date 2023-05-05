package Account;

public class SavingsAccount extends Account {
    public SavingsAccount(int accountNo, String name, String address, String phoneNo, String dob, double balance) {
        super(accountNo, name, address, phoneNo, dob, balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        }
    }

    public void fixedDeposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        }
    }
}


