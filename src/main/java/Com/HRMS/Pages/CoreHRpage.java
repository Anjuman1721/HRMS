package Com.HRMS.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.Base.HRMSBase;
import UTIL.SelectCode;

public class CoreHRpage extends HRMSBase
{
	//-------Award---------
	@FindBy(xpath = "//span[contains(text(),'Core HR')]")
	WebElement CoreHR;
	
	@FindBy(xpath = "//a[@href=\"http://www.evolutionco.in:9090/hrms/admin/awards\" ]")
	WebElement Awards;
	
	@FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
	WebElement AwardAdd;
	
	@FindBy(xpath = "//span[contains(text(),'Company')]")
	WebElement AwardCompany;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement AwardCompanySearch;
	
	@FindBy(xpath = "//span[contains(text(),'Choose an Employee')]")
	WebElement AwardEmplyee;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement AwardEmployeeSearch;
	
	@FindBy(xpath = "//span[contains(text(),'Award Type')]")
	WebElement AwardType;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement AwardTypeSearch;
	
	@FindBy(xpath = "//input[@placeholder='Award Date']")
	WebElement AwardDate;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement AwardYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement AwardMonth;
	
	@FindBy(xpath = "//a[contains(text(),'11')]")
	WebElement AwardDate1;
	
	@FindBy(xpath = "//input[@placeholder='Cash']")
	WebElement AwardCash;
	
	@FindBy(xpath = "//input[@placeholder='Month & Year']")
	WebElement AwardMonthAndYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement AwardAddYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement AwardAddMonth;
	
	@FindBy(xpath = "//button[contains(text(),'Done')]")
	WebElement AwardMonthYearButton;
	
	@FindBy(xpath = "//input[@id='award_picture']")
	WebElement AddFile;
	
	@FindBy(xpath = "//textarea[@id='award_information']")
	WebElement AwardInfo;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement AwardSave;
	
	//------------Transfer--------
	
	@FindBy(xpath = "//a[@href=\"http://www.evolutionco.in:9090/hrms/admin/transfers\"]")
	WebElement Transfers;
	
	@FindBy(xpath = "//button[contains(.,' Add New')]")
	WebElement TransfersAddNew;
	
	@FindBy(xpath = "//span[@id='select2-aj_company-container']")
	WebElement TransfersCompany;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement TransfersCompanySearch;
	
	@FindBy(xpath = "//span[contains(text(),'Choose an Employee')]")
	WebElement TransfersEmployee;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement TransfersEmployeeSearch;
	
	@FindBy(xpath = "//input[@placeholder='Transfer Date']")
	WebElement TransfersDate;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement TransfersYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement TransfersMonth;
	
	@FindBy(xpath = "//a[contains(text(),'13')]")
	WebElement TransfersDate1;
	
	@FindBy(xpath = "//span[contains(text(),'Select Department')]")
	WebElement TransfersDepartment;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement TransfersDepartmentSearch;
	
	@FindBy(xpath = "//span[contains(text(),'Select Location')]")
	WebElement TransfersLocation;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement TransfersLocationSearch;

	@FindBy(xpath = "//div[@id='add_form']//button[1]")
	WebElement TransfersSave;
	
	//----------Resignation------------
	
	@FindBy(xpath = "//a[@href=\"http://www.evolutionco.in:9090/hrms/admin/resignation\"]") 
	WebElement Resignation;
	
	@FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
	WebElement ResignationAddNew;
	
	@FindBy(xpath = "//span[contains(text(),'Company')]") 
	WebElement ResignationCompany;
	
	@FindBy(xpath = "//input[@class='select2-search__field']") 
	WebElement ResignationCompanySearch;
	
	@FindBy(xpath = "//span[contains(text(),'Choose an Employee')]") 
	WebElement ResignationEmployee;
	
	@FindBy(xpath = "//input[@class='select2-search__field']") 
	WebElement ResignationEmployeeSearch;
	
	@FindBy(xpath ="//input[@placeholder='Notice Date']") 
	WebElement ResignationNoticeDate;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']") 
	WebElement ResignationYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']") 
	WebElement ResignationMonth;
	
	@FindBy(xpath = "//a[contains(text(),'11')]") 
	WebElement ResignationDate;
	
