package hundred_programs;

import java.util.Arrays;

public class Substring {
	
	String s = "Welcome to the world of uncertanities";
	
	public void allSubString()
	{
	
	   String[] str=s.split(" ");
	   int l =str.length;
	   System.out.println(l);
	   System.out.println(Arrays.toString(str));
	   for(int i=0; i<l;i++)
	   {
		   System.out.println(str[i]);
	   }
	
	}

	public static void main(String[] args) {
		
		Substring obj =new Substring();
		obj.allSubString();

	}

}
