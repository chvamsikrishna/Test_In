package SeleniumTraning.Webdriver_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register_Success {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		Utils u = new Utils(driver);
		driver =u.launchBrowser("Chrome");
		u.getURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		By name = By.id("input-firstname");
		By surname = By.name("lastname");
		By eM = By.xpath("//*[@id=\"input-email\"]");
		By phoneNo = By.cssSelector("#input-telephone");
		By subscribe =By.linkText("Yes");
		By pwd = By.id("input-password");
		By pwdConfirm = By.name("confirm");
		
		By termsAndCondition = By.name("agree");
		By moveNext= By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By successHeader = By.xpath("//*[@id=\"content\"]/h1");

		ElementUtil eu = new ElementUtil(driver);
		eu.doSendKeys(name, "vamsi");
		eu.doSendKeys(surname, "k");
		eu.doSendKeys(eM, "vk@gmail.com");
		eu.doSendKeys(phoneNo, "123456");
		eu.doSendKeys(pwd, "1234");
		eu.doSendKeys(pwdConfirm, "1234");
		eu.doClick(termsAndCondition);
		eu.doClick(moveNext);

		Thread.sleep(3000);
		String message = eu.doGetText(successHeader);
		System.out.println(message);
		
		
		
		
		
		
		
	}

}
