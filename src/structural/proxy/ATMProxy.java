package structural.proxy;

public class ATMProxy implements BankAccount{

    private final RealBankAccount realBankAccount;
    private final String authorizedUser;

    public ATMProxy(RealBankAccount realBankAccount, String authorizedUser){
        this.realBankAccount = realBankAccount;
        this.authorizedUser = authorizedUser;
    }

    @Override
    public void withdraw(double amount, String user) {
        if(user.equals(authorizedUser))
            realBankAccount.withdraw(amount, user);
        else
            System.out.println("Unauthorized access by " + user);
    }
}
