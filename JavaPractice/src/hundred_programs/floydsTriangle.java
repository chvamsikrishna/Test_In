package hundred_programs;

import java.util.Scanner;

public class floydsTriangle {

	public void ftProgram()
	{
		System.out.println("Enter the number of lines to be printed");
		Scanner sc = new Scanner(System.in);
		int numberOfLines = sc.nextInt();
		 int counter =1;
	
		
		
		for(int i=1; i<=numberOfLines;i++)
		{
			
			for (int j=1;j<=i;j++)
			{
				System.out.print(counter);
				counter++;
				
		
			}

		
			System.out.println();
			
		
	
		}

	
		
		
		
	}
	public static void main(String[] args) {

		floydsTriangle ft = new floydsTriangle();
		ft.ftProgram();
		
	}

}
