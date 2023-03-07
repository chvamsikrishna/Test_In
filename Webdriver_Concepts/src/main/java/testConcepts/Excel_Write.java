package testConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Write {
	
	@Test
	public void writeExcel() throws IOException
	{
		
		File f = new File("C:\\Users\\Niranjan\\Documents\\Java_Eclipse_Practice\\Webdriver_Concepts\\src\\main\\java\\testConcepts\\Excel\\StudentsData.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workBook.getSheetAt(0);
		XSSFCell cell= sheet.getRow(0).createCell(5);
		 cell.setCellValue("Address");
		 
	FileOutputStream fos = new FileOutputStream
			(new File("C:\\Users\\Niranjan\\Documents\\Java_Eclipse_Practice\\Webdriver_Concepts\\src\\main\\java\\testConcepts\\Excel\\StudentsData.xlsx"));

		workBook.write(fos);
		
		
		
		
		
		
	}

}
