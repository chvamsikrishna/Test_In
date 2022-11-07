package basics;

public abstract class Abstract_1 {
	
	String name;
	int standard;
	
	public Abstract_1( String name, int standard)
	{
		this.name=name;
		this.standard =standard;
	}
	
	abstract float getPercantage();
	public static void getTotalNumberOfStudents(String count)
	{
		System.out.println(count);
	}
	
}
