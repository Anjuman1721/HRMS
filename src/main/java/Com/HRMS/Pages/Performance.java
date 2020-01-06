package Com.HRMS.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.Base.HRMSBase;
import UTIL.SelectCode;

public class Performance extends HRMSBase
{
   @FindBy(xpath = "//span[contains(text(),'Performance')]")
   WebElement performance;
   
   @FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/performance_indicator']")
   WebElement performanceIndicator;
   
   @FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
   WebElement performanceAddNew;
   
   @FindBy(xpath = "//span[contains(text(),'Company')]")
   WebElement performanceCompany;
   
   @FindBy(xpath = "//input[@class='select2-search__field']")
   WebElement performanceCompanySearch;
   
    @FindBy(xpath = "//body//div//div//div//div//div//div[2]//div[2]//div[2]//div[1]//select[1]")
    WebElement performanceIntegrity;
    
    @FindBy(xpath = "//span[contains(text(),'Select Designation')]")
    WebElement performanceDesignation;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement performanceDesignationSearch;
    
    @FindBy(xpath = "//body//div//div//div//div//div//div//div//div//div[1]//div[1]//div[2]//div[1]//select[1]")
    WebElement performanceCustomerExpirence;
    
    @FindBy(xpath = "//div//div//div//div//div//div//div//div//div[1]//div[2]//div[2]//div[1]//select[1]")
    WebElement performanceMarketing;
    
    @FindBy(xpath = "//div//div//div//div//div//div//div//div//div[1]//div[3]//div[2]//div[1]//select[1]")
    WebElement performanceAdministration;
    
    @FindBy(xpath = "//div//div//div//div//div//div[2]//div[1]//div[2]//div[1]//select[1]")
    WebElement performanceProfessionalism;
    
    @FindBy(xpath = "//div//div//div//div//div//div[2]//div[3]//div[2]//div[1]//select[1]")
    WebElement performanceAttendance;
    
    @FindBy(xpath = "//div[@id='add_form']//button[1]")
    WebElement performanceSave;
    
    //--------Appraisal----------
    
    @FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/performance_appraisal']")
    WebElement Appraisal;
    
    @FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
    WebElement AppraisalAddNew;
    
    @FindBy(xpath = "//span[contains(text(),'Company')]")
    WebElement AppraisalCompany;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement AppraisalCompanySearch;
    
    @FindBy(xpath = "//span[contains(text(),'Choose an Employee')]")
    WebElement AppraisalEmployee;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement AppraisalEmployeeeSearch;
    
    @FindBy(xpath = "//input[@id='month_year']")
    WebElement AppraisalSelectMonth;
    
    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    WebElement AppraisalYear;
    
    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    WebElement AppraisalMonth;
    
    @FindBy(xpath = "//body//div//div//div//div//div//div//div//div//div[1]//div[1]//table[1]//tbody[1]//tr[2]//td[2]//select[1]")
    WebElement AppraisalCustomerExp;
    
    @FindBy(xpath = "//button[contains(text(),'Done')]")
    WebElement AppraisalDone;
    
    @FindBy(xpath = "//body//div//div//div//div//div//div//div//div//div[1]//div[1]//table[1]//tbody[1]//tr[3]//td[2]//select[1]")
    WebElement AppraisalMarketing;
    
    @FindBy(xpath = "//body//div//div//div//div//div//div//div//div//div[1]//div[1]//table[1]//tbody[1]//tr[4]//td[2]//select[1]")
    WebElement AppraisalAdministration;
    
    @FindBy(xpath = "//div//div//div//div//div//div//div//div//div//div[2]//div[1]//table[1]//tbody[1]//tr[2]//td[2]//select[1]")
    WebElement AppraisalProfessinal;
    
    @FindBy(xpath = "//div//div//div//div//div//div//div//div//div//div[2]//div[1]//table[1]//tbody[1]//tr[3]//td[2]//select[1]")
    WebElement AppraisalIntegrity;
    
    @FindBy(xpath = "//div//div//div//div//div//div//div//div//div//div[2]//div[1]//table[1]//tbody[1]//tr[4]//td[2]//select[1]")
    WebElement AppraisalAttendance;
    
    @FindBy(xpath = "//div[@class='form-actions box-footer']//button[1]")
    WebElement AppraisalSave;
    
    //----------Goal Tracking-------
    
    @FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/goal_tracking/type']")
    WebElement GoalType;
    
    @FindBy(xpath = "//input[@placeholder='Goal Type']")
    WebElement GoalTypeName;
    
    @FindBy(xpath = "//div[@class='col-md-4']//button[1]")
    WebElement GoalTypeSave;
    
    @FindBy(xpath = "//input[@class='form-control input-sm']")
    WebElement GoalTypeSearch;
    
    //------GoalTracking----
    
    @FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/goal_tracking']")
    WebElement GoalTracking;
    
    @FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
    WebElement GoalTrackingAddNew;
    
    @FindBy(xpath = "//span[contains(text(),'Company')]")
    WebElement GoalTrackingCompany;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement GoalTrackingCompanySearch;
    
    @FindBy(xpath = "//span[contains(text(),'Goal Type')]")
    WebElement GoalTrackingType;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement GoalTrackingTypeSearch;
    
    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement GoalTrackingSubject;
    
    @FindBy(xpath = "//input[@placeholder='Target Achievement']")
    WebElement GoalTrackingAchievement;
    
    @FindBy(xpath = "//textarea[@id='description']")
    WebElement GoalTrackingDescription;
    
