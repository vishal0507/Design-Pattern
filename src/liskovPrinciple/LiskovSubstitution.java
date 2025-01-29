package liskovPrinciple;



public class LiskovSubstitution {

    public static void main(String [] args)
    {
        // Bad Example
        BankAccount badExample = new SavingAccount(10000,5000);
        badExample.withdraw(7000);

        // Good Example
        Account goodExample = new SavingBankAccount(10000,5000);
        goodExample.withdraw(4000);
    }


}
