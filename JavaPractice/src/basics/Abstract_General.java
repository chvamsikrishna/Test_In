package basics;

public class Abstract_General {
	

	public static void main(String[] args) {
		
		Abstract_2 abs = new Abstract_2("vamsi", 2);
		abs.chemistryMarks =70;
		
		abs.physicsMarks =90;
		abs.mathsMarks = 85;
		
		
		Abstract_3 abs1 = new Abstract_3("vamsi",2);
		abs1.historyMarks = 70;
		abs1.civicsMarks = 86;
		
		int a = (int) abs.getPercantage();
		int b = (int) abs1.getPercantage();
		
		System.out.println((a+b)/2);
        System.out.println(Abstract_2.students_1+Abstract_3.students2);

	}

}
