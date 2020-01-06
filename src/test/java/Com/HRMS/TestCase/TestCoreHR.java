package Com.HRMS.TestCase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.HRMS.Base.HRMSBase;
import Com.HRMS.Pages.CoreHRpage;
import Com.HRMS.Pages.HomePage;
import Com.HRMS.Pages.HrmsStaffPage;
import Com.HRMS.Pages.LoginPage;
import Com.HRMS.Pages.OrganizationPage;

public class TestCoreHR extends HRMSBase
{
	LoginPage loginpage;
    HomePage homepage;
    HrmsStaffPage hrmsstaffpage;
    CoreHRpage corehrpage;
    OrganizationPage organizationpage;
    
    public TestCoreHR()
    {
    	super();
    }
   
    @BeforeMethod
    public void start()
    {
    	initialization();
    	 loginpage = new LoginPage();
         homepage = new HomePage();
         hrmsstaffpage = new HrmsStaffPage();
         corehrpage = new CoreHRpage();
         organizationpage= new OrganizationPage();
    }
    
    @Test(priority = 0)
    public void TestAward() throws InterruptedException
    {
    	loginpage.login();
    	homepage.CoreHR();
    	corehrpage.AddAward();
    	String AwardVerification = driver.findElement(By.xpath("//td[contains(text(),'Arjun Verma')]")).getText();
    	//System.out.println(AwardVerification);
    	boolean res=false;
    	if(AwardVerification.contains(Name))
    	{
    		res=true;
    		System.out.println("Employee award information added successfully");
    	}
        Assert.assertEquals(res, true,"Employee award information not added successfully");
        Thread.sleep(3000);
        
    }
    
    @Test(priority = 1)
    public void TestTransfer() throws InterruptedException
    {
    	loginpage.login();
    	homepage.CoreHR();
    	corehrpage.AddTransfer();
    	String TransferVerification = driver.findElement(By.xpath("//td[contains(text(),'Arjun Verma')]")).getText();
    	//System.out.println(TransferVerification);
    	boolean res=false;
    	if(TransferVerification.contains(Name))
    	{
    		res=true;
    		System.out.println("Employee transfer information added successfully");
    	}
        Assert.assertEquals(res, true,"Employee transfer information not added successfully");
        Thread.sleep(3000);
        
    }
    
    @Test(priority = 2)
    public void TestResignation() throws InterruptedException
    {
    	loginpage.login();
    	homepage.CoreHR();
    	corehrpage.AddResignation();
    	String ResignationVerification = driver.findElement(By.xpath("//td[contains(text(),'Arjun Verma')]")).getText();
    	//System.out.println(ResignationVerification);
    	boolean res=false;
    	if(ResignationVerification.contains(Name))
    	{
    		res=true;
    		 System.out.println("Employee resignation information added successfully");
    	}
        Assert.assertEquals(res, true,"Employee resignation information not added successfully");
        Thread.sleep(3000);
       
    	
    }
    
    @Test(priority = 3)
    public void TestTravel() throws InterruptedException
    {
    	loginpage.login();
    	homepage.CoreHR();
    	corehrpage.AddTravel();
    	String TravelVerification = driver.findElement(By.xpath("//td[contains(text(),'Arjun Verma')]")).getText();
    	//System.out.println(TravelVerification);
    	boolean res=false;
    	if(TravelVerification.contains(Name))
    	{
    		res=true;
    		System.out.println("Employee travel information added successfully");
    	}
        Assert.assertEquals(res, true,"Employee travel information not added successfully");
        Thread.sleep(3000);
        
    }
    	
    
   @Test(priority = 4)
    public void TestPromotion() throws InterruptedException
    {
    	loginpage.login();
    	homepage.CoreHR();
    	corehrpage.AddPromotion();
    	String PromotionVerification = driver.findElement(By.xpath("//td[contains(text(),'Arjun Verma')]")).getText();
    	//System.out.println(PromotionVerification);
    	boolean res=false;
    	if(PromotionVerification.contains(Name))
    	{
    		res=true;
    		System.out.println("Employee promotion information added successfully");
    	}
        Assert.assertEquals(res, true,"Employee promotion information Not added successfully");	
        Thread.sleep(3000);
        
    }
    
    @Test(priority = 5)
    public void TestComplaint() throws InterruptedException
    {
    	loginpage.login();
    	homepage.CoreHR();
    	corehrpage.AddComplaint();
    	String ComplaintVerification = driver.findElement(By.xpath("//td[contains(text(),'Arjun Verma')]")).getText();
    	//System.out.println(ComplaintVerification);
    	boolean res=false;
    	if(ComplaintVerification.contains(Name))
    	{
    		res=true;
    		System.out.println("Employee complaint information added successfully");
    	}
        Assert.assertEquals(res, true,"Employee complaint information Not added successfully");	
        Thread.sleep(3000);
        
    }
    
    
    @Test(priority = 7)
    public void TestTermination() throws InterruptedException
    {
    	loginpage.login();
    	homepage.CoreHR();
    	corehrpage.AddTermination();
    	String TerminationVerification = driver.findElement(By.xpath("//td[contains(text(),'Arjun Verma')]")).getText();
    	//System.out.println(TerminationVerification);
    	boolean res=false;
    	if(TerminationVerification.contains(Name))
    	{
    		res=true;
    		System.out.println("Employee termination information added successfully");
    	}
        Assert.assertEquals(res, true,"Employee termination information Not added successfully");	
        Thread.sleep(3000);
        
    }
    
    @Test(priority = 6)
    public void TestWarning() throws InterruptedException
    {
    	loginpage.login();
    	homepage.CoreHR();
    	corehrpage.AddWarning();
    	String WarningVerification = driver.findElement(By.xpath("//td[contains(text(),'Arjun Verma')]")).getText();
    	//System.out.println(WarningVerification);
    	boolean res=false;
    	if(WarningVerification.contains(Name))
    	{
    		res=true;
    		System.out.println("Employee warning information added successfully");
    	}
        Assert.assertEquals(res, true,"Employee warning information Not added successfully");	
        Thread.sleep(3000);
        
    }
    
    @AfterMethod
    public void end()
    {
    	driver.close();
    }
}
