package epam.InterestCalculator;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {	
	Scanner input=new Scanner(System.in);
        System.out.println("Enter the principal(in Rs)");
        double principleAmount=input.nextDouble();
        System.out.println("Enter the rate of interest");
        double rateOfInterest=input.nextDouble();
        System.out.println("Enter the time period\n(in Years)");
        double timePeriod=input.nextDouble();
        Database databaseLayerObject=new Database(principleAmount,rateOfInterest,timePeriod);
        Business businessLayerObject=new Business(databaseLayerObject);
        System.out.println("Simple Interest is:Rs "+(float)businessLayerObject.simpleInterest());
        System.out.println("Compound Interest is:Rs "+(float)businessLayerObject.compoundInterest());
   input.close();
    }
}