    @FindBy(xpath = "//input[@placeholder='Start Date']")
    WebElement GoalTrackingStartDate;
    
    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    WebElement GoalTrackingStartYear;
    
    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    WebElement GoalTrackingStartMonth;
    
    @FindBy(xpath = "//a[contains(text(),'20')]")
    WebElement GoalTrackingStartDate1;
    
    @FindBy(xpath = "//input[@placeholder='End Date']")
    WebElement GoalTrackingEndDate;
    
    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    WebElement GoalTrackingEndYear;
    
    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    WebElement GoalTrackingEndMonth;
    
    @FindBy(xpath = "//a[contains(text(),'23')]")
    WebElement GoalTrackingEndDate1;
    
    @FindBy(xpath = "//div[@id='add_form']//button[1]")
    WebElement GoalTrackingSave;
  
     public Performance()
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void AddIndicator() throws InterruptedException
   {
	   scrol(performance);
	   performance.click();
	   Thread.sleep(2000);
	   performanceIndicator.click();
	   performanceAddNew.click();
	   Thread.sleep(1000);
	   performanceCompany.click();
	   Thread.sleep(1000);
	   performanceCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
	   Thread.sleep(1000);
	   performanceDesignation.click();
	   Thread.sleep(1000);
	   performanceDesignationSearch.sendKeys("Sr. Automation Tester" + Keys.ENTER);
	   Thread.sleep(1000);
	   SelectCode.Sl(performanceCustomerExpirence, " Intermediate");
	   Thread.sleep(1000);
	   SelectCode.Sl(performanceMarketing, " Intermediate");
	   Thread.sleep(1000);
	   SelectCode.Sl(performanceAdministration, " Intermediate");
	   Thread.sleep(1000);
	   SelectCode.Sl(performanceProfessionalism, " Intermediate");
	   Thread.sleep(1000);
	   SelectCode.Sl(performanceIntegrity, " Intermediate");
	   Thread.sleep(1000);
	   SelectCode.Sl(performanceAttendance, " Intermediate");
	   performanceSave.click();
	   Thread.sleep(1000);
   }
   
   public void AddApraisal() throws InterruptedException
   {
	   scrol(performance);
	   performance.click();
	   Thread.sleep(2000);
	   scrol(Appraisal);
	   Appraisal.click();
	   AppraisalAddNew.click();
	   Thread.sleep(2000);
	   AppraisalCompany.click();
	   Thread.sleep(1000);
	   AppraisalCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
	   Thread.sleep(2000);
	   AppraisalEmployee.click();
	   Thread.sleep(1000);
	   AppraisalEmployeeeSearch.sendKeys(" Arjun Verma" + Keys.ENTER);
	   Thread.sleep(2000);
	   AppraisalSelectMonth.click();
	   Thread.sleep(2000);
	   SelectCode.Sl(AppraisalYear, "2019");
	   SelectCode.Sl(AppraisalMonth, "Dec");
	   AppraisalDone.click();
	   Thread.sleep(2000);
	   SelectCode.Sl(AppraisalCustomerExp, "Intermediate");
	   Thread.sleep(1000);
	   SelectCode.Sl(AppraisalMarketing, "Intermediate");
	   Thread.sleep(1000);
	   SelectCode.Sl(AppraisalAdministration, "Intermediate");
	   Thread.sleep(1000);
	   SelectCode.Sl(AppraisalProfessinal, "Intermediate");
	   Thread.sleep(1000);
	   SelectCode.Sl(AppraisalIntegrity, "Intermediate");
	   Thread.sleep(1000);
	   SelectCode.Sl(AppraisalAttendance, "Intermediate");
	   Thread.sleep(1000);
	   AppraisalSave.click();
	   Thread.sleep(2000);
   }
   
   public void AddGoalType() throws InterruptedException
   {
	   scrol(performance);
	   performance.click();
	   Thread.sleep(2000);
	   GoalType.click();
	   GoalTypeName.sendKeys("Test");
	   GoalTypeSave.click();
	   GoalTypeSearch.sendKeys("Test");
	   Thread.sleep(1000);
   }
   
   public void AddGoalTracking() throws InterruptedException
   {
	   scrol(performance);
	   performance.click();
	   Thread.sleep(2000);
	   GoalTracking.click();
	   GoalTrackingAddNew.click();
	   GoalTrackingCompany.click();
	   Thread.sleep(1000);
	   GoalTrackingCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
	   Thread.sleep(1000);
	   GoalTrackingType.click();
	   GoalTrackingTypeSearch.sendKeys("Test" + Keys.ENTER);
	   Thread.sleep(1000);
	   GoalTrackingSubject.sendKeys("Test1");
	   GoalTrackingAchievement.sendKeys("Test2");
	   GoalTrackingDescription.sendKeys("Test3");
	   GoalTrackingStartDate.click();
	   Thread.sleep(1000);
	   SelectCode.Sl(GoalTrackingStartYear,"2019");
	   SelectCode.Sl(GoalTrackingStartMonth,"Dec");
	   GoalTrackingStartDate1.click();
	   Thread.sleep(1000);
	   GoalTrackingEndDate.click();
	   SelectCode.Sl(GoalTrackingEndYear, "2019");  
	   SelectCode.Sl(GoalTrackingEndMonth, "Dec");
	   Thread.sleep(1000);
	   GoalTrackingEndDate1.click();
	   GoalTrackingSave.click();
	   Thread.sleep(1000);
	   }
}
