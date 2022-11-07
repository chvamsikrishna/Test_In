package hundred_programs;

import java.util.Scanner;

public class While_break {

	public static void main(String[] args) {
           
		int n;
	    System.out.println("Enter the item");
			Scanner sc = new Scanner(System.in);
			 n = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Pizza");
			System.out.println("cost is 100");
			break;
		case 2:
			System.out.println("Burger");
			System.out.println("cost is 80");
			break;
		case 3:
			System.out.println("Taco");
			System.out.println("cost is 120");
			break;
		case 4:
			System.out.println("Meal");
			System.out.println("cost is 150");
			break;
		default:
			System.out.println("invalid input");
		
		}
		
		while(n>0)
		{
			if(n==5)
			{
				System.out.println("item list ended");
				break;
			}
			n++;
			System.out.println(n);
		}
		
		
	
	}

}
