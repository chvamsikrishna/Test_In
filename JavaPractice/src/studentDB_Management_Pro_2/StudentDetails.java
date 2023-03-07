package studentDB_Management_Pro_2;

import java.util.Scanner;

public class StudentDetails extends Students{
	
	    static String firstName;
	    static String lastName;
	    int grade;
	    static int id = 1000;
	  
	    
	   public StudentDetails()
	   {
		  
		   studentInfo();
		   
		  
  
	   }

	
	 public void studentInfo()
	 
       {
	    
	     
			 for(int i=0; i<totalStudents; i++)
			 
		 {
		    System.out.println("Enter firstName");
			Scanner f_name = new Scanner(System.in);
		    this.firstName= f_name.nextLine();
		    
		    System.out.println("Enter lastName");
			Scanner l_name = new Scanner(System.in);
		    this.lastName= l_name.nextLine();
		     
		    String fullName = firstName+lastName; 
		    s_Name[i]=fullName;
		    
		    grade();
		    
		    
		 }
	  }
	 
	 public void grade()
	 
	 {
		   System.out.println("Enter grade from below \n1 for Freshman \n2 for Sopmore \n3 for Junior \n4 Senior");
		   Scanner year = new Scanner(System.in);
		   this.grade= year.nextInt();
		   
		   if(grade< 1 || grade > 4 )
		   {
			  System.out.println("Please enter valid year");
		   }
		   else
		   {
		     switch(grade)
		     {
		   
		   case 1:
			   System.out.println(firstName+""+lastName+""+" added as a Freshman");
			   id++;
			   System.out.println("Id for"+firstName+" is :"+ grade+""+id);
			   break;
		   case 2:
			   System.out.println(firstName+""+lastName+""+" added as a sopmore");
			   id++;
			   System.out.println("Id for"+firstName+" is :"+ grade+""+id);
			   break;
		   case 3: 
			   System.out.println(firstName+""+lastName+""+" added as a junior");
			   id++;
			   System.out.println("Id for"+firstName+" is :"+ grade+""+id);
			   break;
		   case 4:
			   System.out.println(firstName+""+lastName+""+" added as a senior");
			   id++;
			   System.out.println("Id for"+firstName+" is :"+ grade+""+id);
			   break;
		    default:
		    	System.out.println(firstName+""+lastName+""+" added as a Freshman");
		      }
		     
		   }
		    
    }
	 

}
