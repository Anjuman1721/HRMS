package Com.HRMS.TestCase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.HRMS.Base.HRMSBase;
import Com.HRMS.Pages.HomePage;
import Com.HRMS.Pages.LoginPage;
import Com.HRMS.Pages.Performance;


public class TestPerformance extends HRMSBase
{
	LoginPage loginpage;
	HomePage homepage;
	Performance performance;
	
	public TestPerformance()
	{
		super();
	}
	
	@BeforeMethod
	public void start()
	{
		initialization();
		loginpage= new LoginPage();
 		homepage = new HomePage();
 		performance= new Performance();
	}
	
	@Test(priority = 0)
	public void TestIndicator() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		performance.AddIndicator();
		String IndicatorVerification = driver.findElement(By.xpath("//td[contains(text(),'Sr. Automation Tester')]")).getText();
		//System.out.println(IndicatorVerification);
		boolean res=false;
		if(IndicatorVerification.contains("Tester"))
		{
			res=true;
			System.out.println("Indicator information display successfully.");
		}
		Assert.assertEquals(res, true,"Indicator information not display successfully.");
		
	}
	
	@Test(priority = 1)
	public void TestAppraisal() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		performance.AddApraisal();
		String ApraisalVerification = driver.findElement(By.xpath("//td[contains(text(),'Arjun Verma')]")).getText();
		//System.out.println(ApraisalVerification);
		boolean res=false;
		if(ApraisalVerification.contains(Name))
		{
			res=true;
			System.out.println("Apraisal information display successfully.");
		}
		Assert.assertEquals(res, true,"Apraisal information not display successfully.");
		
	}
	
	@Test(priority = 2)
	public void TestGoalType() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		performance.AddGoalType();
		String GoalTypeVerification = driver.findElement(By.xpath("//td[contains(text(),'Test')]")).getText();
		//System.out.println(GoalTypeVerification);
		boolean res=false;
		if(GoalTypeVerification.contains("Test"))
		{
			res=true;
			System.out.println("Test information display successfully.");
		}
		Assert.assertEquals(res, true,"Test information not display successfully.");
		
	}
	
	@Test(priority = 3)
	public void TestGoalTracking() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		performance.AddGoalTracking();
		String GoalTrackingVerification = driver.findElement(By.xpath("//td[contains(text(),'EvolutionCO')]")).getText();
		//System.out.println(GoalTrackingVerification);
		boolean res=false;
		if(GoalTrackingVerification.contains(CompanyName))
		{
			res=true;
			System.out.println("GoalTracking information display successfully.");
		}
		Assert.assertEquals(res, true,"GoalTracking information not display successfully.");
		
	}

	
		@AfterMethod
	     public void end()
	     {
	    	 driver.close();
	     }
	
}
