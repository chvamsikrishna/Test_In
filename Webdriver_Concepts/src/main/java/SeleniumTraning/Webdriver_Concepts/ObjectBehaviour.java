package SeleniumTraning.Webdriver_Concepts;

import org.openqa.selenium.WebDriver;

public class ObjectBehaviour {
	

	static WebDriver driver;
 
	public static void main(String[] args) {

		Utils obj = new Utils (driver);// This step will open the browser
		 obj.launchBrowser("Chrome");
		 
//		 ObjectBehaviour obj1 = new ObjectBehaviour(driver);
//		 obj1.launchBrowser("Chrome");
//		 
//		 ObjectBehaviour obj2 = new ObjectBehaviour(driver);
//		 obj2.launchBrowser("Chrome");
//		 
//
//		 obj=obj2;
		 
		 obj.getURL("https://www.google.com");
		 String title =obj.getPageTitle();
		 System.out.println(title);
	
		 obj.quitBrowser();
	}

}
