package epam.EstimationOfHouseConstruction;

import java.util.Scanner;

public class Business {
void input()
{
	System.out.println("Which material do you want to use?");
	System.out.println("Enter your choice:\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material");
	Scanner input=new Scanner(System.in);
	int materialChoice=input.nextInt();
	int automationChoice=0;
	if(materialChoice==3)
	{
		System.out.println("Do you want a fully Automated house?Yes=1,No=0.");
		automationChoice=input.nextInt();
	}
	System.out.println("Enter the total area of house in square feet:");
	float totalHouseArea=input.nextFloat();
	System.out.println("Total Cost of House Construction is Rs: "+totalHouseArea*Database.getCost(materialChoice+automationChoice));
	input.close();
}
}
