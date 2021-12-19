package selenium_excel_reading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a_get_cell_type {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		
		FileInputStream myfile = new FileInputStream("d:\\dhiraj.xlsx");
		
		CellType ct = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(3).getCell(6).getCellType();
		System.out.println(ct);
		
	}

}
