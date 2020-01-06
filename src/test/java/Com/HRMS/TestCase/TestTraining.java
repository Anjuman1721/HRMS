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
import Com.HRMS.Pages.TrainingPage;

public class TestTraining extends HRMSBase
{
	LoginPage loginpage;
	HomePage homepage;
	HrmsStaffPage hrmsstaffpage;
	OrganizationPage organizationPage;
	TimeSheetPage timesheetpage;
	TrainingPage trainingpage;
	
     public TestTraining()
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
     }
     
    @Test(priority = 0)
     public void TestTrainer() throws InterruptedException
     {
    	loginpage.login();
 		homepage.Training();
 		trainingpage.AddTrainer();
 		String TrainerVerification = driver.findElement(By.xpath("//td[contains(text(),'Snehal Shaha')]")).getText();
		//System.out.println(TrainerVerification);
		boolean res=false;
		if(TrainerVerification.contains("Snehal Shaha"))
		{
			res=true;
			System.out.println("Trainer information display successfully.");
		}
		Assert.assertEquals(res, true,"Trainer information not display successfully.");
		Thread.sleep(3000); 
     }
     
     @Test(priority = 2)
     public void TestTraining1() throws InterruptedException
     {
    	loginpage.login();
 		homepage.Training();
 		trainingpage.AddTraining();
 		String TrainingVerification = driver.findElement(By.xpath("//li[contains(text(),'Arjun Verma')]")).getText();
		//System.out.println(TrainingVerification);
		boolean res=false;
		if(TrainingVerification.contains(Name))
		{
			res=true;
			System.out.println("Training information display successfully.");
		}
		Assert.assertEquals(res, true,"Training information not display successfully.");
		Thread.sleep(3000); 
     }
     
     @Test(priority = 1)
     public void TestTrainingType() throws InterruptedException
     {
    	loginpage.login();
 		homepage.Training();
 		trainingpage.TrainingType();
 		String TrainingTypeVerification = driver.findElement(By.xpath("//td[contains(text(),'Test')]")).getText();
		//System.out.println(TrainingTypeVerification);
		boolean res=false;
		if(TrainingTypeVerification.contains("Test"))
		{
			res=true;
			System.out.println("Training Type information display successfully.");
		}
		Assert.assertEquals(res, true,"Training Type information not display successfully.");
		Thread.sleep(3000); 
     }
     
     @AfterMethod
     public void end()
     {
    	 driver.close();
     }
     
}
