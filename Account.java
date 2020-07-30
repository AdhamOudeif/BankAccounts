//*******************************************************
// Account.java
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
import java.util.Scanner;
public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    private static int NumAccounts;
    private static int deposits;
    private static int withdraws;
    private static int totalAmountDeposited;
    private static int totalAmountWithdrawn;
    private static double amountDeposited;
    private static double amountWithdrawn;
    Scanner scan = new Scanner(System.in);
    // Constructor -- initializes balance, owner, and account number
    public Account(double initBal, String owner, long number)
    {
        this.balance = initBal;
        this.name = owner;
        this.acctNum = number;
        NumAccounts++;
    }

    public static int getNumAccounts(){
        return NumAccounts;
    }
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    public void withdraw(double amount)
    {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
        amountWithdrawn = amount;    
        withdraws++;
    }

    // Adds deposit amount to balance
    public void deposit(double amount)
    {
        balance += amount;
        amountDeposited = amount;
        deposits++;
    }

    // Returns balance.
    public double getBalance()
    {
        return balance;
    }

    // Returns the account number
    public long getAcctNumber()
    {
        return acctNum;
    }

    // Returns a string containing the name, account number, and balance.
    public String toString()
    {
        return "the owner of the account is " + this.name + " the initial balance is " + this.balance + " and his account number is " + this.acctNum;
    }

    // Deducts $10 service fee
    public double chargeFee()
    {
        return this.balance = balance - 10;
    }

    // Changes the name on the account 
    public void changeName(String newName)
    {
        newName = scan.nextLine();
        this.name = newName;
        
    }

    public void close(){
        this.name = "closed";
        this.NumAccounts = NumAccounts - 1;
        this.balance = 0;

    }

    public static Account consolidate(Account acct1, Account acct2){
        System.out.println(acct1.name);
        System.out.println(acct2.name);
        System.out.println(acct1.acctNum);
        System.out.println(acct2.acctNum);
        if ((acct1.name.equalsIgnoreCase(acct2.name))&& (acct1.acctNum != acct2.acctNum)){
            Account myaccount = new Account(acct1.balance + acct2.balance, "my Acct", acct2.NumAccounts);

            acct1.close();
            acct2.close();
            return myaccount;

        }
        else{
            System.out.println("cannot consolidate");
            return null;}
    }

    public int getNumDeposits(){
        return deposits; 
    }

    public int getNumWithdraws(){
        return withdraws;
    }

    public double getTotalDeposits(){
        
        totalAmountDeposited += amountDeposited;
        return totalAmountDeposited;   
    }

    public int getTotalWithdrawn(){
        totalAmountWithdrawn += amountWithdrawn;
        return totalAmountWithdrawn;
    }

}