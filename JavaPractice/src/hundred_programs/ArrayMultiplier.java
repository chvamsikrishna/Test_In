package hundred_programs;

import java.util.Arrays;

public class ArrayMultiplier {
	
	int[] a = {2,3,4,5,6};
	int sum=1;
	int counter=0;
	int len = a.length;
	
	

	
	public void multiplicationArrays()
	{
	
	  int[] b= new int[len];
	 
	  for(int i=0;i<len;i++)
	  {  
		  int c[] = Arrays.copyOfRange(a, 0, len);
		  for(int j=0;j<len;j++)
		  {  
			  
			  c[counter]=1;
			  sum*=c[j];			 
		  }
		  b[i]=sum;
		  sum=1;
		  counter++;
	        
	  }
	  
	  for(int d: b)
	  {
		  System.out.println(d);
	  }
			
	}
	


	public static void main(String[] args) {

 
		ArrayMultiplier as = new ArrayMultiplier();
		as.multiplicationArrays();
		
	}

}
