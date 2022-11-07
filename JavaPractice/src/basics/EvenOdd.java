package basics;

public class EvenOdd {

	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		
		System.out.println("Even Numbers");
		
		while (i<=100)
		{
			
			if( i%2 == 0)
			{
				System.out.println(i);
				
			}
			
			i++;
		}
		
		System.out.println("odd Numbers");
		
		   while (j<=100)
		{
			
			
			if( j%2 == 1)
			{
				System.out.println(j);
			} 
			
			j++;
	   }  

    }
}
