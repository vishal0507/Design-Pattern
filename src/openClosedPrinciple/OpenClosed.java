package openClosedPrinciple;

public class OpenClosed {

    //Client Code
    public static void main(String[] args) throws IllegalAccessException {
        // Bad Practice
        PaymentProcessor oldPractice = new PaymentProcessor();
        oldPractice.processPayment("UPI");

        // Good Practice
        PaymentProcess goodPractice = new PaymentProcess();
        goodPractice.processPayment(new CreditCardPayment());
        goodPractice.processPayment(new UpiPayment());
    }
}


class PaymentProcess {
    void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }
}