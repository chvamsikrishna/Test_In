package SeleniumTraning.Webdriver_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_InCognito {
	
     
    public static void main(String[] args) {
		
		  ChromeOptions cm = new ChromeOptions();
		  cm.addArguments("--incognito");
		  //cm.setHeadless(true);
		 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niranjan\\Documents\\Selenium_Files\\chromedriver.exe");
            WebDriver driver = new ChromeDriver(cm);
		  
		  
		  driver.get("https://www.google.com/");
		  
		  List<WebElement>ele = driver.findElements(By.xpath("//a[contains(@href,\"https://www.google.com\")]"));
		  
		 for( WebElement e : ele)
		 {
			 System.out.println(e.getText());
		 }
		  
		  

	}

}
