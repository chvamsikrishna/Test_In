package basics;

import java.util.Arrays;

public class Functions_2 {

	public String[] devices(String empName) 
	{
		if(empName.equals("vamsi"))
		{
//			devices[0]="Iphone";
//			devices[2]="Ipad";
//			devices[3]="Mac Book Pro";
//			devices[4]="air pods";
//			devices[5]="apple watch";
			String[] devices = {"Dell","HeadPhones", "Lock","Pro"};
			return devices;
		
		}
		
		else if(empName.equals("sai"))
		{
//			devices[0]="Iphone";
//			devices[2]="Ipad";
//			devices[3]="Mac Book Pro";
//			devices[4]="air pods";
//			devices[5]="apple watch";
			String[] devices = {"Dell","HeadPhones", "Lock","Pro"};
			return devices;
		
		}
		else if(empName.equals("chinnu"))
		{
//			devices[0]="Dell";
//			devices[2]="Headphones";	
			
			String[] devices = {"Dell","HeadPhones"};
			return devices;
			
		}
		else
		{
			System.out.println("not a valid employee");
			return null;

		}
		
	
	}

	public static void main(String[] args) {
 
		Functions_2 f = new Functions_2();
		String[] dev =f.devices("vamsi");
		System.out.println(dev.length);
		System.out.println(Arrays.toString(dev));
		
		
		
		
	
		

	}

}
