
package vending.machine;
import java.util.*;
import java.text.DecimalFormat;

public class VendingMachine {

    public static DecimalFormat money = new DecimalFormat("0");
    public static void main(String[] args) {
        // TODO code application logic here
        while(true)
        {
            double price;
            System.out.println("\n" + "Vending Machine");
            System.out.println("1.Candy Bar --- $1.00");
            System.out.println("2.Chips ------- $1.50");
            System.out.println("3.Cookies ----- $2.00");
            System.out.println("4.Soda -------- $2.50");
            System.out.println("5.Water ------- $3.00");
            System.out.println("Choose an item or hit 0 to exit");

            Scanner input = new Scanner(System.in);
            int i = input.nextInt();

            if(i==0)
            {
                System.exit(0);
            }
            else if(i==1)
            {
                System.out.println("1.Candy Bar --- $1.00");
                candy();
            }
            else if(i==2)
            {
                System.out.println("2.Chips ------- $1.50");
                chips();
            }
            else if(i==3)
            {
                System.out.println("3.Cookies ----- $2.00");
                cookies();
            }
            else if(i==4)
            {
                System.out.println("4.Soda -------- $2.50");
                soda();
            }
            else if(i==5)
            {
                System.out.println("5.Water ------- $3.00");
                water();
            }
            else
            {
                System.out.println("That is not a valid selection. Please try again.");
            }
        }
        
    }
    public static void candy()
    {
        double change;
        double price = 1;
        double five,one,quarter,dime,nickel,penny;
        System.out.println("The Vending Machine only accepts coins and 1 or 5 dollar bills");
        
        Scanner input = new Scanner(System.in);
        double i = input.nextDouble();
        
        change = i-price;
        
        System.out.print("Your change is ");
        
        one = change-(change%1);
        change -= one;
        quarter = change-(change%.25);
        change-= quarter;
        dime = change-(change%.1);
        change -= dime;
        nickel = change-(change%.05);
        change -= nickel;
        penny = change-(change%.01);
        change -= penny;
      
        if(one>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/1 + " dollars,");
        }
        if(quarter>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.25 + " quarters,");
        }
        if(dime>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.1 + " dimes,");
        }
        if(nickel>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.05 + " nickels,");
        }
        if(penny>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.01 + " pennies.");
        }
    }
    public static void chips()
    {
        double change;
        double price = 1.50;
        double five,one,quarter,dime,nickel,penny;
        System.out.println("The Vending Machine only accepts coins and 1 or 5 dollar bills");
        
        Scanner input = new Scanner(System.in);
        double i = input.nextDouble();
        
        change = i-price;
        
        System.out.print("Your change is ");
        
        one = change-(change%1);
        change -= one;
        quarter = change-(change%.25);
        change-= quarter;
        dime = change-(change%.1);
        change -= dime;
        nickel = change-(change%.05);
        change -= nickel;
        penny = change-(change%.01);
        change -= penny;
              
        if(one>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/1 + " dollars,");
        }
        if(quarter>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.25 + " quarters,");
        }
        if(dime>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.1 + " dimes,");
        }
        if(nickel>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.05 + " nickels,");
        }
        if(penny>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.01 + " pennies.");
        }
    }
    public static void cookies()
    {
        double change;
        double price = 2;
        double five,one,quarter,dime,nickel,penny;
        System.out.println("The Vending Machine only accepts coins and 1 or 5 dollar bills");
        
        Scanner input = new Scanner(System.in);
        double i = input.nextDouble();
        
        change = i-price;
        
        System.out.print("Your change is ");
        
        one = change-(change%1);
        change -= one;
        quarter = change-(change%.25);
        change-= quarter;
        dime = change-(change%.1);
        change -= dime;
        nickel = change-(change%.05);
        change -= nickel;
        penny = change-(change%.01);
        change -= penny;
      
        if(one>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/1 + " dollars,");
        }
        if(quarter>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.25 + " quarters,");
        }
        if(dime>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.1 + " dimes,");
        }
        if(nickel>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.05 + " nickels,");
        }
        if(penny>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.01 + " pennies.");
        }
    }
    public static void soda()
    {
        double change;
        double price = 2.50;
        double five,one,quarter,dime,nickel,penny;
        System.out.println("The Vending Machine only accepts coins and 1 or 5 dollar bills");
        
        Scanner input = new Scanner(System.in);
        double i = input.nextDouble();
        
        change = i-price;
        
        System.out.print("Your change is ");
        
        one = change-(change%1);
        change = change - one;
        quarter = one-(one%.25);
        change -= quarter;
        dime = change-(change%.1);
        change -= dime;
        nickel = change-(change%.05);
        change -= nickel;
        penny = change-(change%.01);
        change -= penny;
      
        if(one>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/1 + " dollars,");
        }
        if(quarter>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.25 + " quarters,");
        }
        if(dime>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.1 + " dimes,");
        }
        if(nickel>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.05 + " nickels,");
        }
        if(penny>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.01 + " pennies.");
        }
    }
    public static void water()
    {
        double change;
        double price = 3;
        double five,one,quarter,dime,nickel,penny;
        System.out.println("The Vending Machine only accepts coins and 1 or 5 dollar bills");
        
        Scanner input = new Scanner(System.in);
        double i = input.nextDouble();
        
        change = i-price;
        
        System.out.print("Your change is ");
        
        one = change-(change%1);
        change -= one;
        quarter = change-(change%.25);
        change-= quarter;
        dime = change-(change%.1);
        change -= dime;
        nickel = change-(change%.05);
        change -= nickel;
        penny = change-(change%.01);
        change -= penny;
      
        if(one>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/1 + " dollars,");
        }
        if(quarter>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.25 + " quarters,");
        }
        if(dime>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.1 + " dimes,");
        }
        if(nickel>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.05 + " nickels,");
        }
        if(penny>0)
        {
            System.out.print((Double.parseDouble(money.format(one)))/.01 + " pennies.");
        }
    }
    
}
