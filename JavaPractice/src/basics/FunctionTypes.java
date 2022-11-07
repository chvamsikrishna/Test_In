package basics;

public class FunctionTypes {
	
	// 1 -- No return type and no arguments
	
	public void printValue()
	{
		System.out.println("Hello");
	}
	
	// 2 -- Return Type with no argument
	
	public String[] name()
	{
		String[] str = {"vamsi", "sai","chinnu"};
		return str ;
		
	}

	// 3 -- has return type and argument
	
	public int add ( int a, int b)
	{
		
		return a+b;
	}
	
	public static void main(String[] args) {
		
		FunctionTypes pv = new FunctionTypes();
		pv.printValue();
		
		FunctionTypes pv1 = new FunctionTypes();
		String[] in =pv1.name();
		System.out.println(in[0]);
		
		FunctionTypes pv2 = new FunctionTypes();
		int c =  pv2.add(10,20);
		System.out.println(c);
		
		

	}

}
