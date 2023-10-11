import java.util.Scanner;
import java.util.Random;

/*
* Calculates change in quarters, dimes, nickels, and pennies based on the amount you enter
*
*@Kyle Lavigne
*@version 1
*/

public class Change
{
    public static void main(String[] args)
    {
        //User Input
        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter a change between 1 and 99 cents:");
        //int cents = input.nextInt();
        
        //Random Number
        Random random = new Random();
        int cents = random.nextInt(99) + 1;
        
        int numQuarters = cents / 25;
        int numDimes = (cents % 25) / 10;
        int numNickels = ((cents % 25) % 10) / 5;
        int numPennies = ((cents % 25) % 10) % 5;
        
        System.out.println("You have " + cents + " cents. That is:");
        System.out.println(numQuarters + " quarters");
        System.out.println(numDimes + " dimes");
        System.out.println(numNickels + " nickels");
        System.out.println(numPennies + " pennies");
    }
}
