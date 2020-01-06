package Com.HRMS.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.HRMS.Base.HRMSBase;
import Com.HRMS.Pages.HomePage;
import Com.HRMS.Pages.LoginPage;
import Com.HRMS.Pages.Tickets;

public class TestTickets extends HRMSBase
{
	LoginPage loginpage;
	HomePage homepage;
	Tickets tickets;
	
	public TestTickets()
	{
		super();
	}
	
	@BeforeMethod
	public void start()
	{
		initialization();
		loginpage= new LoginPage();
 		homepage = new HomePage();
 		tickets = new Tickets();
	}
	
	@Test
	public void testTickets() throws InterruptedException
	{
		loginpage.login();
		homepage.hrms();
		tickets.AddTickets();
	}
	
	@AfterMethod
	public void end()
	{
		driver.close();
	}
}
