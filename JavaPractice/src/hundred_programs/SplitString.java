package hundred_programs;

public class SplitString {
	
	String s = "dshb dvadvu sdjniajdvv dvnjnvsnv ";
	int len =s.length();
	String subs="";
	int index=0;
	
	public void breakString()
	{
		for(int i=0;i<len;i++)
		{
			
		  char blank = s.charAt(i);
		  char a =' ';
	      if(blank == a )
			{
	    	 System.out.println(subs);
	    	 subs ="";
	    	 
			}
			else
			{
				subs+=s.charAt(i);
				
			}
			
		}
		
		System.out.println(subs);
	}

	public static void main(String[] args) {

		SplitString ss = new SplitString();
		ss.breakString();
	}

}
