package hundred_programs;

import java.util.Scanner;

public class PrintStars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count = 0;

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();	
			count+=i;
	  }	
		System.out.println(count);
	}

}

