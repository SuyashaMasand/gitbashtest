package practise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData_Excel_Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testdata.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		int lastrow = wb.getSheet("sheet2").getLastRowNum();
		int lastcell = wb.getSheet("sheet2").getRow(0).getLastCellNum();
		
		
		for(int i=0; i<lastrow+1;i++) {
			
			for(int j=0; j<lastcell; j++) {
				String data = wb.getSheet("sheet2").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+ " ");
				
			}
			System.out.println();
		}
	}

}
