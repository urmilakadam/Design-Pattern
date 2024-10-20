package structural.adaptor;

// 1. Target Interface (expected by the application)
public interface PaymentGateway {

    void processPayment(String amount);
}
