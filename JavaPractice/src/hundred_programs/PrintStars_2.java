package hundred_programs;

import java.util.Scanner;

public class PrintStars_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int start =1;
		
		while(start<=n)
		{
			for(int k=1; k<=start; k++)
			{
			System.out.print("*");
			}
			System.out.println();
			
			start++;
		}

	}

}
