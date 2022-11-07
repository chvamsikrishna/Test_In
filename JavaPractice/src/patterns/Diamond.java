package patterns;

public class Diamond {

	public static void pattern_Diamond(int n)
	{
		for( int i=0; i<=2*n-1;i++)
		{
			int columns = i<n? i:2*n-i;
			for(int spaces =0; spaces< n- columns; spaces++)
			{
				System.out.print(" ");
			}
			
			for (int j=0;j<columns;j++)
			{
				System.out.print('*'+" ");
			}
			System.out.println();
		}
	
	}
	public static void main(String[] args) {
		
	   pattern_Diamond(5);
		
	}

}
