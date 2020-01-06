package Com.HRMS.TestCase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.HRMS.Base.HRMSBase;
import Com.HRMS.Pages.LoginPage;

public class TestLogin extends HRMSBase
{
	LoginPage loginpage;

	public TestLogin()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage= new LoginPage();
	}

	@Test
	public void LoginTest() throws InterruptedException
	{
		loginpage.login();

		Thread.sleep(3000);
		String LoginVerification = driver.findElement(By.xpath("//div[@class='pull-left info']//p[contains(text(),'sonu verma')]")).getText();
		//System.out.println(LoginVerification);

		boolean res=false;
		if(LoginVerification.contains(AdminName))
		{
			res=true;
			System.out.println("Login successfully done");
		}
		Assert.assertEquals(res, true,"Login successfully not done");	
		Thread.sleep(3000);
	}

	@AfterMethod
	public void End()
	{
		  driver.close();
	}
}