	@FindBy(xpath = "//textarea[@id='reason']") 
	WebElement ResignationReason;
	
	@FindBy(xpath = "//input[@placeholder=\"Resignation Date\"]") 
	WebElement ResignationResignDate;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']") 
	WebElement ResignationResignYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']") 
	WebElement ResignationResignMonth;
	
	@FindBy(xpath = "//a[contains(text(),'31')]") 
	WebElement ResignationDate1;
	
	@FindBy(xpath = "//div[@id='add_form']//button[1]") 
	WebElement ResignationSave;
	
	//---------Travels--------
	
	@FindBy(xpath = "//a[@href=\"http://www.evolutionco.in:9090/hrms/admin/travel\"]")
	WebElement Travel;
	
	@FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
	WebElement TravelAddNew;
	
	@FindBy(xpath = "//span[contains(text(),'Company')]")
	WebElement TravelCompany;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement TravelCompanySearch;
	
	@FindBy(xpath = "//span[contains(text(),'Choose an Employee')]")
	WebElement TravelEmployee;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement TravelEmployeeSearch;
	
	@FindBy(xpath = "//input[@placeholder='Start Date']")
	WebElement TravelStartDate;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement TravelStartYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement TravelStartMonth;
	
	@FindBy(xpath = "//a[contains(text(),'21')]")
	WebElement TravelStartDate1;
	
	@FindBy(xpath = "//input[@placeholder='End Date']")
	WebElement TravelEndDate;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement TravelEndYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement TravelEndMonth;
	
	@FindBy(xpath = "//a[contains(text(),'22')]")
	WebElement TravelEndDate1;
	
	@FindBy(xpath = "//input[@placeholder='Purpose of VisitPurpose of Visit']")
	WebElement TravelPurpose;
	
	@FindBy(xpath = "//input[@placeholder='Place of Visit']")
	WebElement TravelVisit;
	
	@FindBy(xpath = "//textarea[@id='description']")
	WebElement TravelDescription;
	
	@FindBy(xpath = "//input[@placeholder='Expected Budget']")
	WebElement TravelExpectedBudget;
	
	@FindBy(xpath = "//input[@placeholder='Actual Budget']")
	WebElement TravelActualBudget;
	
	@FindBy(xpath = "//span[contains(text(),'By Bus')]")
	WebElement TravelMode;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement TravelModeSearch;
	
	@FindBy(xpath = "//span[contains(text(),'Corporation')]")
	WebElement TravelCorporation;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement TravelCorporationSearch;
	
	@FindBy(xpath = "//div[@id='add_form']//button[1]")
	WebElement TravelSave;

	//-------------Promotion--------
	
	@FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/promotion']")
	WebElement Promotion;
	
	@FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
	WebElement PromotionAddNew;
	
	@FindBy(xpath = "//span[contains(text(),'Company')]")
	WebElement PromotionCompany;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement PromotionCompanySearch;
	
	@FindBy(xpath = "//span[contains(text(),'Choose an Employee')]")
	WebElement PromotionEmployee;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement PromotionEmployeeSearch;
	
	@FindBy(xpath = "//input[@placeholder='Promotion Title']")
	WebElement PromotionTitle;
	
	@FindBy(xpath = "//textarea[@id='description']")
	WebElement PromotionDesription;
	
	@FindBy(xpath = "//input[@placeholder='Promotion Date']")
	WebElement PromotionDate;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement PromotionYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement PromotionMonth;
	
	@FindBy(xpath = "//a[contains(text(),'17')]")
	WebElement PromotionDate1;
	
	@FindBy(xpath = "//div[@id='add_form']//button[1]")
	WebElement PromotionSave;
	
	//------------Complaint-------
	
	@FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/complaints']")
	WebElement Complaint;
	
	@FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
	WebElement ComplaintAddNew;
	
	@FindBy(xpath = "//span[contains(text(),'Company')]")
	WebElement ComplaintCompany;
	
	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	WebElement ComplaintCompanySearch;
	
	@FindBy(xpath = "//span[contains(text(),'Choose an Employee')]")
	WebElement ComplaintEmployee;
	
	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	WebElement ComplaintEmployeeSearch;
	
	@FindBy(xpath = "//input[@placeholder='Complaint Title']")
	WebElement ComplaintTitle;
	
