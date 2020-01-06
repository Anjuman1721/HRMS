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

public class TestOrganizationPage extends HRMSBase
{
	LoginPage loginpage;
	HomePage homepage;
	HrmsStaffPage hrmsstaffpage;
	OrganizationPage organizationPage;

	public TestOrganizationPage()
	{
		super();
	}

	@BeforeMethod
	public void start()
	{
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		hrmsstaffpage= new HrmsStaffPage();
		organizationPage =new OrganizationPage();
	}

	@Test(priority = 0)
	public void TestCompany() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		organizationPage.AddCompany();
		String CompanyVerification = driver.findElement(By.xpath("//td[contains(text(),'EvolutionCO')]")).getText();
		//System.out.println(CompanyVerification);
		boolean res=false;
		if(CompanyVerification.contains(CompanyName))
		{
			res=true;
			System.out.println("Company information added successfully.");
		}
		Assert.assertEquals(res, true,"Company information not added successfully");
		Thread.sleep(3000); 	
	}

	@Test(priority = 1)
	public void TestOfficialDocuments() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		organizationPage.AddOfficialDocuments();
		String DocumentsVerification = driver.findElement(By.xpath("//td[contains(text(),'Pan Card')]")).getText();
		//System.out.println(DocumentsVerification);
		boolean res=false;
		if(DocumentsVerification.contains(OfficialDocuments))
		{
			res=true;
			System.out.println("Official Documents added successfully.");
		}
		Assert.assertEquals(res, true,"Official Documents  not added successfully");
		Thread.sleep(3000); 	
	}

	@Test(priority = 2)
	public void TestLocation() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		organizationPage.AddLocation();
		String LocationVerification = driver.findElement(By.xpath("//i[contains(text(),'Company: EvolutionCO')]")).getText();
		//System.out.println(LocationVerification);
		boolean res=false;
		if(LocationVerification.contains(CompanyName))
		{
			res=true;
			System.out.println("Location information added successfully.");
		}
		Assert.assertEquals(res, true,"Location information not added successfully");
		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void TestDepartment() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		organizationPage.AddDepartment();
		String DepartmentVerification = driver.findElement(By.xpath("//td[contains(text(),'QA')]")).getText();
		//System.out.println(DepartmentVerification);
		boolean res=false;
		if(DepartmentVerification.contains(DepartmentName))
		{
			res=true;
			System.out.println("Department information added successfully.");
		}
		Assert.assertEquals(res, true,"Department information not added successfully");
		Thread.sleep(3000);

	}

	@Test(priority = 4)
	public void TestDesignation() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		organizationPage.AddDesignation();
		String DesignationVerification = driver.findElement(By.xpath("//td[contains(text(),'Sr. Automation Tester')]")).getText();
		//System.out.println(DesignationVerification);
		boolean res=false;
		if(DesignationVerification.contains(DesignationName))
		{
			res=true;
			System.out.println("Designation information added successfully.");
		}
		Assert.assertEquals(res, true,"Designation information not added successfully");
		Thread.sleep(3000);

	}

	@Test(priority = 5)
	public void TestAnnouncement() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		organizationPage.AddAnnouncement();
		String AnnouncementVerification = driver.findElement(By.xpath("//td[contains(text(),'Test')]")).getText();
		//System.out.println(AnnouncementVerification);
		boolean res=false;
		if(AnnouncementVerification.contains("Test"))
		{
			res=true;
			System.out.println("Announcement added successfully.");
		}
		Assert.assertEquals(res, true,"Announcement not added successfully");
		Thread.sleep(3000); 	
	}

	@Test(priority = 6)
	public void TestPolicy() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		organizationPage.AddPolicy();
		String PolicyVerification = driver.findElement(By.xpath("//td[contains(text(),'Test')]")).getText();
		//System.out.println(PolicyVerification);
		boolean res=false;
		if(PolicyVerification.contains("Test"))
		{
			res=true;
			System.out.println("Policy added successfully.");
		}
		Assert.assertEquals(res, true,"Policy not added successfully");
		Thread.sleep(3000); 	
	}

	@AfterMethod
	public void End()
	{
		driver.close();
	}
}

