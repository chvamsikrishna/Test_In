package patterns;

import java.util.Scanner;

public class Left_RightAngleTringle {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner( System.in);
	System.out.println("Enter the lenght fo the base of pyramid");
	int base = sc.nextInt();
	
	for(int i=0;i<base;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
			
	}
	

	}

}
