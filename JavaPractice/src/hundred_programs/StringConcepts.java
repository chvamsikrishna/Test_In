package hundred_programs;

public class StringConcepts {

	public static void main(String[] args) {

		String S1 = "vamsi";
		String S2 = "vamsi";
		String S3 = new String("vamsi");
		String S4 = " Welcome to the world of uncertainities ";
		String[] S5= S4.split(" ");
		
		System.out.println(S1.compareTo(S2));
		System.out.println(S2.compareTo(S3));
		System.out.println(S2.equals(S3));
		System.out.println(S2==S3);
		
		System.out.println(S2.indexOf('s'));
		System.out.println(S2.replace('s', 's'));
		
		System.out.println(S5[0]);
		for(String s: S5)
		{
			System.out.println(s);
		}
		
		String S6 = S4.trim();
		System.out.println(S4);
		System.out.println(S6);
		
	}

}