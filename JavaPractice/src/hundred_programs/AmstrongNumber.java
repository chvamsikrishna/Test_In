package hundred_programs;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table you want to see");
	    int n = sc.nextInt();
	    
	    int counter =0;
	    int x=n;
	    while(x>=1)
	    {
	    	x=x/10;
	    	counter++;
	    }
	  System.out.println(counter);
	    
	    int sum=1;
	    int value =0;
	    int y=n;
	
	    while(y>=1)
	    	
	    {
	    	
	    	for(int i=1;i<=counter;i++)
	    	{
	    		sum*=y%10;
	    	}
	    	value +=sum;
	    	System.out.println(value);
	    	sum=1;
	    	y/=10;
	    	
	    }
	    if(value == n)
	    {
	    	System.out.println("Given number is armstrong");
	    }
	    else {
	    	System.out.println("Not armstrong number");
	    }
		
	}

}
