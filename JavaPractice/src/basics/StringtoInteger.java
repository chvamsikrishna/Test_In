package basics;

public class StringtoInteger {

	public static void main(String[] args) {
 
		int i =10;
		String s= Integer.toString(i);
		System.out.println(s+10);
		
		int z = 100;
		String ns = String.valueOf(z);
		System.out.println(ns+100);
		
		String toInt ="10";
		int ss = Integer.parseInt(toInt);
		System.out.println(ss+10);
		
		String charInts = "12ab3c4ZW#";
		charInts = charInts.replaceAll("\\D", "");
		System.out.println(charInts);		
		
	}

}
