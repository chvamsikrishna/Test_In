package emailCreation_Project_1;

import java.util.Scanner;

public class EmailTemplate {
	
	private String firstName;
	private String lastName;
	private String department;
	
	public EmailTemplate(String firstName, String lastName)
	{
		this.firstName= firstName;
		this.lastName =lastName;
		this.department = departmentType();
        String email ="Email created successfully\n"+ this.emailGenerator();
        System.out.println(email);
        System.out.println((int)Math.random());
         String pass =randomPassword(10);
        System.out.println("Random Password is: "+pass);
        
	}
	
	public String departmentType()
	{
		System.out.print("Select the depatment where the employee belongs");
		System.out.println("\n 1. Sales \n 2. Development \n 3.Accounting \n 4.None");
		Scanner sc = new Scanner(System.in);
		int departmentCode =sc.nextInt();
		String dept =null;
		
		switch(departmentCode)
		{
		case 1 : System.out.println(" Depatment selected is Sales");
		        dept ="Sales";
		break;
		case 2: System.out.println("Depatment selected is Devepolment");
		        dept ="Development";
		break;
		case 3: System.out.println("Depatment selected is Accounting");
	          	dept ="Accounting";
		break;
		default:
			System.out.println("Select the appropriate department");
		}
		return dept;
	}
	public String emailGenerator()
	{
		return firstName+"."+lastName+"@"+department+"."+"company"+"."+"com";
	}
	
	private String randomPassword(int passwordLength)

	{
		
		String random ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#%^&^";
		//char[] password =new char[passwordLength];
		  String password ="";
		
		for(int i=0; i<=passwordLength;i++)
		{
			 
			 int value=(int)(Math.random()*random.length());
			 password+=random.charAt(value);
		}
		return password;
			
	    
	}
	


}
