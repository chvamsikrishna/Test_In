package patterns;

import java.util.Scanner;

public class Right_RightAngleTriangle {

	public static void main(String[] args) {


		Scanner sc = new Scanner( System.in);
		System.out.println("Enter the lenght fo the base of pyramid");
		int base = sc.nextInt();
		int localBase = base;
		
		for( int i=0; i<base;i++)
		{
			
			for(int j=1;j<=base; j++)
			{
				if(j>=localBase)
				{
				System.out.print('*');
				}
				else
				{
					System.out.print(" ");
				}		
			}
			localBase--;
			System.out.println();
		}
		
		

	}

}
