import java.util.Scanner;

/*
* calculates the letter grade based on the percentage score you enter. both if else statements
	and switch statements are listed.
*
*@Kyle Lavigne
*@version 1
*
*/

public class KyleLavigne_Proj03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a score from 1 - 100:");
        int score = input.nextInt();
        char grade = ' ';
        
        if(score < 0 || score > 100)
        {
            System.out.println("enter a numeric value (0-100)");
            System.exit(1);
        }
        else
        {
            // if(score < 60)
            // {
                // grade = 'F';
            // }
            // else if(score >= 60 && score < 70)
            // {
                // grade = 'D';
            // }
            // else if(score >= 70 && score < 80)
            // {
                // grade = 'C';
            // }
            // else if(score >= 80 && score < 90)
            // {
                // grade = 'B';
            // }
            // else if(score >= 90 && score < 100)
            // {
                // grade = 'A';
            // }
            
            int tensDigit = score / 10;

            switch (tensDigit) {
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
            }
        }
        
        System.out.println("Your grade is: " + grade);
        
    }
}
