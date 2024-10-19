package behavioral.Strategy;

public class CreditCardPayment implements PaymentStrategy{

    private String cardNum;

    public CreditCardPayment(String cardNum){
        this.cardNum = cardNum;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Doing Payment through credit card with amount: "+ amount);
    }
}
