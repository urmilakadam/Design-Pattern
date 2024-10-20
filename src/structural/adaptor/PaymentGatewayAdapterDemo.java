package structural.adaptor;

public class PaymentGatewayAdapterDemo {

    public static void main(String[] args) {

        // PayPal Payment
        PayPalPayment payPal = new PayPalPayment();
        PaymentGateway paypalAdapter = new PayPalAdapter(payPal);
        OnlineStore storeWithPayPal = new OnlineStore(paypalAdapter);
        storeWithPayPal.checkout("1000");

        // Razorpay Payment
        RazorpayPayment razorpay = new RazorpayPayment();
        PaymentGateway razorpayAdapter = new RazorpayAdapter(razorpay);
        OnlineStore storeWithRazorpay = new OnlineStore(razorpayAdapter);
        storeWithRazorpay.checkout("2500");
    }
}
