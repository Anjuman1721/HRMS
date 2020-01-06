package Com.HRMS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.Base.HRMSBase;

public class JobPrtal extends HRMSBase
{
	 public JobPrtal()
	    {
	    	PageFactory.initElements(driver, this);
	    }
	 
	 
	 public String portal()
	 {
		 System.out.println(driver.getTitle());
		 String link = driver.findElement(By.xpath("//h2[contains(text(),'Test')]")).getText();
		 System.out.println(link);
		 return link;
	 }
}
