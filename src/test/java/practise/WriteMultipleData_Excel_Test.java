package practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteMultipleData_Excel_Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testdata.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		ArrayList<String>	 al = new ArrayList<String>();

		al.add("suyasha");
		al.add("meghana");
		al.add("pragathi");
		al.add("Niveditha");
		al.add("wipro");
		al.add("tcs");
		al.add("testyantra");
		al.add("mindtree");

		int size = al.size();
		System.out.println(size);



		Sheet sh = wb.getSheet("sheet3");

		for(int i=0; i<al.size()/2;i++) {


			sh.createRow(i).createCell(0).setCellValue(al.get(i));
			//sh.getRow(i).getCell(1).setCellValue(al.get(i));

		}
		for(int j=0; j<al.size();j++) {
			sh.getRow(j).getCell(1).setCellValue(al.get(j));
		}

		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\testdata.xlsx");
		wb.write(fos);
		wb.close();


	}

}
