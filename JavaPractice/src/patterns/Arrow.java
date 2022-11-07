package patterns;

import java.util.Scanner;

public class Arrow {

	public static void main(String[] args) {

		Scanner sc = new Scanner( System.in);
		System.out.println("Enter the diameter of arrow");
		int base = sc.nextInt();
		int rows = (2*base)-1;
		int level = 0;
	
		for(int i=0;i<rows; i++)
		{
			
			if(i<base)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
				else
				{
					
					for(int j = level ;j <base-1;j++)
					{
						System.out.print("*");
					}
				 level++;
				 System.out.println();
				}
			}
			}
	}

