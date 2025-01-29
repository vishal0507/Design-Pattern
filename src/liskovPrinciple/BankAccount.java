package liskovPrinciple;

// Bad Example
public class BankAccount {

    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient Balance");
        }
    }
}

public class SavingAccount extends BankAccount {
    double withdrawalLimit;

    public SavingAccount(double balance, double withdrwalLimit) {
        super(balance);
        this.withdrawalLimit = withdrwalLimit;
    }

    @override
    public void withdraw(double amount) {
        // saving account adds a restrictions; withdrawl must not exceed the limit
        if (amount > withdrawalLimit) {
            throw new UnsupportedOperationException("Withdrawl amount exceed!");
        }
    }

}

// Key Problem : If client expects any BankAccount object to withdraw money as long as there is sufficient balance,
// using SavingsAccount will break the functionality because it introduces extra rules(withdraw limit).