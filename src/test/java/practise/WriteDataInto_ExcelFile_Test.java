package practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.ui.Select;

public class WriteDataInto_ExcelFile_Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		
		//if we want to write the data into the file use createrow() and if you want to add to the same row write getrow() because 
		//that row is already created we just have to write the date. 
		//if we are not using createrow or createcell we cant write because then either the cell should have some data or 
		//we will have to use ' or space. 
		sh.createRow(1).createCell(0).setCellValue("CompanyName");
		sh.getRow(1).createCell(1).setCellValue("TestYantra");
		
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\testdata.xlsx");
		
		wb.write(fos);
		
		wb.close();
		
		
	
		
		
		
	}

}
