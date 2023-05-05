package Account;

public class LoanAccount extends Account {
    public LoanAccount(int accountNo, String name, String address, String phoneNo, String dob, double balance) {
        super(accountNo, name, address, phoneNo, dob, balance);
    }

    public void payEMI(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }
    }

    public void topUpLoan(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        }
    }

    public void repayment(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        }
    }

{
// Create a SavingsAccount object
SavingsAccount savingsAccount = new SavingsAccount(1234, "John Doe", "123 Main St", "555-555-1234", "01/01/2000", 1000.0);

// Withdraw 500 from the savings account
savingsAccount.withdraw(500.0);

// Deposit 1000 to the savings account
savingsAccount.deposit(1000.0);

// Fixed deposit 5000 in the savings account
savingsAccount.fixedDeposit(5000.0);

// Display the current balance of the savings account
System.out.println("Current balance in savings account: " + savingsAccount.getBalance());

// Create a LoanAccount object
LoanAccount loanAccount = new LoanAccount(5678, "Jane Doe", "456 Oak St", "555-555-5678", "02/02/2000", 10000.0);

// Make an EMI payment of 1000 towards the loan account
loanAccount.payEMI(1000.0);

// Top up the loan account with an additional 5000
loanAccount.topUpLoan(5000.0);

// Make a repayment of 2000 towards the loan account
loanAccount.repayment(2000.0);

// Display the current balance of the loan account
System.out.println("Current balance in loan account: " + loanAccount.getBalance());

}}

