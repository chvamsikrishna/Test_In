package classAssignment;

public class Bye_SeeUAgain {
	
	public static void main(String[] args)
	{
		for( int i=1; i<=10; i++)
		{
			if(i%7 != 0)
			{
			System.out.println(i);
			}
			else if(i%7 == 0)
			{
				System.out.println("Bye see you tomorrow");
				break;
			}
		
		}
	}

}
