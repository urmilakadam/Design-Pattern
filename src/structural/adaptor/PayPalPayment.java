package structural.adaptor;

// 2. Adaptee (new payment provider with a different interface)
public class PayPalPayment {

    public void sendPayment(String amount) {
        System.out.println("Payment of $" + amount + " processed via PayPal.");
    }

}
