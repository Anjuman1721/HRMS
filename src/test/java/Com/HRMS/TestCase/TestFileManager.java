package Com.HRMS.TestCase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.HRMS.Base.HRMSBase;
import Com.HRMS.Pages.FileManager;
import Com.HRMS.Pages.HomePage;
import Com.HRMS.Pages.LoginPage;

public class TestFileManager extends HRMSBase
{
	LoginPage loginpage;
	HomePage homepage;
	FileManager filemanager;
	
    public TestFileManager()
    {
    	super();
    }
    
    @BeforeMethod
    public void start()
    {
    	initialization();
    	loginpage = new LoginPage();
    	homepage = new HomePage();
    	filemanager = new FileManager();
    	 
    }
    
    @Test
    public void TestFile() throws InterruptedException
    {
    	loginpage.login();
    	homepage.hrms();
    	filemanager.AddFile();
    	String FileVerification = driver.findElement(By.xpath("//td[contains(text(),'QA')]")).getText();
    	boolean res=false;
		if(FileVerification.contains("QA"))
		{
			res=true;
			System.out.println("File add successfully");
		}
		Assert.assertEquals(res, true,"File not add successfully.");
		
	}
    
}
