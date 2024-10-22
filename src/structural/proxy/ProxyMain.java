package structural.proxy;

public class ProxyMain {

    public static void main(String[] args) {

        BankAccount bankAccount = new ATMProxy(new RealBankAccount(100), "urmila");
        bankAccount.withdraw(10, "urmila");
        bankAccount.withdraw(80, "hacker");
    }

}
