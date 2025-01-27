package singleResponsibility;

// Bad Example
// A single class with multiple responsibilities
public class AccountManager {

    public void createAccount(String accountDetails) {
        System.out.println("Account created with the details : " + accountDetails);
    }

    public void sendNotification(String mail, String message) {
        System.out.println("Sending notification to " + mail + ": " + message);
    }

    public void generateReport(String accountId) {
        System.out.println("Generate report for account id : " + accountId);
    }
}
