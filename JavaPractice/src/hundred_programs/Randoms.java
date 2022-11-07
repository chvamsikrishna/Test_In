package hundred_programs;

import java.util.*;


public class Randoms {

	public static void main(String[] args) {
	
		Random r = new Random();
		int value = 0;
		
		for(int i=0; i<1; i++)
		{
			value = r.nextInt(100000);
			System.out.println(value);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter OTP");
		int otp = sc.nextInt();
		
		if(value == otp)
		{
			System.out.println("Entered correct OTP");
		}
		else
		{
			System.out.println("Wrong otp");
		}
		
		
		

	}

}
