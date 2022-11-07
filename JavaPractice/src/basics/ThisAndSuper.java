package basics;

public class ThisAndSuper {
	String str;
	int i;
	
	public ThisAndSuper()
	
	{
		this("Hello this is of overloadded constructor",10);
		System.out.println("Hey this is default Constructor");
	}
	
	ThisAndSuper(String str, int i)
	{
		
	    this.str =str;
	    this.i=i;
		System.out.println(str+" "+i);
	}
	ThisAndSuper(String str)
	{
		this();
	    this.str =str;
		System.out.println(str+" "+i);
	}
	
	

	
	

	public static void main(String[] args) {
        ThisAndSuper tas= new ThisAndSuper("yes");	
        //new ThisAndSuper("hey",420);
        System.out.println(tas.i);
        System.out.println(tas.str);
       
      
      
	
	}

}
