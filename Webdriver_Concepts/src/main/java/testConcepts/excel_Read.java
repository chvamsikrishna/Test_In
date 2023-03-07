package testConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class excel_Read {
	
	
	@Test
	public void readData() throws IOException
	{
	
	File file = new File("C:\\Users\\Niranjan\\Documents\\Java_Eclipse_Practice\\Webdriver_Concepts\\src\\main\\java\\testConcepts\\Excel\\StudentsData.xlsx");
    System.out.println(file.exists());
    
    FileInputStream fis = new FileInputStream(file);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheetAt(0);
    
    int rows = sheet.getPhysicalNumberOfRows();
    int columns = sheet.getRow(0).getLastCellNum();
    
    System.out.println(rows+" "+columns);
    
    for(int i=1 ; i<rows; i++)
    {
    	for(int j=0;j<columns; j++)
    	{
    		DataFormatter df = new DataFormatter();
    		String value = df.formatCellValue(sheet.getRow(i).getCell(j));
    		//String value = sheet.getRow(i).getCell(j).getStringCellValue();
    		System.out.print(value+" ");
    	}
    	System.out.println();
    }
    
    workbook.close();
    
   }
	
	@Test
	public void writeData() throws IOException
	{
	
	File file = new File("C:\\Users\\Niranjan\\Documents\\Java_Eclipse_Practice\\Webdriver_Concepts\\src\\main\\java\\testConcepts\\Excel\\StudentsData.xlsx");
    System.out.println(file.exists());
    
    FileInputStream fis = new FileInputStream(file);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheetAt(0);
    sheet.getRow(0).createCell(3).setCellValue("gender");
    
    FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Niranjan\\Documents\\Java_Eclipse_Practice\\Webdriver_Concepts\\src\\main\\java\\testConcepts\\Excel\\StudentsData.xlsx"));
    
    workbook.write(fos);
    workbook.close();
    
    
    
    
	}
	

}
