package openClosedPrinciple;

public interface PaymentMethod {
    void processPayment();
}

class CreditCardPayment implements PaymentMethod {

    @Override
    public void processPayment() {
        System.out.println("processing credit card payment.");
    }
}

class UpiPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("processing upi payment..");
    }
}

class walletPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("processing wallet payment..");
    }
}

// Add new payment method without changing the existing code

class CryptocurrencyPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("processing crypto currency payment..");
    }
}
