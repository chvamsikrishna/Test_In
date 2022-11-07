package basics;

import java.lang.reflect.Array;

public class Arrays {

	public static void main(String[] args) {

		 int[] arr = new int[4];
		 arr[0] =1;
		 arr[1] =2;
		 arr[2] =3;
		 arr[3] =4;
		 
		 System.out.println(arr[3]);
		 System.out.println(arr.length);
		 
		 System.out.println("------------");

		 
		 for(int i=0; i<=arr.length-1; i++)
		 {
			 System.out.println(arr[i]);
		 }
		 
		 System.out.println("------------");
		 
		 // For Each loop
		 
		 for(int e: arr)
		 {
			 System.out.println(e);
		 }
		 
		 System.out.println("------------");
		 
		//Literals
		 
		 int[] lit = {1,2,3,4,5};
		 
		 for( int l:lit)
		 {
			 System.out.println(l);
		 }
		 
		 String[] s = {"one", "two", "three"};
		 
		 for( int k=0; k<=s.length-1;k++)
		 {
			 System.out.println(s[k]);
		 }
		 
		 System.out.println("==============");
		 
		 
		 
        		 
		 
		 
		 
	}

}
