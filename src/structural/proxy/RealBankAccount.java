package structural.proxy;

public class RealBankAccount implements BankAccount{

    private double balance;

    public RealBankAccount(double balance){
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount, String user) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(user + " withdrew rs " + amount + ". Remaining balance: rs " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
