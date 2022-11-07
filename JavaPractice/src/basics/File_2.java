package basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class File_2 {
	
	String[] str;
	String currentLine;
	int salary, count;
    public void reader() throws FileNotFoundException {
	
	FileReader fr = new FileReader("C:\\Users\\Niranjan\\Desktop\\Employee.txt");
	BufferedReader br = new BufferedReader(fr);
	
	
	try {
		
	    while((currentLine = br.readLine())!= null)
	    {
		  str = currentLine.split(";");
		  System.out.println(str[0]+" "+str[1]+" "+str[3]);	
		  salary +=Integer.parseInt(str[3]);
		  count++;
	    }	
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	
	
    }

	public static void main(String[] args) throws FileNotFoundException {
		
	
		File_2 f2 = new File_2();
		f2.reader(); 
		System.out.println(f2.salary/(f2.count-1));
		
	}

}
