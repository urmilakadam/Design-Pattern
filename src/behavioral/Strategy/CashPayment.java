package behavioral.Strategy;

public class CashPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Will do payment in Cash when received courier with amount: " + amount);
    }
}
