package hundred_programs;

import java.util.Scanner;

public class Palindrome {
	
	String value ="";
    int counter=0;
    
	public void value()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	    int n = sc.nextInt();
	    int x=n;
	    
	    while(x>=1)
	    {
	    	x/=10;
	    	counter++;
	    }
	    
	    x=n;
	    
//	    System.out.println(counter);
	    
	    while(x>=1)
	    for(int i=1;i<=counter;i++)
	    {
	    	value+= Integer.toString(x%10);
//	    	System.out.println(value);
	    	x=x/10;
	    }
	    
	    System.out.println(value);
	    
	    int valueCheck = Integer.parseInt(value);
	    
	    if(valueCheck == n)
	    {
	    	System.out.println("Given number is a palindrome");
	    }
	    else {
	    	System.out.println("it's not a palindrome");
	    }
	    
	}
	
	

	public static void main(String[] args) {
		
		Palindrome obj =new Palindrome();
		obj.value();
		
		

	}

}
