package structural.adaptor;

public class RazorpayAdapter implements PaymentGateway{

    private RazorpayPayment razorpayPayment;

    public RazorpayAdapter(RazorpayPayment razorpayPayment) {
        this.razorpayPayment = razorpayPayment;
    }

    @Override
    public void processPayment(String amount) {
        razorpayPayment.razorpayCheckout(Double.parseDouble(amount));
    }
}
