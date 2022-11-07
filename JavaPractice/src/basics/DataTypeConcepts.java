package basics;

public class DataTypeConcepts {

	public static void main(String[] args) {
	
	/* Primitives and Non Primitives
	 * Primitives --> byte,short, integer, long, float, char, double.
	 * Non Primitives --> String, Array 
	 */
  
	// size= 1 byte , Range= -128 to 127

	byte s = 120;
	System.out.println(s);
	
	// short size = 2 bytes;
	
	// size = 4 bytes.
	int i = 1000;
	System.out.println(i);
	
	
	// size = 8 bytes.
	long l = 23000;
	System.out.println(l);
	
	// size = 2 bytes.
	float f = 10;
	float f1 =20.0f;
	float f2 = (float)20.0;
	System.out.println(f2);
	
    // size = 
	/*
	 * ASCII -- 
	 *  a to z = 97 to 122
	 *  A to Z = 65 to 90
	 *  1 to 9 = 48 to 57
	 */
	char c = 'd';
	System.out.println(c);
	char d = 'c';
	System.out.println(d+c);
	char b = 'Z';
	System.out.println((int)b);
	
	// boolean = ~1 bit


	}

}
