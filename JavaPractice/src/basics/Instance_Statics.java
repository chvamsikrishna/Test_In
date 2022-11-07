package basics;

public class Instance_Statics {
	
	int i = 10;
	static int j= 10;

	public static void main(String[] args) {
		
		Instance_Statics is = new Instance_Statics();
		    System.out.println(is.i++);
		    
		Instance_Statics is1 = new Instance_Statics();
		    System.out.println(is1.i++);
		    
	
		    System.out.println(j++);
		    
		    
		    System.out.println(j++);
		   

	}

}
