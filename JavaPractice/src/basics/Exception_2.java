package basics;

public class Exception_2 {
	
	// we can throw exception in 2 ways using Throws/ Throw
	// 'throws' we declare in method sig with exception type
	// throw we declare inside the method with new keyword.
	
	public static void exc()
	{
		
		
			int a = 10/0;
			throw new ArithmeticException("please provide valid value");
	}

	public static void main(String[] args) {
		
		exc();

	}

}
