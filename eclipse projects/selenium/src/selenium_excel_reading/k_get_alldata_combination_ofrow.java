package selenium_excel_reading;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class k_get_alldata_combination_ofrow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream myfile = new FileInputStream("d:\\dhiraj.xlsx");
		Sheet sh = WorkbookFactory.create(myfile).getSheet("sheet1");
		
		int lastrowindex = sh.getLastRowNum();
		System.out.println(lastrowindex);
		System.out.println("     --       ");
	
		for (int i = 0; i <= lastrowindex; i++) {
			
		Cell cellinfo =	sh.getRow(i).getCell(3);
		CellType celldatatype = cellinfo.getCellType();
		
		if (celldatatype==CellType.STRING) {
			
		String value =	cellinfo.getStringCellValue();
		System.out.println(value);
			
		}else if (celldatatype==CellType.NUMERIC) {
			
			double value = cellinfo.getNumericCellValue();
			System.out.println(value);
		}else if (celldatatype==CellType.BOOLEAN) {
			boolean value = cellinfo.getBooleanCellValue();
			System.out.println(value);
			
		}
			
		}
		
	}

}
