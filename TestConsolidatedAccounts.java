import java.util.Scanner;
public class TestConsolidatedAccounts{

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Can I have three names please? \n Enter:");
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        String name3 = scan.nextLine();

        Account first = new Account (100, name1,1);
        Account second = new Account(100, name2,2);
        Account third = new Account(100, name3, 3);
        first.toString();
        second.toString();
        third.toString();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        first.close();

        Account newaccount = Account.consolidate(second, third);

        first.toString();
        second.toString();
        third.toString();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        
        System.out.println(newaccount);

        
    }

}