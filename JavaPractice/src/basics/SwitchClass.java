package basics;

public class SwitchClass {
	
	public void envSelection()
	{
        String environmentName = "prod";
		
		switch(environmentName.toLowerCase())
		{
		case "qa"  : System.out.println("Move to QA env");
		             break;
		case "dev" : System.out.println("Move to dev env");
		             break;
		case "prod": System.out.println("Move to Prod env");
		             break;
		case "uat" : System.out.println("Move to UAT env");
		             break;
		default: System.out.println("No env selected");
		             break;
		}
	}
	
	public void days()
	{
		String day = "Monday";
		switch ( day.toLowerCase())
		{
		case "monday","tuesday", "wednesday", "thrusday","friday":
			System.out.println("Weekday");
		    break;
		case "saturday", "sunday":
			System.out.println("Weekend");
		    break;
		default: System.out.println("Not a valid day");
		}
	}
	

	public static void main(String[] args) 
	{
		SwitchClass sw = new SwitchClass();
		sw.envSelection();
		sw.days();
	}
}
