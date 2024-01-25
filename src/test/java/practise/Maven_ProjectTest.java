package practise;

import org.testng.annotations.Test;

public class Maven_ProjectTest{

	@Test
	public void Test1() {
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		String UN	=System.getProperty("un");
		String PWD=System.getProperty("pwd");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);



	}

}
