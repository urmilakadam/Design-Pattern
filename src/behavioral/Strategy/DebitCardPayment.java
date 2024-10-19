package behavioral.Strategy;

public class DebitCardPayment implements PaymentStrategy{

    private String cardNum;

    public DebitCardPayment(String cardNum){
        this.cardNum = cardNum;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Doing Payment through Debit card with amount: "+ amount);
    }
}
