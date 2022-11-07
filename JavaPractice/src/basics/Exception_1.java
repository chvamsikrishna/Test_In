package basics;
// Exceptional Handling in Java

public class Exception_1 {
	
	static int a =10;
	static String name;
	
	@SuppressWarnings("finally")
	public static String exception()
	{

		// below line of code gives exception which stops the execution of the program
		// to continue the execution we have to handle the exception.
		//int b = 10/0;
		
		try {
			name ="vamsi";
			
			int b =10/0;
			System.out.println(a+b);
			
			// What ever the first exception comes that is thrown in the console
			
			String j = null;
			
			System.out.println(j.length());
			
			return name;
		
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println(e);
		}
		catch(NullPointerException e1)
		{
			
			System.out.println(e1);
			
		}
		finally
		{
			name ="Krishna";
			System.out.println("Exception handled, we can close the issue");
			return name;
		}
	}

	public static void main(String[] args) {
                 exception();
                 System.out.println(name);
		
	}

}
