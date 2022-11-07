package basics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_1 {
	

	


	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		
		//creating a file
		
		File newFile = new File("C:\\Users\\Niranjan\\Desktop\\Employee.txt");
		
		try
		{
			newFile.createNewFile();
			System.out.println("New File created");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// writing into the file
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		
		String content = sc.next();
		
		try
		{
		fw = new FileWriter(newFile);
		fw.write(content);
		}
		finally
		{
			fw.close();
		}

	

}
	
}
