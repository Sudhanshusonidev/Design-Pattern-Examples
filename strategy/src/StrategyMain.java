import payment.PaymentContext;
import paymentStrategyConcrete.CreditCardPayment;
import paymentStrategyConcrete.UpiPayment;

public class StrategyMain {

    public static void main(String[] args){


        double amount =100;
        PaymentContext paymentContext =new PaymentContext();

        paymentContext.setPaymentStrategy(new UpiPayment("upiId"));
        paymentContext.makePayment(amount);

        paymentContext.setPaymentStrategy(new CreditCardPayment("cardNumber"));
        paymentContext.makePayment(amount);

    }
}
