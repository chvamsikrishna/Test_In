package studentDB_Management_Pro_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CourseDetails{
	
	String[] Courses = {"History", "Mathematics", "English", "Chemistry", "Computer Science"};
	static String addAnotherCourse = "y";
    ArrayList<String> s_Courses = new ArrayList<String>();
    static int courseEnrolled;
	
	
	public void courseEnrolment()
	{

		
		System.out.println("Enter the course name from following" + Arrays.toString(Courses));
		
		for(int i=0; !(addAnotherCourse.equals("N")) ;i++ )
		{
		System.out.println("Enter the course for enrollement");	
		Scanner sc = new Scanner(System.in);
		String addedCourse = sc.nextLine();
		s_Courses.add(addedCourse);
		
		
		System.out.println("Do you want to add another course Y/N");
		Scanner s = new Scanner(System.in);
	    addAnotherCourse = s.nextLine();
	    
		}
		System.out.println("You have successfull enrolled into below courses");
		
		courseEnrolled = s_Courses.size();
		
		
		for(String s: s_Courses)
		{
			System.out.println(s);
		}
	}
	
	
}
