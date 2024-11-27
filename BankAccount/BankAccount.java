package BankAccount;

public class BankAccount
{
    public String accountType;
    public double balance;
//    {
//        accountType = "Savings";
//        balance = 10000;
//    }

    public BankAccount(double balance, String accountType)
    {
        this.balance = balance;
        this.accountType = accountType;
    }

    void printDetails()
    {
        System.out.println("Account Type: " +accountType);
        System.out.println("Balance: " +balance);
    }

}
