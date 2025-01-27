package singleResponsibility;

public class SingleResponsibilityPrinciple {
}

// Splitting responsibility into seperate classes
class AccountService {
    public void createAccount(String accountDetails) {
        System.out.println("Account created with the details : " + accountDetails);
    }
}


class NotificationService {
    public void sendNotification(String mail, String message) {
        System.out.println("Sending notification to " + mail + ": " + message);
    }
}

class reportGenerator {
    public void generateReport(String accountId) {
        System.out.println("Generate report for account id : " + accountId);
    }
}