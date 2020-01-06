package Com.HRMS.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.Base.HRMSBase;
import UTIL.SelectCode;

public class PayrollPage extends HRMSBase
{
	
	@FindBy(xpath = "//span[contains(text(),'Payroll')]")
	WebElement Payroll;
	
	@FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/payroll/generate_payslip']")
	WebElement PayrollGeneratedSlip;
	
	@FindBy(xpath = "//span[contains(text(),'All Companies')]")
	WebElement payrollCompanies;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement PayrollCompaniesSearch;
	
	@FindBy(xpath = "//span[contains(text(),'All Employees')]")
	WebElement PayrollEmployee;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement PayrollEmployeeSearch;
	
	@FindBy(xpath = "//input[@id='month_year']")
	WebElement PayrollSelectMonth;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement PayrollYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement PayrollMonth;
	
	@FindBy(xpath = "//button[contains(text(),'Done')]")
	WebElement PayrollDone;
	
	@FindBy(xpath = "//div[@class='col-md-5']//button[@class='btn btn-primary']")
	WebElement PayrollSearch;
	
	@FindBy(xpath = "//input[@class='form-control input-sm']")
	WebElement payrollDashboardSearch;
	
    public PayrollPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void SearchPayroll() throws InterruptedException
    {
    	scrol(Payroll);
    	Payroll.click();
    	scrol(PayrollGeneratedSlip);
    	PayrollGeneratedSlip.click();
    	Thread.sleep(2000);
    	payrollCompanies.click();
    	PayrollCompaniesSearch.sendKeys("EvolutionCO" + Keys.ENTER);
    	Thread.sleep(2000);
    	PayrollEmployee.click();
    	PayrollEmployeeSearch.sendKeys(" Arjun Verma" + Keys.ENTER);
    	Thread.sleep(2000);
    	PayrollSelectMonth.click();
    	Thread.sleep(2000);
        SelectCode.Sl(PayrollYear, "2019");
        SelectCode.Sl(PayrollMonth, "Nov");
        Thread.sleep(2000);
        PayrollDone.click();
        Thread.sleep(2000);
        PayrollSearch.click();
        Thread.sleep(2000);
    }
}
