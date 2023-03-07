package SeleniumTraning.Webdriver_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	static WebDriver driver;

	public static void main(String[] args) {

		Utils ut = new Utils(driver);
		driver= ut.launchBrowser("chrome");
		
		ut.getURL("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement source = driver.findElement(By.xpath("//p[contains(text(),\"target\")]"));
		WebElement target = driver.findElement(By.xpath("//p[contains(text(),\"Drop\")]"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();
		//ac.dragAndDropBy(source,100,200).build().perform();
		
	}

}
