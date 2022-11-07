package hundred_programs;

public class LargestNumber {
	static int large;

	public static void main(String[] args) {
          
		int[] a = {10,40,5,6,-100};
		int b = a.length-2;
		int c = a.length-1;
		int lastNumber = a[c];
		
		
		for( int j=0;j<=b;j++)
		{
			if(a[j]>a[j+1])
			{
				large = a[j];
				a[j+1]=large;
			}	
	
	    }
		
	    if (large > lastNumber)
	    {
	    	System.out.println("large number is "+large);
	    }
	    else 
	    {
		System.out.println("large number is "+lastNumber);
	    }
		

	
	}

}
