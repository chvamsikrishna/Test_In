package hundred_programs;

public class Swap3variables {

	public static void main(String[] args) {

		// With using three variables 
		 int a = -10;
		 int b = -20;
		 
		 System.out.println("Before Swap");
		 System.out.println("a is "+ a + ", "+ "b is  "+b);		 
		 int c = a+b;
		 
		 System.out.println("value of a after swap is "+ (c-a));
		 System.out.println("value of b after swap is "+ (c-b));
		 
		 //with using two variables
		 
		 int d = 10;
		 int e = -20;
		 
		 System.out.println("Before Swap");
		 System.out.println("d is "+ d + ", "+ "e is  "+e);		
		 
		 d+=e;
		 e=d-e;
		 d-=e;
		 
		 System.out.println("After Swap");
		 System.out.println("value of d after swap is "+d);
		 System.out.println("value of e after swap is "+e);
		 
		 
		 
		 
		 
	}

}
