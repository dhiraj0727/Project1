package selenium_excel_reading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class h_get_AllDataFrom_Column {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile = new FileInputStream("d:\\dhiraj.xlsx");
		
		Sheet sh = WorkbookFactory.create(myfile).getSheet("sheet1");
	      
	      int lastrowindex = sh.getLastRowNum();   // -1 bcz row always from index
	      System.out.println("row index count is "+lastrowindex);
		
	      for (int i = 0; i <=  lastrowindex ; i++) {
	    	  
	    	double value =  sh.getRow(i).getCell(0).getNumericCellValue();
	    	  System.out.println(value);
	    	  
	    	String value1 = sh.getRow(i).getCell(1).getStringCellValue();
	    	  System.out.println(value1);
			
		}
	}

}