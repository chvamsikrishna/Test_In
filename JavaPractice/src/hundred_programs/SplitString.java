package hundred_programs;

public class SplitString {
	
	String s = "We are not immortals";
	int len =s.length();
	String subs="";
	int index=0;
	
	public void breakString()
	{
		for(int i=index;i<len;i++)
		{
			
	      if()
			{
			index=i;
			//System.out.println(subs);
			subs ="";
			break;
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
