package testNG;

import org.testng.annotations.Test;

public class SubClass_3 extends BaseClass{
	
	@Test
	public void toolsQA()
	{
		//driver.get("https://www.toolsqa.com/");
		String title_3 = driver.getTitle();
		System.out.println(title_3);  
	}


}
