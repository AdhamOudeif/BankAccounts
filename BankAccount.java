
/**
 * Bank Account.java 
 * classes / accessor and mutator methods
 */
import java.text.NumberFormat;
public class BankAccount
{
    private String name;
    private int acctNumber;
    private double balance;
    
    public BankAccount()
    {
        name = "Bob";
        acctNumber = 0;
        balance = 0.0;       
    }

    public BankAccount(String name, int acctNumber, double balance)
    {
        this.name = name;
        this.acctNumber = acctNumber;
        this.balance = balance;
    }

    //accessor methods
    public String getName()
    {
        return name;
    }

    public int getAcctNumber()
    {
        return acctNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public String toString()
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return "Name: " + name + "\nAccount Number: " + acctNumber + "\nBalance: " + nf.format(balance);
    }
    public void String() {
    System.out.println("the balance after charging fee is" + this.balance);
    }
    //mutator methods
    public void changeName(String newName)
    {   
        this.name = newName;
    }

    public void deposit(double amount)
    {
        if (amount < 0)
            System.out.println("Invalid deposit amount!!!!!");
        else
            this.balance += amount;
    }

    public void withdraw(double amount)
    {
        if (amount >= 0 && amount <= balance)
            this.balance -= amount;
        else 
            System.out.println("Invalid withdraw amount!!!!!");
    }

    public boolean equals(BankAccount otherAcct)
    {
        return this.name.equalsIgnoreCase(otherAcct.name) && 
        this.acctNumber == otherAcct.acctNumber &&
        this.balance - otherAcct.balance < 0.001;
    }
    
    
}




