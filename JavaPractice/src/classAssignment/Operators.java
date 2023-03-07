package classAssignment;

import java.util.Scanner;

class Operators {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the number of test cases need to be tested");
		 int testcases = sc.nextInt();
		 
		    for(int i =0; i < testcases; i++)
		    {
		    	System.out.println("Enter first value");
		    	int value1 = sc.nextInt();
		    	System.out.println("Enter Second value");
		    	int value2 = sc.nextInt();
		    	
		    	if(value1>value2)
		    	{
		    		System.out.println(">");
		    	}
		    	else if(value1<value2)
		    	{
		    		System.out.println("<");
		    	}
		    	else if(value1==value2)	
		    	{
		    		System.out.println("=");
		    	}
		    	
		    	
		    }

	}

}
