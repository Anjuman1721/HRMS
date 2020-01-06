package Com.HRMS.TestCase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.HRMS.Base.HRMSBase;
import Com.HRMS.Pages.HomePage;
import Com.HRMS.Pages.HrmsStaffPage;
import Com.HRMS.Pages.LoginPage;
import Com.HRMS.Pages.OrganizationPage;
import Com.HRMS.Pages.PayrollPage;
import Com.HRMS.Pages.TimeSheetPage;
import Com.HRMS.Pages.TrainingPage;

public class TestPayroll extends HRMSBase
{
	LoginPage loginpage;
	HomePage homepage;
	HrmsStaffPage hrmsstaffpage;
	OrganizationPage organizationPage;
	TimeSheetPage timesheetpage;
	TrainingPage trainingpage;
	PayrollPage payrollpage;
	
	public TestPayroll()
	{
		super();
	}
	
	@BeforeMethod
	public void start()
	{
		initialization();
		loginpage= new LoginPage();
 		homepage = new HomePage();
 		hrmsstaffpage = new HrmsStaffPage();
 		organizationPage = new OrganizationPage();
 		timesheetpage = new TimeSheetPage();
 		trainingpage = new TrainingPage();
 		payrollpage= new PayrollPage();
	}
	
	@Test
	public void TestSearch() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		payrollpage.SearchPayroll();
		String PayrollVerification = driver.findElement(By.xpath("//i[contains(text(),'(EvolutionCO)')]")).getText();
		//System.out.println(PayrollVerification);
		boolean res=false;
		if(PayrollVerification.contains(CompanyName))
		{
			res=true;
			System.out.println("Payroll information display successfully.");
		}
		Assert.assertEquals(res, true,"Payroll information not display successfully.");
		
	}
	
		@AfterMethod
	     public void end()
	     {
	    	 driver.close();
	     }
	
}
