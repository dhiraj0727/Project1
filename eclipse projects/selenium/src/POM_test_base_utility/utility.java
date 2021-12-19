package POM_test_base_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class utility {

	
	public static String getdatafromexcel(int rownum , int column) throws EncryptedDocumentException, IOException
	{
		// userid pass pin expected userid
		FileInputStream Myfile = new FileInputStream("d:\\zerodha.xlsx");
		Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("sheet1");
		
	  String value =	mysheet.getRow(rownum).getCell(column).getStringCellValue();

		return value;
	}

	public static void getscreenshot(WebDriver driver,int TCID) throws IOException
	
	{
		
		// String random = RandomString.make(4);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\selenium images"+ TCID + ".png");
		FileHandler.copy(source, destination);
		
	}
}
