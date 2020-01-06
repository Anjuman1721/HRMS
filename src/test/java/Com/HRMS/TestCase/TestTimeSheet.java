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
import Com.HRMS.Pages.TimeSheetPage;

public class TestTimeSheet extends HRMSBase
{
	LoginPage loginpage;
	HomePage homepage;
	HrmsStaffPage hrmsstaffpage;
	OrganizationPage organizationPage;
	TimeSheetPage timesheetpage;

	public TestTimeSheet()
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
	}

	@Test(priority = 0)
	public void TestTimeSheetCalender() throws InterruptedException
	{
		loginpage.login();
		homepage.Timesheet();
		timesheetpage.AddTimeSheetCalender();
		String TimeSheetCalenderVerification = driver.findElement(By.xpath("//h3[@class='box-title']")).getText();
		//System.out.println(TimeSheetCalenderVerification);
		boolean res=false;
		if(TimeSheetCalenderVerification.contains(TimeSheetCalenderVerification))
		{
			res=true;
			System.out.println("TimesheetCalender information display successfully.");
		}
		Assert.assertEquals(res, true,"TimesheetCalender information not display successfully.");
		Thread.sleep(3000); 	
	}

	@Test(priority = 1)
	public void TestDatewiseAttendance() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		timesheetpage.AddDatewiseTimesheet();
		String DatewiseAttendanceVerification = driver.findElement(By.xpath("//td[contains(text(),'Arjun Verma')]")).getText();
		//System.out.println(DatewiseAttendanceVerification);
		boolean res=false;
		if(DatewiseAttendanceVerification.contains(Name))
		{
			res=true;
			System.out.println("Datewise Attendance information display successfully.");
		}
		Assert.assertEquals(res, true,"Datewise Attendance information not display successfully.");
		Thread.sleep(3000); 	
	}

	@Test(priority = 2)
	public void TestUpdateAttendance() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		timesheetpage.UpdateAttendance();
		String UpdateAttendanceVerification = driver.findElement(By.xpath("//td[contains(text(),'Dec-01-2019 09:30 am')]")).getText();
		//System.out.println(UpdateAttendanceVerification);
		boolean res=false;
		if(UpdateAttendanceVerification.contains(Attendance))
		{
			res=true;
			System.out.println("Update Attendance information display successfully.");
		}
		Assert.assertEquals(res, true,"Update Attendance information not display successfully.");
		Thread.sleep(3000); 
	}

	@Test(priority = 3)
	public void TestOverTime() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		timesheetpage.OverTime();
		String OverTimeVerification = driver.findElement(By.xpath("//td[contains(text(),'Dec-24-2019')]")).getText();
		//System.out.println(OverTimeVerification);
		boolean res=false;
		if(OverTimeVerification.contains("Dec-24-2019"))
		{
			res=true;
			System.out.println("OverTime information display successfully.");
		}
		Assert.assertEquals(res, true,"OverTime information not display successfully.");
		Thread.sleep(3000); 
	}

	@Test(priority = 4)
	public void TestOfficeShift() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		timesheetpage.OfficeShift();;
		String OfficeShiftVerification = driver.findElement(By.xpath("//td[contains(text(),'Night Shift')]")).getText();
		//System.out.println(OfficeShiftVerification);
		boolean res=false;
		if(OfficeShiftVerification.contains("Night Shift"))
		{
			res=true;
			System.out.println("OfficeShift information display successfully.");
		}
		Assert.assertEquals(res, true,"OfficeShift information not display successfully.");
		Thread.sleep(3000); 
	}

	@Test(priority = 5)
	public void TestManageHoliday() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		timesheetpage.ManageHoliday();
		String ManageHolidayVerification = driver.findElement(By.xpath("//td[contains(text(),'Holidays')]")).getText();
		//System.out.println(ManageHolidayVerification);
		boolean res=false;
		if(ManageHolidayVerification.contains("Holidays"))
		{
			res=true;
			System.out.println("New Holidays information Added successfully.");
		}
		Assert.assertEquals(res, true,"New Holidays information not Added successfully.");
		Thread.sleep(3000); 
	}

	@AfterMethod
	
	public void End()
	{
		driver.close();
	}
}
