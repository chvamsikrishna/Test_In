package patterns;

public class Arrow_2 {

	public static void main(String[] args) {

		for(int i=0;i<=2*5-1;i++)
		{
			int coulumn = i<5 ? i : 2*5-i;
			
			for(int j=0;j<coulumn; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