	@FindBy(xpath = "//textarea[@id='description']")
	WebElement ComplaintDescription;
	
	@FindBy(xpath = "//input[@placeholder='Select Employee(s)']")
	WebElement ComplaintAgainst;
	
	@FindBy(xpath = "//input[@placeholder='Complaint Date']")
	WebElement ComplaintDate;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement ComplaintYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement ComplaintMonth;
	
	@FindBy(xpath = "//a[contains(text(),'21')]")
	WebElement ComplaintDate1;
	
	@FindBy(xpath = "//div[@id='add_form']//button[1]")
	WebElement ComplaintSave;
	
	//---------------Termination------
	
	@FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/termination']")
	//@FindBy(xpath ="//a[contains(.,'Terminations')]")
	WebElement Termination;
	
	@FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
	WebElement TerminationAddNew;
	
	@FindBy(xpath = "//span[contains(text(),'Company')]")
	WebElement TerminationCompany;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement TerminationCompanySearch;
	
	@FindBy(xpath = "//span[contains(text(),'Choose an Employee')]")
	WebElement TerminationEmployee;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement TerminationEmployeeSearch;
	
	@FindBy(xpath = "//input[@placeholder='Notice Date']")
	WebElement TerminationNoticeDate;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement TerminationNoticeYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement TerminationNoticeMonth;
	
	@FindBy(xpath = "//a[contains(text(),'21')]")
	WebElement TerminationNoticeDate1;
	
	@FindBy(xpath = "//input[@placeholder='Termination Date']")
	WebElement TerminationTerminationDate;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement TerminationTerminationYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement TerminationTerminationMonth;
	
	@FindBy(xpath = "//a[contains(text(),'31')]")
	WebElement TerminationTerminationDate1;
	
	@FindBy(xpath = "//textarea[@id='description']")
	WebElement TerminationDescription;
	
	@FindBy(xpath = "//span[contains(text(),'Select Termination Type')]")
	WebElement TerminationType;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement TerminationTypeSearch;
	
	@FindBy(xpath = "//div[@class='form-actions box-footer']//button")
	WebElement TerminationSave;
	
	//---------Warning------
	
	@FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/warning']")
	WebElement Warning;
	
	@FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
	WebElement WarningAddNew;
	
	@FindBy(xpath = "//span[contains(text(),'Company')]")
	WebElement WarningCompany;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement WarningCompanySearch;
	
	@FindBy(xpath = "//span[contains(text(),'Choose an Employee')]")
	WebElement WarningEmployee;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement WarningEmployeeSearch;
	
	@FindBy(xpath = "//span[contains(text(),'Warning Type')]")
	WebElement WarningType;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement WarningTypeSearch;
	
	@FindBy(xpath = "//input[@placeholder='Subject']")
	WebElement WarningSubject;
	
	@FindBy(xpath = "//textarea[@id='description']")
	WebElement WarningDescription;
	
	@FindBy(xpath = "//div[@id='warning_employee_ajax']//span[@id='select2-select2-demo-6-container']")
	WebElement WarningBy;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement WarningBySearch;
	
	@FindBy(xpath = "//input[@placeholder='Warning Date']")
	WebElement WarningDate;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement WarningYear;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement WarningMonth;
	
	@FindBy(xpath = "//a[contains(text(),'16')]")
	WebElement WarningDate1;
	
	@FindBy(xpath = "//div[@id='add_form']//button[1]")
	WebElement WarningSave;
	
	public CoreHRpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddAward() throws InterruptedException
	{
		CoreHR.click();
		Thread.sleep(2000);
		Awards.click();
		AwardAdd.click();
		Thread.sleep(2000);
		AwardCompany.click();
		AwardCompanySearch.sendKeys("EvolutionCO");
		AwardCompanySearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		AwardEmplyee.click();
		AwardEmployeeSearch.sendKeys(" Arjun Verma");
		Thread.sleep(1000);
		AwardEmployeeSearch.sendKeys(Keys.ENTER);
		AwardType.click();
		Thread.sleep(1000);
		AwardTypeSearch.sendKeys("Performer of the Year");
		AwardTypeSearch.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		AwardDate.click();
		SelectCode.Sl(AwardYear,"2018");
		SelectCode.Sl(AwardMonth, "Dec");
		AwardDate1.click();
		Thread.sleep(1000);
		AwardMonthAndYear.click();
		SelectCode.Sl(AwardAddYear,"2018");
		SelectCode.Sl(AwardAddMonth, "Dec");
		AwardMonthYearButton.click();
		AwardCash.sendKeys("25000");
		AddFile.sendKeys("C:\\Users\\anjuman\\Downloads\\file_1572609247.png");
		AwardInfo.sendKeys("Test");
		AwardSave.click();
	}
	
