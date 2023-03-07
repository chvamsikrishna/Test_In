package pack.one;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Page {


    private WebDriver driver;
    
    private By email = By.xpath("//input[@id='input-email']");
    private By password = By.xpath("//input[@id='input-password']");
    private By login = By.xpath("//input[@type='submit']");

    
       public Page(WebDriver driver)
    {
    	this.driver = driver;  	
    	
    }
    
   
    public  String getLoginPageTitle()
    {
    	return driver.getTitle();
    
    }
    
    public String getPageURL()
    {
    	return driver.getCurrentUrl();
    }
    
    public String login(String username, String pass) throws InterruptedException
    {
    	driver.findElement(email).sendKeys(username);
    	driver.findElement(password).sendKeys(pass);
    	driver.findElement(login).click();
    	return driver.getCurrentUrl();
    	    	
    }
  
 
    

}
