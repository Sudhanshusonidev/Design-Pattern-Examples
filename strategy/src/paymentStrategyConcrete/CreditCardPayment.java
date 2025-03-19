package paymentStrategyConcrete;

import paymentStrategy.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount){
    System.out.println("The amount paid is $"+amount+" with card number "+cardNumber);
    }
}
