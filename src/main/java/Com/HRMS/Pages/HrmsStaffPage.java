package Com.HRMS.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.Base.HRMSBase;
import UTIL.SelectCode;

public class HrmsStaffPage extends HRMSBase
{
	@FindBy(xpath = "//span[contains(text(),'Staff')]")
	WebElement staff;

	@FindBy(xpath = "//li[@class='treeview menu-open']//li[1]//a[1]")
	WebElement employee;

	@FindBy(xpath = "//div[@id='accordion']//div[contains(@class,'with-border')]//button[1]")
	WebElement addNew;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement FirstName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement LastName;

	@FindBy(xpath = "//input[@placeholder='Employee ID']")
	WebElement EmployeeID;

	@FindBy(xpath = "//input[@name='date_of_joining']")
	WebElement DOJ;

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement Year;

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement month;

	@FindBy(xpath = "//a[contains(text(),'17')]")
	WebElement JoininDate;

	@FindBy(xpath = "//span[contains(text(),'Company')]")
	WebElement Company;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	WebElement CompanySearch;

	@FindBy(xpath = "//span[contains(text(),'Location')]")
	WebElement Location;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	WebElement LocationSearch;

	@FindBy(xpath = "//span[contains(text(),'Select Department')]")
	WebElement Department;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	WebElement DepartmentSearch;

	@FindBy(xpath = "//span[contains(text(),'Designation')]")
	WebElement Designation;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	WebElement designationSearch;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement UN;

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement Email;

	@FindBy(xpath = "//span[contains(text(),'Male')]")
	WebElement Gender;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	WebElement GendarSearch;

	@FindBy(xpath = "//span[contains(text(),'Morning Shift')]")
	WebElement Shift;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	WebElement ShiftSearch;

	@FindBy(xpath = "//input[@name='date_of_birth']")
	WebElement BOD;

	@FindBy(xpath = "//a[contains(text(),'21')]")
	WebElement BODdate;

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement BODYear;

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement BODMonth;

	@FindBy(xpath = "//input[@placeholder='Contact Number']")
	WebElement contactNumber;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement EmployeePassword;

	@FindBy(xpath = "//input[@placeholder='Confirm Password']")
	WebElement ConfirmPassword;

	@FindBy(xpath = "//span[contains(text(),'Role')]")
	WebElement Role;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	WebElement RoleSearch;

	@FindBy(xpath = "//input[@placeholder='Leave Category']")
	WebElement LeaveCategory;

	@FindBy(xpath = "//input[@placeholder='Address']")
	WebElement Address;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement Save;
	
	@FindBy(xpath = "//input[@class='form-control input-sm']")
	WebElement Search;

	//------------------Custom Field------------

	@FindBy(xpath = "//a[contains(text(),'Custom Fields')]")
	WebElement CustomFields;

	@FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
	WebElement AddCustomFields;

	@FindBy(xpath = "//span[contains(text(),'Select One')]")
	WebElement Modules;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement ModulesSearch;

	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement CustomFieldName;

	@FindBy(xpath = "//input[@placeholder='Field Label']")
	WebElement FieldLabel;

	@FindBy(xpath = "//input[@placeholder='Priority']")
	WebElement Priority;

	@FindBy(xpath = "//span[@id='select2-validation-container']")
	WebElement Validation;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement ValidationSearch;

	@FindBy(xpath = "//span[contains(text(),'Text Field')]")
	WebElement TextField;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement TextFieldSearch;

	@FindBy(xpath = "//div[@class='form-actions box-footer']//button[1]")
	WebElement CustomFieldSave;

	//----------Staff Directory--------

	@FindBy(xpath = "//a[contains(text(),'Staff Directory')]")
	WebElement StaffDirectoryLink;

	@FindBy(xpath = "//span[@id='select2-filter_company-container']")
	WebElement StaffCompany;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement StaffCompanySearch;

	@FindBy(xpath = "//span[@id='select2-filter_location-container']")
	WebElement StaffLocation;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement StaffLocationSearch;

	@FindBy(xpath = "//span[@id='select2-filter_department-container']")
	WebElement StaffDepartment;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement StaffDepartmentSearch;

	@FindBy(xpath = "//span[@id='select2-filter_designation-container']")
	WebElement StaffDesignation;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement StaffDesignationSearch;

	@FindBy(xpath = "//button[contains(text(),'Get')]")
	WebElement StaffGetButton;

	@FindBy(xpath ="//a[contains(text(),'Arjun Verma')]" )
	WebElement StaffInfoDisplay;

	//-----------Employee Exit-------

	@FindBy(xpath = "//a[contains(text(),'Employees Exit')]")
	WebElement EmployeeExit;

	@FindBy(xpath ="//div[contains(@class,'box mb-4 animated fadeInRight')]//div[contains(@class,'with-border')]//button[1]")
	WebElement EmployeeExitAddNew;

	@FindBy(xpath = "//span[@id='select2-aj_company-container']")
	WebElement EmployeeExitCompany;

	@FindBy(xpath = "//input[contains(@class,'select2-search__field')]")
	WebElement EmployeeExitCompanySearch;

	@FindBy(xpath = "//span[contains(text(),'Choose an Employee')]")
	WebElement EmployeeExitEmployeeName;

	@FindBy(xpath = "//input[contains(@class,'select2-search__field')]")
	WebElement EmployeeExitEmployeeNameSearch;

	@FindBy(xpath = "//input[@placeholder='Exit Date']")
	WebElement ExitDate;

	@FindBy(xpath = "//select[contains(@class,'ui-datepicker-year')]")
	WebElement ExitYear;

