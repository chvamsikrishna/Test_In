package SeleniumTraning.Webdriver_Concepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
	   Utils ut = new Utils(driver);
	   driver = ut.launchBrowser("Chrome");
	   ut.getURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	   driver.manage().window().maximize();
	   

//		// 1. General Case - Not a valid structure - No reusable code
//            Limitations are here we are hitting the browser every time when we call the web element
//		
//      	// driver.findElement(By.linkText("https://naveenautomationlabs.com/opencart/index.php?route=account/register")).click();
//	     driver.findElement(By.id("input-firstname")).sendKeys("vamsi");
//		 driver.findElement(By.id("input-lastname")).sendKeys("Krishna");
//		 driver.findElement(By.id("input-email")).sendKeys("vamsi@gmail.com");
//		 driver.findElement(By.id("input-telephone")).sendKeys("123456");
//		 driver.findElement(By.id("input-password")).sendKeys("123456");
//		 driver.findElement(By.id("input-confirm")).sendKeys("123456");
//		 
//		 Thread.sleep(3000);
//		 driver.quit();
		 
	   
	 //  2.  Separate Web element and actions, Here we have achieved some re usability in code, But still there is a room for improvement

	   
	   
//	     WebElement firstName = driver.findElement(By.id("input-firstname"));
//	     WebElement lastName = driver.findElement(By.id("input-lastname"));
//	     WebElement email = driver.findElement(By.id("input-email"));
//	     WebElement telephone = driver.findElement(By.id("input-telephone"));
//	     WebElement password = driver.findElement(By.id("input-password"));
//	     WebElement passwordConfirmation = driver.findElement(By.id("input-confirm"));
//	     
//	     firstName.sendKeys("vamsi");
//	     lastName.sendKeys("krishna");
//	     email.sendKeys("vamsi@gmail.com");
//	     telephone.sendKeys("123456");
//	     password.sendKeys("123456");
//	     passwordConfirmation.sendKeys("123456");
//	     
//		 Thread.sleep(3000);
//     	 driver.quit();
//	     
	     
	   // 3. By class locator approach 
	     
	   // Here we can create all the locators without hitting the browser as in 2, we have webElement with locator.
	   
	   // Locator + WebElement + actions  
	   
	   
	    By f_Name = By.id("input-firstname");
        By l_Name = By.id("input-lastname");
        By mail = By.id("input-email");
 	    By phone = By.id("input-telephone");
 	    By passcode = By.id("input-password");
        By passcodeConfirmation  = By.id("input-confirm");
//	    
//	    
//	  WebElement firstname = driver.findElement(f_Name);
//	  WebElement lastName =driver.findElement(l_Name);
//	  WebElement email =driver.findElement(mail);
//	  WebElement telephone =driver.findElement(phone);
//	  WebElement password =driver.findElement(passcode);
//	  WebElement passwordConfirm =driver.findElement(passcodeConfirmation);
//	  
//	  
//	  firstname.sendKeys("vamsi");
//	  lastName.sendKeys("krishna");
//	  email.sendKeys("vamsi@gmail.com");
//	  telephone.sendKeys("12345");
//	  password.sendKeys("123456789");
//	  passwordConfirm.sendKeys("123456789");
//	  
//	  Thread.sleep(3000);
//	  driver.quit();
	    
	    
	  //5  Creating a generic function;
	  
//	   doSendKeys(f_Name,"vamsi");
//	   doSendKeys(l_Name,"krishna");
//	   doSendKeys(mail, "vamsi@gmail.com");
//	   doSendKeys(phone,"12345");
//	   doSendKeys(passcode,"123456789");
//	   doSendKeys(passcodeConfirmation,"123456789");
	   
        //6 Creation the generic classes in separate Util class where we will achieve more code clean/reuse
        
        ElementUtil eu = new ElementUtil(driver);
 	   eu.doSendKeys(f_Name,"vamsi");
 	   eu.doSendKeys(l_Name,"krishna");
 	   eu.doSendKeys(mail, "vamsi@gmail.com");
 	   eu.doSendKeys(phone,"12345");
 	   eu.doSendKeys(passcode,"123456789");
	   eu.doSendKeys(passcodeConfirmation,"123456789");
        
        
	   
	  
	  
	  

}
	
	
	//5 
//	public static WebElement web_Element(By locator)
//	{
//		return driver.findElement(locator);
//	}
//	
//	public static  void doSendKeys(By locator, String value)
//	{
//		web_Element(locator).sendKeys(value);
//	}
	
}
