package hundred_programs;

import java.io.*;

public class FileHandling {



       public static void main(String[] args) {
		
		// Create a file
		File newFile = new File("C:\\Users\\Niranjan\\Desktop\\NewFile.txt");
		FileWriter fw = null;
		FileReader fr = null;
      
		
		
		try
		{
			if (newFile.createNewFile())
			{
				System.out.println("file Created");
				
			}
			else
			{
				System.out.println("File already exists");
			}
	
		// Writing into the file
		
		try
		{
			fw = new FileWriter(newFile);
			fw.write("Hey, What's up!");
		
		    
		} 
		finally
		{
			fw.close();
		}
		
		// Reading the file. 
		
		try 
		{
			fr = new FileReader(newFile);
			int value;
			
			while((value= fr.read())!=-1)
			{
				System.out.print((char)value);
			}
			
		}
		catch(IOException e)
		{
			System.out.println("No Data availble/ Empty file");
		}
		finally
		{
			fr.close();
		}
	}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}
}

