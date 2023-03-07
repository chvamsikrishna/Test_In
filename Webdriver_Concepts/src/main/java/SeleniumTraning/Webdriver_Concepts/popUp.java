package SeleniumTraning.Webdriver_Concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class popUp {
	
	static WebDriver driver;

	public static void main(String[] args) {

		Utils ut = new Utils(driver);
		driver= ut.launchBrowser("chrome");
		
		ut.getURL("https://the-internet.herokuapp.com/javascript_alerts");
		
//		By jsAlert = By.xpath("//button[text()=\"Click for JS Alert\"]");
//		WebElement alert1 =driver.findElement(jsAlert);
//		alert1.click();
		
//		By jsConfirm = By.xpath("//button[text()=\"Click for JS Confirm\"]");
//		WebElement alert2 =driver.findElement(jsConfirm);
//		alert2.click();
		
		
		By jsPromt = By.xpath("//button[text()=\"Click for JS Prompt\"]");
		WebElement alert3 =driver.findElement(jsPromt);
 		alert3.click();
		
		Alert ar = driver.switchTo().alert();
		System.out.println(ar.getText());
		ar.sendKeys("Accept alert");
		ar.accept();
		
		
		
	}

}
