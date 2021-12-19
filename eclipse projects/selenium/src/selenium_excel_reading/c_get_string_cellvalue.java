package selenium_excel_reading;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class c_get_string_cellvalue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile = new FileInputStream("D:\\dhiraj.xlsx");

		String PlayerName = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(6).getStringCellValue();
	
System.out.println(PlayerName);

		
		
		
		
		
		
	}

}
