package basics;

public interface A {
	
	abstract void suzuki();
	public void honda();
	void benz();
	
public interface B {
	
	public final static String engineNorms ="BS-6";
	int cost();
	void safety();
	
}

class Suzuki implements B
{

	@Override
	public int cost() {
        int cost = 1000;
		return cost;
      
	}

	@Override
	public void safety() {

		String badge = "low";
		System.out.println(badge);
		
	}

}
	
	public static void main( String args[])
	{
		B b = new Suzuki();
		int value = b.cost();
		System.out.println(value);
		b.safety();
		System.out.println(Suzuki.engineNorms);
	}
}
