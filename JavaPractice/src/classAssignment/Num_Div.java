package classAssignment;

import java.util.Scanner;

public class Num_Div {
	
	int count;
	Scanner sc;

	public void  divisibleMethods() 
	
	{
		System.out.println("Number of values");
		sc = new Scanner(System.in);
		int lines =sc.nextInt();
		
		System.out.println("Number by which you want to be divide");
		sc= new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("Enter numbers");
		int[] a = new int[lines];
		
		for(int i = 0; i<lines; i++)
		{
			sc = new Scanner(System.in);
			a[i]= sc.nextInt();
		
		}
		
		for(int j = 0; j <a.length;j++)
		{
			if ( a[j]%number == 0)
			{
				count++;
			}
		}
		
		System.out.println("The number of values that can be divided by "+number+ "is " +count);
		
	}

	public static void main(String[] args) {

		Num_Div n = new Num_Div();
		n.divisibleMethods();
		
	}

}
