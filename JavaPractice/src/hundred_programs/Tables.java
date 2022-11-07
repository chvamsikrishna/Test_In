package hundred_programs;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table you want to see");
	    int n = sc.nextInt();
	    
	    for(int i=1;i<=10;i++)
	    {
	    	System.out.println(n+ "*"+ i+ " = "+ (n*i));
	    }
		 
	}

}
