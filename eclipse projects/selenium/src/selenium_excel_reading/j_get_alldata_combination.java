package selenium_excel_reading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class j_get_alldata_combination {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream myfile = new FileInputStream("d:\\dhiraj.xlsx");
		Sheet sh = WorkbookFactory.create(myfile).getSheet("sheet1");
		
		Cell cellinfo = sh.getRow(1).getCell(3);
		
		CellType cellinfotype = cellinfo.getCellType();
		
		System.out.println(cellinfotype);
		
		if (cellinfotype==CellType.STRING) {
			
			String value = cellinfo.getStringCellValue();
			System.out.println(value);
			
		}
		else if (cellinfotype == CellType.NUMERIC) {
			double value1 = cellinfo.getNumericCellValue();
			System.out.println(value1);
			
		}
		else if (cellinfotype==CellType.BOOLEAN) {
			boolean value = cellinfo.getBooleanCellValue();
			System.out.println(value);
		}
		
	}

}
