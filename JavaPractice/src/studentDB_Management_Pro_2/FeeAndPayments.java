package studentDB_Management_Pro_2;

import java.util.Scanner;

public class FeeAndPayments extends CourseDetails {
	
	int courseEnrolled = CourseDetails.courseEnrolled;
	int enrolledSubjectFees= courseEnrolled*600;
	
//	public FeeAndPayments()
//	{
//		super.courseEnrolled = courseEnrolled;
//		enrolledSubjectFees= 
//	}
	
	public void StudentFeeDetails()
	{
		
		System.out.println("Are you willing to pay the tution fees Now, Reply in Y/N");
	    Scanner sc = new Scanner( System.in);
	    String response = sc.nextLine();
	    
	    if(response.equalsIgnoreCase("n"))
	    {
	    	System.out.println("Fee pending is "+ enrolledSubjectFees);
	    }
	    
	    else
	    {
	    	System.out.println("Total amount is "+enrolledSubjectFees+". Kindly enter the amount you want to pay");
	    	 Scanner sc1 = new Scanner( System.in);
	 	     int response1 = sc1.nextInt();
	 	    System.out.println("Thanks for paying, Remaining amount is"+ (enrolledSubjectFees- response1));
	 	    
	 	     
	 	    
	    }
	}

}
