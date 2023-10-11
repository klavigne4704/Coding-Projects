
/**
 * A population calculator which calculates the population in i years based on
	the numbers laid out in the program.
 *
 * @Kyle Lavigne
 * @version 1
 */
public class Population
{
    public static void main(String[] strings) 
    {
        double birthRate = 7.0;
        double deathRate = 13.0;
        double newImmigrant = 45.0;
        
        double currentPopulation = 312032486;
        
        double secondsInYear = 60 * 60 * 24 * 365;
        
        double numBirths = secondsInYear / birthRate;
        double numDeaths = secondsInYear / deathRate;
        double numImmigrants = secondsInYear / newImmigrant;
        
        for(int i = 1; i <= 5; i++)
        {
            currentPopulation += numBirths + numImmigrants - numDeaths;
            System.out.println("Year " + i + " = " + (int)currentPopulation);
        }
    }
}