	public void AddTransfer() throws InterruptedException
	{
		CoreHR.click();
		Thread.sleep(2000);
		Transfers.click();
		TransfersAddNew.click();
		Thread.sleep(2000);
		TransfersCompany.click();
		TransfersCompanySearch.sendKeys("EvolutionCO");
		TransfersCompanySearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		TransfersEmployee.click();
		TransfersEmployeeSearch.sendKeys(" Arjun Verma");
		Thread.sleep(1000);
		TransfersEmployeeSearch.sendKeys(Keys.ENTER);
		TransfersDate.click();
		Thread.sleep(2000);
		SelectCode.Sl(TransfersYear, "2019");
		SelectCode.Sl(TransfersMonth, "Dec");
		TransfersDate1.click();
		TransfersDepartment.click();
		Thread.sleep(1000);
		TransfersDepartmentSearch.sendKeys("QA");
		TransfersDepartmentSearch.sendKeys(Keys.ENTER);
		TransfersLocation.click();
		TransfersLocationSearch.sendKeys("Mumbai");
		TransfersLocationSearch.sendKeys(Keys.ENTER);
		TransfersSave.click();
	}
	
	public void AddResignation() throws InterruptedException
	{
		CoreHR.click();
		Thread.sleep(2000);
		Resignation.click();
		ResignationAddNew.click();
		Thread.sleep(2000);
		ResignationCompany.click();
		ResignationCompanySearch.sendKeys("EvolutionCO");
		ResignationCompanySearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		ResignationEmployee.click();
		ResignationEmployeeSearch.sendKeys(" Arjun Verma");
		Thread.sleep(1000);
		ResignationEmployeeSearch.sendKeys(Keys.ENTER);
		ResignationNoticeDate.click();
		Thread.sleep(2000);
		SelectCode.Sl(ResignationYear, "2019");
		SelectCode.Sl(ResignationMonth, "Dec");
		ResignationDate.click();
		ResignationReason.sendKeys("Test");
		ResignationResignDate.click();
		SelectCode.Sl(ResignationResignYear,"2019");
		SelectCode.Sl(ResignationResignMonth, "Dec");
		ResignationDate1.click();
		ResignationSave.click();
	}
	
	public void AddTravel() throws InterruptedException
	{
		CoreHR.click();
		Thread.sleep(2000);
		Travel.click();
		TravelAddNew.click();
		Thread.sleep(2000);
		TravelCompany.click();
		TravelCompanySearch.sendKeys("EvolutionCO");
		TravelCompanySearch.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		TravelEmployee.click();
		TravelEmployeeSearch.sendKeys(" Arjun Verma");
		Thread.sleep(1000);
		TravelEmployeeSearch.sendKeys(Keys.ENTER);
		TravelStartDate.click();
		Thread.sleep(1000);
		SelectCode.Sl(TravelStartYear, "2019");
		SelectCode.Sl(TravelStartMonth, "Dec");
		Thread.sleep(1000);
		TravelStartDate1.click();
		TravelEndDate.click();
		Thread.sleep(1000);
		SelectCode.Sl(TravelEndYear, "2019");
		SelectCode.Sl(TravelEndMonth, "Dec");
		Thread.sleep(1000);
		TravelEndDate1.click();
		TravelPurpose.sendKeys("Work");
		TravelVisit.sendKeys("Delhi");
		TravelDescription.sendKeys("Test");
		TravelExpectedBudget.sendKeys("50000");
		TravelActualBudget.sendKeys("45000");
		TravelMode.click();
		TravelModeSearch.sendKeys("By Plane");
		TravelModeSearch.sendKeys(Keys.ENTER);
		TravelCorporation.click();
		TravelCorporationSearch.sendKeys(" Guest House");
		TravelCorporationSearch.sendKeys(Keys.ENTER);
		TravelSave.click();
	}
	
