package selenium_excel_reading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class g_get_AllData_fromRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream myfile = new FileInputStream("d:\\dhiraj.xlsx");
		
		Sheet sh = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
// dynamic type
		
		int LastCellIndex = sh.getRow(0).getLastCellNum()-1;
		
		System.out.println("Cell index count is "+LastCellIndex);
		
		
		for(int i=1; i<=LastCellIndex;i++)
		{
			String Value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(Value);
		}

		
	}

}
