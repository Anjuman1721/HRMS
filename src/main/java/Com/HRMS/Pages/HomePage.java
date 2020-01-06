package Com.HRMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.Base.HRMSBase;

public class HomePage extends HRMSBase
{
        @FindBy(xpath ="//span[contains(text(),'HRMS')]")
        WebElement hrmsLink;
        
        public HomePage()
        {
        	PageFactory.initElements(driver, this);
        }
        
        public HrmsStaffPage hrms()
        {
        	hrmsLink.click();
        	return new HrmsStaffPage();
        }
        
        public OrganizationPage Organization()
        {
        	hrmsLink.click();
        	return new OrganizationPage();
        }
        
        public CoreHRpage CoreHR()
        {
        	hrmsLink.click();
        	return new CoreHRpage();
        }
        
        public TimeSheetPage Timesheet()
        {
        	hrmsLink.click();
        	return new TimeSheetPage();
        }
        
        public TrainingPage Training()
        {
        	hrmsLink.click();
        	return new TrainingPage();
        }
        
}