	public void AddPromotion() throws InterruptedException
	{
		CoreHR.click();
		Thread.sleep(2000);
		Promotion.click();
		PromotionAddNew.click();
		Thread.sleep(2000);
		PromotionCompany.click();
		PromotionCompanySearch.sendKeys("EvolutionCO");
		PromotionCompanySearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		PromotionEmployee.click();
		PromotionEmployeeSearch.sendKeys(" Arjun Verma");
		Thread.sleep(1000);
		PromotionEmployeeSearch.sendKeys(Keys.ENTER);
		PromotionTitle.sendKeys("Test");
		PromotionDesription.sendKeys("Test1");
		PromotionDate.click();
		Thread.sleep(2000);
		SelectCode.Sl(PromotionYear, "2019");
		SelectCode.Sl(PromotionMonth, "Dec");
		PromotionDate1.click();
		PromotionSave.click();	
	}
	
	public void AddComplaint() throws InterruptedException
	{
		CoreHR.click();
		Thread.sleep(2000);
		Complaint.click();
		ComplaintAddNew.click();
		Thread.sleep(2000);
		ComplaintCompany.click();
		ComplaintCompanySearch.sendKeys("EvolutionCO");
		ComplaintCompanySearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		ComplaintEmployee.click();
		ComplaintEmployeeSearch.sendKeys(" Arjun Verma");
		Thread.sleep(1000);
		ComplaintEmployeeSearch.sendKeys(Keys.ENTER);
		ComplaintTitle.sendKeys("Test");
		ComplaintDate.click();
		Thread.sleep(2000);
		SelectCode.Sl(ComplaintYear, "2019");
		SelectCode.Sl(ComplaintMonth, "Dec");
		ComplaintDate1.click();
		ComplaintDescription.sendKeys("Test");
		ComplaintAgainst.sendKeys(" Arjun Verma");
		ComplaintAgainst.sendKeys(Keys.ENTER);
		ComplaintSave.click();
		
	}
	
	public void AddWarning() throws InterruptedException
	{
		CoreHR.click();
		Thread.sleep(2000);
		scrol(Warning);
		Warning.click();
		WarningAddNew.click();
		Thread.sleep(2000);
		WarningCompany.click();
		WarningCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
		Thread.sleep(2000);
		WarningEmployee.click();
		
		WarningEmployeeSearch.sendKeys(" Arjun Verma" + Keys.ENTER);
		WarningType.click();
		WarningTypeSearch.sendKeys("First Written Warning" + Keys.ENTER);
		WarningSubject.sendKeys("Test");
		WarningDescription.sendKeys("Test");
		WarningBy.click();
		Thread.sleep(1000);
		WarningBySearch.sendKeys(" Arjun Verma" + Keys.ENTER);
		WarningDate.click();
		Thread.sleep(2000);
		SelectCode.Sl(WarningYear, "2018");
		SelectCode.Sl(WarningMonth, "Jul");
		WarningDate1.click();
		WarningSave.click();
	}
	
	public void AddTermination() throws InterruptedException
	{
		CoreHR.click();
		Thread.sleep(2000);
		scrol(Termination);	
		Termination.click();
		TerminationAddNew.click();
		Thread.sleep(2000);
		TerminationCompany.click();
		TerminationCompanySearch.sendKeys("EvolutionCO");
		TerminationCompanySearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		TerminationEmployee.click();
		TerminationEmployeeSearch.sendKeys(" Arjun Verma");
		Thread.sleep(1000);
		TerminationEmployeeSearch.sendKeys(Keys.ENTER);
		TerminationNoticeDate.click();
		Thread.sleep(2000);
		SelectCode.Sl(TerminationNoticeYear, "2019");
		SelectCode.Sl(TerminationNoticeMonth, "Dec");
		TerminationNoticeDate1.click();
		TerminationTerminationDate.click();
		Thread.sleep(2000);
		SelectCode.Sl(TerminationTerminationYear, "2019");
		SelectCode.Sl(TerminationTerminationMonth, "Dec");
		TerminationTerminationDate1.click();
		TerminationDescription.sendKeys("Test");
		TerminationType.click();
		TerminationTypeSearch.sendKeys("Voluntary Termination"+ Keys.ENTER);
		Thread.sleep(1000);
		TerminationSave.click();
	}
	
}
