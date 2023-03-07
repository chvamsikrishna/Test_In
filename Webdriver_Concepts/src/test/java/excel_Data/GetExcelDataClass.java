package excel_Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;



public class GetExcelDataClass {
	
	 @DataProvider(name="excel")
     public  String[][] excel_Read() throws InvalidFormatException, IOException
	{
	
	File file = new File("C:\\Users\\Niranjan\\Documents\\Java_Eclipse_Practice\\Webdriver_Concepts\\src\\test\\java\\excel_Data\\Credentials.xlsx");
	System.out.println(file.exists());
	FileInputStream fis = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(0);
	int totalRows = sheet.getPhysicalNumberOfRows();
	int idealRowCount = totalRows-1;
	int columnCount = sheet.getRow(0).getLastCellNum();
	
	String [][] cred = new String[idealRowCount][columnCount];
	
	System.out.println(idealRowCount +" "+ columnCount);
	
	for(int i =0; i<idealRowCount; i++)
	{
		for (int j = 0; j<columnCount; j++)
		{
			DataFormatter df = new DataFormatter();
			System.out.println(df.formatCellValue(sheet.getRow(i+1).getCell(j)));
			 
			cred[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			
		}
	}
		
	workbook.close();
	fis.close();
	return cred;

	}

}




