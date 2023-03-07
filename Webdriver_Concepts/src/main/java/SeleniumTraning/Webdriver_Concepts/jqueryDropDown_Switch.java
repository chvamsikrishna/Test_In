package SeleniumTraning.Webdriver_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class jqueryDropDown_Switch {
	
	static WebDriver driver;

	public static void main(String[] args) {

		Utils u = new Utils(driver);
		driver = u.launchBrowser("Chrome");
		u.getURL("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		By jqeryDD = By.className("comboTreeInputBox");
		By dDChoicees = By.className("comboTreeItemTitle");
		
		 ElementUtil eu = new ElementUtil(driver);
         eu.doClick(jqeryDD);
		
         // Single Selection
           jDropDown(dDChoicees,"SingleSelect","choice 3");
         
         //multiple selection
         //jDropDown(dDChoicees, "choice 3", "choice 4", "choice 5");
         
         //Select All
         //jDropDown(dDChoicees, "all");
		 
		
	}
	
		 public static void jDropDown(By locator, String testCaseType, String... value)
		 {
			 List<WebElement> d_List = driver.findElements(locator);
			 System.out.println(d_List.size());
			 
			 switch(testCaseType.toLowerCase())
			 {
				 case "singleselect":
				 {
					 for(WebElement e: d_List)
					 {
						 String dropValue = e.getText();
						 for(int i=0; i<value.length;i++)
						 {
						 
						 if(value[i].equals(dropValue))
						 {
							 e.click();
						
						 }
						 }
					 }
					 break;
					 
				 }
				 case "multiselect":
				 {
					 for(WebElement e: d_List)
					 {
						 String dropValue = e.getText();
						 
						 for(int i=0; i<value.length;i++)
						 {
							if(value[i].equals(dropValue))
							{
								e.click();
							}
							 
						 }
				      }
					 break;
					 
				 }
				 case "selectall":
				 {
					 
						 try {
							 
						 for(WebElement a : d_List)
						 {
							 a.click();
						 }
						 }
						 catch(Exception e)
						 {
							 
						 }
						 break;
				}
				 default:
				 {
					 System.out.println("Please select the appropriate test case");
				 }
				 
			 }
		 }
}

