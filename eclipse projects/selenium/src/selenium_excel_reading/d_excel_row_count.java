package selenium_excel_reading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class d_excel_row_count {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream myfile = new FileInputStream("d:\\dhiraj.xlsx");
		int totalrows =WorkbookFactory.create(myfile).getSheet("sheet1").getLastRowNum()+1;
		System.out.println("number of rows are "+totalrows);
		
		// row -- index no. so +1
	}

}
