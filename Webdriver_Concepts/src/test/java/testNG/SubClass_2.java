package testNG;

import org.testng.annotations.Test;

public class SubClass_2 extends BaseClass {
	
	@Test
	public void tutorialPoint()
	{
		//driver.get("https://www.tutorialspoint.com");
		String title_2 = driver.getTitle();
		System.out.println(title_2);  
	}

}
