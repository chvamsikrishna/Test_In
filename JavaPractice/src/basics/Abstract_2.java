package basics;

public class Abstract_2 extends Abstract_1 {

	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	static int students_1 = 100;
	
	public Abstract_2(String name, int standard) {
		super(name, standard);
	}


	@Override
	float getPercantage() {
		
	    float value1 = physicsMarks+chemistryMarks+mathsMarks;
	    value1/=300;
		value1 = value1*100;
		return value1;
	}

}


