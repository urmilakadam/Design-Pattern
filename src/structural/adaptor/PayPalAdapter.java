package structural.adaptor;

// 3. Adapter class to integrate PayPal with PaymentGateway
public class PayPalAdapter implements PaymentGateway{
    private final PayPalPayment payPalPayment;

    public PayPalAdapter(PayPalPayment payPalPayment){
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void processPayment(String amount) {
        payPalPayment.sendPayment("200");
    }
}
