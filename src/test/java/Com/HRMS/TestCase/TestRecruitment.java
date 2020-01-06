package Com.HRMS.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.HRMS.Base.HRMSBase;
import Com.HRMS.Pages.HomePage;
import Com.HRMS.Pages.JobPrtal;
import Com.HRMS.Pages.LoginPage;
import Com.HRMS.Pages.Recruitment;

public class TestRecruitment extends HRMSBase
{
		LoginPage loginpage;
		HomePage homepage;
		Recruitment recruitment;
		JobPrtal jobprtal;
		
		public TestRecruitment()
		{
			super();
		}
		
		@BeforeMethod
		public void start()
		{
			initialization();
			loginpage= new LoginPage();
	 		homepage = new HomePage();
	 		recruitment= new Recruitment();
	 		//jobprtal= new JobPrtal();
		}
		
		@Test
		public void TestAddRecruitments() throws InterruptedException
		{
			loginpage.login();
			homepage.hrms();
			 jobprtal = recruitment.AddRecruitment();			
			String vall = jobprtal.portal();
			System.out.println(vall);
			Assert.assertEquals(vall, "Test Full Time");
			
		}
		
		@Test
		public void TestAddEmployer() throws InterruptedException
		{
			loginpage.login();
			homepage.hrms();
			recruitment.AddNewEmployer();
			
		}
		
		@AfterMethod
		public void end()
		{
			driver.close();
		}
}
