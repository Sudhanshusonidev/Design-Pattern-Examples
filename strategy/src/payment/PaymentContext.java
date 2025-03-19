package payment;

import paymentStrategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        return this;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(double amount){
        if(paymentStrategy!=null){
            paymentStrategy.pay(amount);
        }else {
            System.out.println("No valid method selected for payment");
        }
    }
}
