package hundred_programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		String s = Integer.toString(n);
		int lth =s.length();
		String reverse ="";
		
		for(int i=lth-1;i>=0;i--)
		{
			reverse +=s.charAt(i);
		}
		
		int rev =Integer.valueOf(reverse);
		System.out.println(rev);
		
		
	}

}
