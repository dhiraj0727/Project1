package selenium_excel_reading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class f_readno_as_string {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile = new FileInputStream("d:\\dhiraj.xlsx");
		
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(6).getStringCellValue();
		System.out.println(value);
		
// if we want to read no as string then we have to put single coat { ' } infront of no. in excel	
		
		
	}

}
