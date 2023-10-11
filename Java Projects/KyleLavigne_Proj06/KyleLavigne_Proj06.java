import java.util.Scanner;
/**
 * Two functions which will count letters in entire string, or check
 * certain letter you select
 *
 * @Kyle Lavigne
 * @10/1/2023
 */
public class KyleLavigne_Proj06
{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       char choice;
       do {
            System.out.print("Enter a string: ");
            String inputString = input.nextLine();
            
            System.out.print("Enter a char: ");
            char inputChar = input.nextLine().charAt(0);

            int countAllLetters = countLetters(inputString);
            int countSpecificLetter = countLetters(inputString, inputChar);

            System.out.println("The result of calling function int countLetters(String s) is: " + countAllLetters);
            System.out.println("The result of calling function int countLetters(String s, char c) is: " + countSpecificLetter);

            System.out.print("Do you want to do another test? Y/N: ");
            choice = input.nextLine().charAt(0);
        } while (Character.toUpperCase(choice) == 'Y'); 
    }
    public static int countLetters(String s){
       int count = 0;
       for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        return count; 
    }
    public static int countLetters(String s, char c){
        if (!Character.isLetter(c)) {
            return -1;
        }

        int count = 0;
        for (char ch : s.toCharArray()) {
            if (Character.toLowerCase(ch) == Character.toLowerCase(c)) {
                count++;
            }
        }
        return count;
    }
}
