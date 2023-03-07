package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest {

	WebDriver driver = new ChromeDriver();
	 By firstname; 
	 By lastname;
	 By email;
	 By telephone;
	 By password;
	 By confirmPassword;
	 
	 
	
  @BeforeClass
  public void login()
  {
	  driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	  driver.manage().window().maximize();
  }
  
  @BeforeTest
  public void locatorDetails()
  {
	  firstname = By.xpath("//input[@id=\"input-firstname\"]");
	  lastname = By.xpath("//input[@id=\"input-lastname\"]");
      email = By.xpath("//input[@id=\"input-email\"]");
      telephone = By.xpath("//input[@id=\"input-telephone\"]");
      password =  By.xpath("//input[@id=\"input-password\"]");
      confirmPassword =  By.xpath("//input[@id=\"input-confirm\"]");
    		  
  }
  
  @Test
  public void userDetails() throws InterruptedException
  {
	  driver.findElement(firstname).sendKeys("vamsi");
	  driver.findElement(lastname).sendKeys("K");
	  driver.findElement(email).sendKeys("vamsi1234@gmail.com");
	  driver.findElement(telephone).sendKeys("123456789");
	  driver.findElement(password).sendKeys("vamsi");
	  driver.findElement(confirmPassword).sendKeys("vamsi");
	  driver.findElement(By.xpath("(//label/input)[2]")).click();
	  driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
	  driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	 
	  Thread.sleep(2000);
	  
	 String Actualmessage =  driver.findElement(By.xpath("//h1")).getText();
	 String ExpectedMessage = "Your Account Has Been Created!";
	 
	  assertEquals(Actualmessage,ExpectedMessage);
	  
	  
  }
  
  @AfterTest
  public void message()
  {
	  System.out.println("Account success");
  }
  
  @AfterClass
  public void driverClose()
  {
	  driver.close();
  }
  
  
  
  
}
