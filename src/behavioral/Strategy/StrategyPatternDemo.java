package behavioral.Strategy;

public class StrategyPatternDemo {

    public static void main(String[] args) {

        ShoppingCart shoppingCart1 = new ShoppingCart(new CreditCardPayment("1234 2345 6789"));
        shoppingCart1.checkout(200);

        ShoppingCart shoppingCart2 = new ShoppingCart(new DebitCardPayment("1234 2345 6789"));
        shoppingCart2.checkout(100);

        ShoppingCart shoppingCart3 = new ShoppingCart(new CashPayment());
        shoppingCart3.checkout(300);
    }
}
