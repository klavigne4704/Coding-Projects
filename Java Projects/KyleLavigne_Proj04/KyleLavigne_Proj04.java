import java.util.Scanner;

/*
* Converts binary numbers to decimal using the built in and custom methods.
*
*@Kyle Lavigne
*@version 1
*
*/

public class KyleLavigne_Proj04
{
    // Custom Logic
   public static int binaryToInteger(String binary) {
    char[] numbers = binary.toCharArray();
    int result = 0;
    for(int i=numbers.length - 1; i>=0; i--)
        if(numbers[i]=='1')
            result += Math.pow(2, (numbers.length-i - 1));
    return result;
}
    
   public static void main(String[] args)
   {
       // Built-in Logic
       String binaryString = "1010";
       int decimal = Integer.parseInt(binaryString, 2);
       System.out.println("Decimal of 1010 is: " + decimal);
       
       //Custom Logic
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.nextLine();

        int decimalResult = binaryToInteger(binaryInput);

        System.out.println("Decimal equivalent of " + binaryInput + " is: " + decimalResult);
    }
}
