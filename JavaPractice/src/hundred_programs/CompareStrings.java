package hundred_programs;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
                 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1");
		String s = sc.next();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter String2");
		String s1= sc.next();
		
		if(s.equals(s1))
		{
			System.out.println("Entered strings are same ");
		}
		else {
		System.out.println("Strings are different");
		}		
	}

}

// Also we have CompareTo option to where o/p 
