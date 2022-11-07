package hundred_programs;

import java.util.Scanner;

public class Factorial {
	static int value;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Getting factorial of "+num);
		
		if(num ==0 || num ==1)
		{
			System.out.println("1");
		}
		else {
			
			for(value= 1; num>=1; num--)
			
			{
	             value= value*num; 
			}
			System.out.println(value);
		}

		
		
	}

}
