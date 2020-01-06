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

public class TestHrmsStaffPage extends HRMSBase 
{
	LoginPage loginpage;
	HomePage homepage;
	HrmsStaffPage hrmsstaffpage;

	public TestHrmsStaffPage()
	{
		super();
	}

	@BeforeMethod
	public void start()
	{
		initialization();
		loginpage=new LoginPage();
		homepage=new HomePage();
		hrmsstaffpage=new HrmsStaffPage();	 

	}

	@Test(priority = 0)
	public void TestCreateEmployee() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		hrmsstaffpage.NewEmployee();
		String CreateEmployeeVerification = driver.findElement(By.xpath("//td[contains(text(),'Arjun Verma')]")).getText();
		//System.out.println(CreateEmployeeVerification);
		boolean res=false;
		if(CreateEmployeeVerification.contains(Name))
		{
			res=true;
			System.out.println("New employee added successfully");
		}
		Assert.assertEquals(res, true,"New Employee not added successfully");
		Thread.sleep(3000);
		
	}

	 @Test (priority = 2)
     public void TestCustomField() throws InterruptedException
     {
    	 loginpage.login();
    	 homepage.hrms();
    	 hrmsstaffpage.AddCustomField();
    	 String CustomFieldVerification = driver.findElement(By.xpath("//td[contains(text(),'Employees')]")).getText();
      	//System.out.println(CustomFieldVerification);
      	boolean res=false;
      	if(CustomFieldVerification.contains("Employees"))
      	{
      		res=true;
      		 System.out.println("New Custom field added.");
      	}
          Assert.assertEquals(res, true,"CustomField not added successfully");
          Thread.sleep(3000);
    	
     }

     @Test(priority = 1)
     public void TestStaffDirectory() throws InterruptedException
     {
    	 loginpage.login();
    	 homepage.hrms();
    	 hrmsstaffpage.StaffDirectory();
    	 String StaffVerification = driver.findElement(By.xpath("//a[contains(text(),'Arjun Verma')]")).getText();
      	//System.out.println(StaffVerification);
      	boolean res=false;
      	if(StaffVerification.contains(Name))
      	{
      		res=true;
      		System.out.println("Staff Directory information added successfully");
      	}
          Assert.assertEquals(res, true,"Staff Directory information not added successfully");
          Thread.sleep(3000);
          
     }

     @Test(priority = 3)
     public void TestEmployeeExit() throws InterruptedException
     {
    	 loginpage.login();
    	 homepage.hrms();
    	 hrmsstaffpage.EmployeeExit();
    	 String EmployeeExitVerification = driver.findElement(By.xpath("//td[contains(text(),'Arjun Verma')]")).getText();
     	//System.out.println(EmployeeExitVerification);
     	boolean res=false;
     	if(EmployeeExitVerification.contains(Name))
     	{
     		res=true;
     		System.out.println("Employee exit information added successfully");
     	}
         Assert.assertEquals(res, true,"Employee exit information not added successfully");
         Thread.sleep(3000);
         

     }

     @AfterMethod
     public void End()
     {
    	 driver.close();
     }
}
