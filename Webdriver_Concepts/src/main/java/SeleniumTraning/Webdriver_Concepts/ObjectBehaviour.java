package SeleniumTraning.Webdriver_Concepts;

import org.openqa.selenium.WebDriver;

public class ObjectBehaviour extends Utils{
	
	
	public ObjectBehaviour(WebDriver driver)
	{
		driver = super.driver;
	}
	
 
	public static void main(String[] args) {

		 ObjectBehaviour obj = new ObjectBehaviour(driver);// This step will open the browser
		 obj.launchBrowser("Chrome");
		 
		 ObjectBehaviour obj1 = new ObjectBehaviour(driver);
		 obj1.launchBrowser("Chrome");
		 
		 ObjectBehaviour obj2 = new ObjectBehaviour(driver);
		 obj2.launchBrowser("Chrome");
		 

		 obj=obj2=obj1;
		 
		 obj.getURL("https://www.google.com");
		 driver.quit();
	}

}
