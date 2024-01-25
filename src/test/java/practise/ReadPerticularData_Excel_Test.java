package practise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ReadPerticularData_Excel_Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\\\test\\resources\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("sheet2");
		int lastrow = wb.getSheet("sheet2").getLastRowNum();
		int lastcell = wb.getSheet("sheet2").getRow(0).getLastCellNum();
		
		String edata = "Wallmart";
		
		
		for(int i=0;i<lastrow+1;i++) {
			
			
			for(int j=0; j<lastcell;j++) {
				
                String data = wb.getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
			//	System.out.print("test");
				if(data.contains(edata)) {
					
					String ename = wb.getSheet("Sheet2").getRow(i).getCell(j+1).getStringCellValue();
					System.out.print(ename);
					break;
					
				}
		//System.out.println();
		
			wb.close();
			
		}
		
		
		
	}

	}
}
