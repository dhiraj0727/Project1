package selenium_excel_reading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class b_get_numeric_cell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream myfile = new FileInputStream("d:\\dhiraj.xlsx");
		double text = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(1).getCell(7).getNumericCellValue();
		System.out.println(text);
		
		
	}

}
