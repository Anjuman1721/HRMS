package Com.HRMS.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HRMSBase 
{
	public static WebDriver driver;
	public String Name="Arjun Verma";
	public String CompanyName="EvolutionCO";
	public String DepartmentName="QA";
	public String DesignationName ="Sr. Automation Tester";
	public String AdminName ="sonu verma";
	public String OfficialDocuments="Pan Card";
	public String Attendance="Dec-01-2019 09:30 am";
	
   public static void initialization()
   {
	   System.setProperty("webdriver.chrome.driver", "../HRMS/exe/chromedriver79.exe");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   driver.get("http://www.evolutionco.in:9090/");
	 
   }
   public static void scrol(WebElement ele)
	{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",ele);
	//System.out.println("scrolled");
	}
   
   public static void ActionScroll(WebElement WEbEle)
   {
	   Actions action= new Actions(driver);
	   action.moveToElement(WEbEle);
	   System.out.println("scrolled");
	   action.click().perform();
	   
   }
}
