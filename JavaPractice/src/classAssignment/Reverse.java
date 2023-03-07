package classAssignment;

import java.util.Scanner;

public class Reverse {

	//public void test()
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the number of test cases need to be tested");
		 int testcases = sc.nextInt();
		 	
		 for(int i =0; i<testcases; i++)
		 {
			 System.out.println("Enter the value");
			       int j = sc.nextInt();
			       String value = Integer.toString(j);
			       int len = value.length();
			       String rev = "";
			       
			       for(int k=len-1; k>=0; k--)
			       {
			    	   rev =rev.concat(Character.toString(value.charAt(k)));	    	    
			       }
			       
			       System.out.println(Integer.parseInt(rev));
			       
			       	
		 }
		

	}
	
	//public static void main(String[] args) {


}
