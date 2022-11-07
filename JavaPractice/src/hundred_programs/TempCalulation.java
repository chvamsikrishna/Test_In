package hundred_programs;

import java.util.Scanner;

public class TempCalulation {

	public static void main(String[] args) {

		 String tempField;
		 Float temp;
		 
		 
		 Scanner sc = new Scanner ( System.in);
		 System.out.println("Select the tempField you want to check with");
		 tempField = sc.next();
		 System.out.println("Temp Field you entered is" +tempField);
		 
		 Scanner i = new Scanner( System.in);
		 System.out.println("Enter temp value");
		 temp = i.nextFloat();
		 System.out.println("Temperature entered is"+" "+ temp);
		 
		 switch(tempField.toLowerCase())
		 {
		 case "farenhiet":
			 System.out.println("Temp in Celuis is" +" "+(temp-32)*5/9 );
			 break;
		 case "celcius":
			 System.out.println("Temp in farenhiet is" +" "+(temp*9/5)+32 );
			 break;
		 default:
			System.out.println("Invalid temperature field input");
		 }
		 
	             
		 
		 
				
		  
		 
		 
		
	}

}
