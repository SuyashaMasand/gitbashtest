package practise;


	
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	public class Test {

	    public static void main(String[] args) throws EncryptedDocumentException, IOException {

	        FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testdata.xlsx");
	        Workbook wb = WorkbookFactory.create(fis);

	        Sheet sh = wb.getSheet("Sheet2");
	        int lastrow = sh.getLastRowNum();

	        String edata = "walmart";

	        boolean dataFound = false;

	        for (int i = 0; i <= lastrow; i++) {
	            Row row = sh.getRow(i);

	            if (row != null) {
	                int lastcell = row.getLastCellNum();

	                for (int j = 0; j < lastcell; j++) {
	                    String data = row.getCell(j).getStringCellValue();

	                    if (edata.equals(data)) {
	                        System.out.println("The data is present in row " + (i + 1) + ", column " + (j + 1));
	                        dataFound = true;
	                        break;
	                    }
	                }
	            }
	        }

	        if (!dataFound) {
	            System.out.println("The data is not present in the sheet.");
	        }

	        wb.close();
	    }
	}



