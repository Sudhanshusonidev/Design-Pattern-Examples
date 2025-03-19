package paymentStrategyConcrete;

import paymentStrategy.PaymentStrategy;

public class UpiPayment implements PaymentStrategy {

    private String upiId;


    public UpiPayment(String upiId){
        this.upiId=upiId;
    }
    @Override
    public void pay(double amount){
        double charges = 10.00;
        System.out.println("Paid an amount of "+(amount+charges)+"for final payment via Upi "+upiId);
    }
}
