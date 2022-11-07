package basics;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {

		// Create a 2D array
		// take input values
		// print o/p array
		// try for-each loop.
		// Use Array.toString()
	
		int[][] arr = new int[3][3];
		
		// input
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value ");
		
		for(int i=0; i< arr.length; i++)
		{
			for(int j=0; j<(arr[i].length);j++)
			{
				 
				 arr[i][j]=sc.nextInt();
			}
		}
		
		// output 
		
		for(int row=0; row< arr.length;row++)
		{
			for(int column = 0; column < arr[row].length; column++)
			{
				System.out.print(arr[row][column]+" ");
			}
			System.out.println();
		}
		
	   // 
	
		
		
		
	
		
	}

}
