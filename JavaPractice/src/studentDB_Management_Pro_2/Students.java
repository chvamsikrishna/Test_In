package studentDB_Management_Pro_2;

import java.util.Scanner;

public class Students {
	
   
	int totalStudents;
	String[] s_Name;
	
	public Students()
	
	{
		numberOfStudents(); 
		
		
	}
	
 public void numberOfStudents()

   {
	 
	System.out.println("Number of students that needed to be added");
	Scanner sc = new Scanner(System.in);
    totalStudents = sc.nextInt();  
    s_Name = new String[totalStudents];
    
    }	

}
