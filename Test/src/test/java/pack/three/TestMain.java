package pack.three;
import org.testng.Assert;
import org.testng.annotations.Test;

import pack.two.MainBase;

public class TestMain extends MainBase{


	@Test
	public void getLoginPageTitle_Test()
	{
		
		String actTitle = page.getLoginPageTitle();
		Assert.assertEquals(actTitle, "Account Login");
	}
	
	@Test
	public void getPageURL_Test()
	{
		String actualURL =page.getPageURL();
	    Assert.assertTrue(actualURL.contains("route=account/login"));
	    
	}
	
	@Test
	
	public void loginToAccount() throws InterruptedException
	{
		String nextPageTitle = page.login("vamsi@gmail.com", "automation");
		
	}
	
	
	
		
	}


