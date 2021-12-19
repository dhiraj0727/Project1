package selenium_excel_reading;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class i_read_fullexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("d:\\dhiraj.xlsx");
		Sheet sh = WorkbookFactory.create(myfile).getSheet("sheet3");

		int lastrowindex = sh.getLastRowNum();
		System.out.println("row index count is "+lastrowindex);

		for (int i = 0; i <= lastrowindex; i++) {
		int lastcolumnindex = sh.getRow(i).getLastCellNum()-1;
	
		for (int j = 0; j <= lastcolumnindex ; j++) {
			
		String value =	sh.getRow(i).getCell(j).getStringCellValue();
		System.out.print(value+" ");
			
		}	
		
		System.out.println();
		}
	}

}
