package hundred_programs;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
                      
		String s; Float F; int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		s = sc.nextLine();
		System.out.println("Entered name is"+" "+s);
			
		Scanner intValue = new Scanner(System.in);
		System.out.println("Enter int value");
		i = intValue.nextInt();
		System.out.println("Entered value is"+" "+i);
		
		Scanner fValue = new Scanner(System.in);
		System.out.println("Enter Float Number");
		F = fValue.nextFloat();
		System.out.println("Entered value is" +" "+F);
		
		
	}

}
