package basics;

public class Abstract_3 extends Abstract_1{
	
	int historyMarks;
	int civicsMarks;
	static int students2 = 100;
	
	public Abstract_3(String name, int standard) {
		super(name, standard);
	}
	
	
	@Override
	float getPercantage() {
       
		float value2 = (historyMarks + civicsMarks);
		value2/=200;
		value2*=100;
	    return value2;
	}
	

}
