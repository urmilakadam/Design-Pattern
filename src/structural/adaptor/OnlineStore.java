package structural.adaptor;

//Client Class - Online Store
public class OnlineStore {

    private final PaymentGateway paymentGateway;

    public OnlineStore(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(String amount) {
        System.out.println("Initiating checkout process...");
        paymentGateway.processPayment(amount);
        System.out.println("Payment successful!\n");
    }
}
