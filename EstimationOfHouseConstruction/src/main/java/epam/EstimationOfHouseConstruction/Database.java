package epam.EstimationOfHouseConstruction;

public class Database {
static int standardMaterial=1200,aboveStandardMaterial=1500;
static int highStandardMaterial=1800,highStandardAutomation=2500;
static float getCost(int choice)
{
	switch(choice)
	{
	case 1:
		return standardMaterial;
	case 2:
		return aboveStandardMaterial;
	case 3:
		return highStandardMaterial;
	case 4:
		return highStandardAutomation;
	default:
		System.out.println("You have entered a wrong choice");
		System.exit(0);
		return choice;
		
	}
	
}

}
