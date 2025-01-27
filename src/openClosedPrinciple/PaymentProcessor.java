package openClosedPrinciple;

public class PaymentProcessor {

    public void processPayment(String paymentType) throws IllegalAccessException {
        if (paymentType.equals("CREDIT_CARD")) {
            System.out.println("processing credit card payments..");
        } else if (paymentType.equals("UPI")) {
            System.out.println("processing upi payments..");
        } else if (paymentType.equals("WALLETS")) {
            System.out.println("processing wallets payments..");
        } else {
            throw new IllegalAccessException("unknown payment type");
        }
    }
}

// Bad Example for Practice - Adding new payment methods (eg: cryptocurrency ) requires modifying the processPayment method.
// This increase the risk of bugs and reduces maintainability.