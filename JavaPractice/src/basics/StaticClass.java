package basics;

public class StaticClass {
	
	static int num1=0;
	int num2=0;
	
	public void marks()
	{
		
		
		System.out.println(num1+=10);
		System.out.println(num2+=10);
		
	
	}
	
	public void marks1()
	{
		
		System.out.println(num1+=10);
		System.out.println(num2+=10);
	
	}
	
	public static void sum()
	{
		System.out.println(num1+10);
		
	}

	

	

	public static void main(String[] args) {

	
	 StaticClass sc = new StaticClass();
     sc.marks();
     
     StaticClass sc1 = new StaticClass();
     sc1.marks1();
     
  
     sum();
     
     
   
	 
	 
	 
	}

}
