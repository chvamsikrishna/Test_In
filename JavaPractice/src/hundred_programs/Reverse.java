package hundred_programs;

public class Reverse {
	String s ="Vamsi Krishna";
	String revString="";
	
	public String reverseString()
	{
		
		int len = s.length();
		for(int i=len-1;i>=0;i--)
		{
			revString+=s.charAt(i);
		}
		return revString;
	}

	public static void main(String[] args) {
		
		Reverse obj = new Reverse();
		String reverse = obj.reverseString();
        System.out.println(reverse);
	}

}
