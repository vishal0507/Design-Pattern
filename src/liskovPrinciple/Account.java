package liskovPrinciple;

// To fix ensure the SavingAccount does not violate the behaviour expected from Account. Instead of throwing unexpected
// exceptions, handle the withdrawl limit gracefully in a way of along with base class behaviour,
public class Account {
    double balance;

    public Account(double balance) {
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


public class SavingBankAccount extends Account {
    double withdrawalLimit;

    public SavingBankAccount(double balance, double withdrwalLimit) {
        super(balance);
        this.withdrawalLimit = withdrwalLimit;
    }

    @override
    public void withdraw(double amount) {
        // saving account adds a restrictions; withdrawl must not exceed the limit
        if (amount > withdrawalLimit) {
            System.out.println("withdrawl failed : Amount exceeds withdrawl limit");
        } else {
            super.withdraw(amount);
        }
    }

}