	@FindBy(xpath = "//select[contains(@class,'ui-datepicker-month')]")
	WebElement ExitMonth;

	@FindBy(xpath = "//a[contains(text(),'10')]")
	WebElement ExitDate1;

	@FindBy(xpath = "//span[contains(text(),'Type of Exit')]")
	WebElement TypeOfExit;

	@FindBy(xpath = "//input[contains(@class,'select2-search__field')]")
	WebElement TypeOfExitSearch;

	@FindBy(xpath = "//span[@id='select2-exit_interview-we-container']")
	WebElement ExitInterview;

	@FindBy(xpath = "//input[contains(@class,'select2-search__field')]")
	WebElement ExitInterviewSearch;

	@FindBy(xpath = "//span[@id='select2-is_inactivate_account-b1-container']")
	WebElement DisableAccount;

	@FindBy(xpath = "//input[contains(@class,'select2-search__field')]")
	WebElement DisableAccountSearch;

	@FindBy(xpath = "//div[@id='add_form']//button[1]")
	WebElement ExitSave;


	public HrmsStaffPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void NewEmployee() throws InterruptedException
	{
		staff.click();
		employee.click();
		addNew.click();
		FirstName.sendKeys("Arjun");
		LastName.sendKeys("Verma");
		EmployeeID.sendKeys("DWS333");
		Thread.sleep(2000);
		DOJ.click();
		SelectCode.Sl(Year, "2016");
		SelectCode.Sl(month, "Oct");
		JoininDate.click();
		Company.click();
		CompanySearch.sendKeys("EvolutionCO");
		CompanySearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Location.click();
		LocationSearch.sendKeys("Mumbai");
		LocationSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Department.click();
		DepartmentSearch.sendKeys("QA");
		DepartmentSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Designation.click();
		designationSearch.sendKeys("Sr. Automation Tester");
		designationSearch.sendKeys(Keys.ENTER);
		UN.sendKeys("arjun@evolutionco.com");
		Email.sendKeys("arjun@evolutionco.com");
		Thread.sleep(2000);
		Gender.click();
		GendarSearch.sendKeys("Male");
		GendarSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Shift.click();
		ShiftSearch.sendKeys("Afternoon Shift");
		ShiftSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		BOD.click();
		SelectCode.Sl(BODYear, "1991");
		SelectCode.Sl(BODMonth, "Jul");
		BODdate.click();
		Thread.sleep(2000);
		contactNumber.sendKeys("9999988888");
		EmployeePassword.sendKeys("Admin@123");
		ConfirmPassword.sendKeys("Admin@123");
		Thread.sleep(2000);
		Role.click();
		RoleSearch.sendKeys("Employee");
		RoleSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		LeaveCategory.sendKeys("Casual Leave");
		Address.sendKeys("201 - 2nd Floor, Satellite Silver, Sir Mathuradas Vasanji Rd, Chimatpada, Near Marol Naka Metro Station, Marol, Andheri East, Mumbai - 400059, INDIA");
		Save.click();
		Thread.sleep(2000);
		Search.sendKeys("Arjun" + Keys.ENTER);
		Thread.sleep(2000);
	}

	public void AddCustomField()
	{
		staff.click();
		CustomFields.click();
		AddCustomFields.click();
		Modules.click();
		ModulesSearch.sendKeys("Employees");
		ModulesSearch.sendKeys(Keys.ENTER);
		CustomFieldName.sendKeys("Age");
		FieldLabel.sendKeys("Age");
		Priority.sendKeys("High");
		Validation.click();
		ValidationSearch.sendKeys("Required");
		TextField.click();
		TextFieldSearch.sendKeys("Text Field");
		TextFieldSearch.sendKeys(Keys.ENTER);
		CustomFieldSave.click();  
	}

	public void StaffDirectory() throws InterruptedException
	{
		staff.click();
		StaffDirectoryLink.click();
		Thread.sleep(2000);
		StaffCompany.click();
		StaffCompanySearch.sendKeys("EvolutionCO");
		StaffCompanySearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		StaffLocation.click();
		StaffLocationSearch.sendKeys("Mumbai");
		StaffLocationSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		StaffDepartment.click();
		StaffDepartmentSearch.sendKeys("QA");
		StaffDepartmentSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		StaffDesignation.click();
		StaffDesignationSearch.sendKeys("Sr. Automation Tester");
		StaffDesignationSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		StaffGetButton.click();
		
	}

	public void EmployeeExit() throws InterruptedException
	{
		staff.click();
		Thread.sleep(2000);
		EmployeeExit.click();
		EmployeeExitAddNew.click();
		EmployeeExitCompany.click();
		EmployeeExitCompanySearch.sendKeys("EvolutionCO");
		EmployeeExitCompanySearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		EmployeeExitEmployeeName.click();
		EmployeeExitEmployeeNameSearch.sendKeys(" Arjun Verma");
		EmployeeExitEmployeeNameSearch.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ExitDate.click();
		SelectCode.Sl(ExitYear, "2019");
		SelectCode.Sl(ExitMonth, "Dec");
		ExitDate1.click();
		TypeOfExit.click();
		TypeOfExitSearch.sendKeys("Test");
		TypeOfExitSearch.sendKeys(Keys.ENTER);
		/*ExitInterview.click();
		ExitInterviewSearch.sendKeys("Yes");
		ExitInterviewSearch.sendKeys(Keys.ENTER);
		DisableAccount.click();
		DisableAccountSearch.sendKeys("Yes");
		DisableAccountSearch.sendKeys(Keys.ENTER);*/
		ExitSave.click();
	}


}
