package practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIn_PropertyFile {
	public static void main(String[] args) throws Throwable {
		
	FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\commondata.properties");
	
	Properties p = new Properties();
	p.setProperty("browser", "chrome");
	p.setProperty("url", "http://rmgtestingserver/domain/Online_Banking_System/");
	p.setProperty("un", "210001");
	p.setProperty("pwd", "password");
	
	FileOutputStream fos = new FileOutputStream(".\\src\\\\test\\resources\\commondata.properties");	
	
	p.store(fos, "write data");

}
}