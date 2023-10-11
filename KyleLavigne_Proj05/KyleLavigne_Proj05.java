import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This is a Mortgage calculator that will calculate your payments, total interest paid,
 * makeup of your monthly payment, and your balance remaining.
 * @Kyle Lavigne
 * @9/24
 */
public class KyleLavigne_Proj05
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] str)
    { 
        char opt;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter the principal to borrow: ");
            int principle = input.nextInt();
            System.out.println("Enter the interest rate in decimal form: ");
            double interestRate = input.nextDouble();
            System.out.println("Enter the term (in years): ");
            int term = input.nextInt();
            term=term*12;
            interestRate=interestRate/12;
            
            double monthlyPayment = principle * (interestRate * Math.pow(1 + interestRate, term))
                / (Math.pow(1 + interestRate, term) - 1);
            double totalInterest = 0.0;
            double monthlyPrinciple = 0.0;
            double monthlyInterest = 0.0;
            double balanceRemaining = principle;
            System.out.println("Month\tPayment\t\t\tPrinciple Payment\tInterest Payment\tTotal Interest\t\tBalance");
            
            
        // for(int x = 1; x <= term; x++)
        // {
            // double balanceRemaining = (Math.pow(1+interestRate,x)*principle)-(((Math.pow(1+interestRate,x)-1)*monthlyPayment)/interestRate);
            // totalInterest = (monthlyPayment*x)-(principle-balanceRemaining);
            // monthlyPrinciple = monthlyPayment - (balanceRemaining*interestRate);
            // monthlyInterest = monthlyPayment - monthlyPrinciple;
            // System.out.println(x+"\t$ "+ df.format(monthlyPayment) + "\t\t$ " + df.format(monthlyPrinciple) + "\t\t$ " + df.format(monthlyInterest) + "  \t\t$ " + df.format(totalInterest) + "\t\t$ " + df.format(balanceRemaining));
        // }
        
        int x=1;
        while(x <= term)
        {
            monthlyPrinciple = monthlyPayment - (balanceRemaining*interestRate);
            monthlyInterest = monthlyPayment - monthlyPrinciple;
            balanceRemaining = (Math.pow(1+interestRate,x)*principle)-(((Math.pow(1+interestRate,x)-1)*monthlyPayment)/interestRate);
            totalInterest = (monthlyPayment*x)-(principle-balanceRemaining);
            System.out.println(x+"\t$ "+ df.format(monthlyPayment) + "\t\t$ " + df.format(monthlyPrinciple) + "\t\t$ " + df.format(monthlyInterest) + "  \t\t$ " + df.format(totalInterest) + "\t\t$ " + df.format(balanceRemaining));
            x++;
        }
        
        System.out.println("Do you want to calculate another mortgage?(y/n) ");
        opt = Character.toLowerCase(input.next().charAt(0));
    }while(opt == 'y');
}
}
