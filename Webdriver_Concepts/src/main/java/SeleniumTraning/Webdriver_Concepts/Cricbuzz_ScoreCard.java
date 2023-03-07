package SeleniumTraning.Webdriver_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cricbuzz_ScoreCard {
	
	static WebDriver driver;

	public static void main(String[] args) {
		

		Utils ut = new Utils(driver);
		driver = ut.launchBrowser("chrome");
	
		ut.getURL("https://www.cricbuzz.com/");
		
		ElementUtil eu = new ElementUtil(driver);
		
		By match = By.xpath("(//a[contains(@title,'Afghanistan v Sri Lanka')])[1]");
		eu.doClick(match);
		
		By scoreCard = By.xpath("//a[text()='Scorecard']");
		eu.doClick(scoreCard);
		
		List<WebElement> full_Data =driver.findElements(By.xpath("(//div[@id='innings_1']/div)[1]/div/div"));
	
		int counter = 0;
		for(WebElement data : full_Data)
		{
			   counter ++;
			   
			   System.out.print(data.getText()+" ");
			   
			   if(counter == 7)
			   {
				   System.out.println();
				   counter =0;
			   }
		}
		
		
		

	}

}
