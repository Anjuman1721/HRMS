package Com.HRMS.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.Base.HRMSBase;
import UTIL.SelectCode;

public class OrganizationPage extends HRMSBase
{
	//--------Company-------
	
    @FindBy(xpath = "//span[contains(text(),'Organization')]")
    WebElement organizationLink;
    
    @FindBy(xpath = "//li[@class='treeview menu-open']//li[1]//a[1]")
    WebElement Company;
    
    @FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
    WebElement addNew;
    
    @FindBy(xpath = "//input[@placeholder='Company Name']")
    WebElement CompanyName;
    
    @FindBy(xpath = "//span[contains(text(),'Company Type')]")
    WebElement CompanyType;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement CompanyTypeSearch;
    
    @FindBy(xpath = "//input[@placeholder='Legal / Trading Name']")
    WebElement TraidingName;
    
    @FindBy(xpath = "//input[@placeholder='Contact Number']")
    WebElement ContactNumber;
    
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement CompanyEmail;
    
    @FindBy(xpath = "//input[@placeholder='Website URL']")
    WebElement CompanyURL;
    
    @FindBy(xpath = "//input[@placeholder='Address Line 1']")
    WebElement AddressLine;
    
    @FindBy(xpath = "//input[@placeholder='City']")
    WebElement CompanyCity;
    
    @FindBy(xpath = "//input[@placeholder='State / Province']")
    WebElement CompanyState;
    
    @FindBy(xpath = "//input[@placeholder='Zip Code / Postal Code']")
    WebElement CompanyZipCode;
    
    @FindBy(xpath = "//span[contains(text(),'Country')]")
    WebElement CompanyCountry;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement CompanyCountrySearch;
    
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement CompanyUsername;
    
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement CompanyPassword;
    
    @FindBy(xpath = "//input[@id='logo']")
    WebElement CompanyLogo;
    
    @FindBy(xpath = "//div[@id='add_form']//button[1]")
    WebElement CompanySave;
    
    
    //----------OfficialDocuments-------
    @FindBy(xpath = "//a[contains(text(),'Official Documents')]")
    WebElement OfficialDocument;
    
    @FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
    WebElement OfficialDocumentAddNew;
    
    @FindBy(xpath = "//input[@placeholder='License Name']")
    WebElement LicenseName;
    
    @FindBy(xpath = "//span[contains(text(),'Choose Document Type')]")
    WebElement OfficialDocumentType;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement OfficialDocumentTypeSearch;
    
    @FindBy(xpath = "//input[@placeholder='License Number']")
    WebElement LicenseNumber;
    
    @FindBy(xpath = "//span[contains(text(),'Company')]")
    WebElement OfficialDocumentCompany;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement OfficialDocumentCompanySearch;
    
    @FindBy(xpath = "//input[@placeholder='Expiry Date']")
    WebElement OfficialDocumentExpiryDate;
    
    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    WebElement OfficialDocumentExpiryYear;
    
    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    WebElement OfficialDocumentExpiryMonth;
    
    @FindBy(xpath = "//a[contains(text(),'30')]")
    WebElement OfficialDocumentExpiryDate1;
    
    @FindBy(xpath = "//span[contains(text(),'No Alarm')]")
    WebElement OfficialDocumentNotifications;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement OfficialDocumentNotificationsSearch;
    
    @FindBy(xpath = "//input[@id='scan_file']")
    WebElement OfficialDocumentUpload;
    
    @FindBy(xpath = "//div[@id='add_form']//button[1]")
    WebElement OfficialDocumentSave;
    
    @FindBy(xpath = "//input[@class='form-control input-sm']")
    WebElement OfficialDocumentsSearch;
    
    //--------Location--------
    
    @FindBy(xpath = "//a[contains(text(),'Location')]")
    WebElement Location;
    
    @FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
    WebElement LocationAdd;
    
    @FindBy(xpath = "//span[@id='select2-aj_company-container']")
    WebElement LocationCompany;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement LocationCompanySearch;
    
    @FindBy(xpath = "//input[@placeholder='Location Name']")
    WebElement LocationName;
    
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement LocationEmail;
    
    @FindBy(xpath = "//input[@placeholder='Phone']")
    WebElement LocationPhone;
    
    @FindBy(xpath = "//input[@placeholder='Address Line 1']")
    WebElement LocationAddress;
    
    @FindBy(xpath = "//input[@placeholder='City']")
    WebElement LocationCity;
    
    @FindBy(xpath = "//input[@placeholder='State / Province']")
    WebElement LocationState;
    
    @FindBy(xpath = "//input[@placeholder='Zip Code / Postal Code']")
    WebElement LocationZip;
    
    @FindBy(xpath = "//span[contains(text(),'Country')]")
    WebElement LocationCountry;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement LocationCountrySearch;
    
    @FindBy(xpath = "//div[@id='add_form']//button[1]")
    WebElement LocationSave;
    
    //------------Department---------
    
    @FindBy(xpath = "//a[contains(text(),'Department')]")
    WebElement Department;
    
    @FindBy(xpath = "//input[@id='department_name']")
    WebElement DepartmentName;
    
    @FindBy(xpath = "//span[contains(text(),'Company')]")
    WebElement DepartmentCompany;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement DepartmentCompanySearch;
    
    @FindBy(xpath = "//span[contains(text(),'Location')]")
    WebElement DepartmentLocation;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement DepartmentLocationSearch;
  
    @FindBy(xpath = "//span[contains(text(),'Department Head')]")
    WebElement DepartmentHead;
    
    @FindBy(xpath = "//button[contains(text(),'Save')]")
    WebElement DepartmentSave;
    
    //-----------Designation--------
    
    @FindBy(xpath = "//a[contains(text(),'Designation')]")
    WebElement Designation;
    
    @FindBy(xpath = "//span[contains(text(),'Company')]")
    WebElement DesignationCompany;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement DesignationCompanySearch;
    
    @FindBy(xpath = "//span[contains(text(),'Select Department')]")
    WebElement DesignationDepartment;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement DesignationDepartmentSearch;
    
    @FindBy(xpath = "//input[@placeholder='Designation Name']")
    WebElement DesignationName;
    
    @FindBy(xpath = "//div[@class='col-md-4']//button[1]")
    WebElement DesignationSave;
    
    //----------Announcement----
    
    @FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/announcement']")
    WebElement Announcement;
    
    @FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
    WebElement AnnouncementAdd;
    
    @FindBy(xpath = "//input[@placeholder='Title']")
    WebElement AnnouncementTitle;
    
    @FindBy(xpath = "//input[@placeholder='Start Date']")
    WebElement AnnouncementStaringDate;
    
    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    WebElement AnnouncementStartYear;
    
    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    WebElement AnnouncementStartMonth;
    
    @FindBy(xpath = "//a[contains(text(),'11')]")
    WebElement AnnouncementStartDate1;
    
    @FindBy(xpath = "//input[@placeholder='End Date']")
    WebElement AnnouncementEndDate;
    
    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    WebElement AnnouncementEndYear;
    
    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    WebElement AnnouncementEndMonth;
    
    @FindBy(xpath = "//a[contains(text(),'13')]")
    WebElement AnnouncementEndDate1;
    
    @FindBy(xpath = "//span[contains(text(),'Company')]")
    WebElement AnnouncementCompany;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement AnnouncementCompanySearch;
    
    @FindBy(xpath = "//span[contains(text(),'Department')]")
    WebElement AnnouncementDepartment;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement AnnouncementDepartmentSearch;
    
    @FindBy(xpath = "//textarea[@id='description']")
    WebElement AnnouncementDesciption;
    
    @FindBy(xpath = "//textarea[@id='summary']")
    WebElement AnnouncementSummary;
    
    @FindBy(xpath = "//div[@id='add_form']//button[1]")
    WebElement AnnouncementSave;
    
    //-----------CompanyPolicy---------------
    
    @FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/policy']")
    WebElement Policy;
    
    @FindBy(xpath = "//span[contains(text(),'Select Company...')]")
    WebElement PolicyCompany;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement PolicyCompanySearch;
    
    @FindBy(xpath = "//input[@placeholder='Title']")
    WebElement PolicyTitle;
    
    @FindBy(xpath = "//div[@placeholder='Description']")
    WebElement PolicyDescription;
    
    @FindBy(xpath = "//div[@class='form-actions box-footer']//button[1]")
    WebElement PolicySave;
    
    public OrganizationPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void AddCompany() throws InterruptedException
    {
    	organizationLink.click();
    	Company.click();
    	addNew.click();
    	CompanyName.sendKeys("EvolutionCO");
    	Thread.sleep(2000);
    	CompanyType.click();
    	CompanyTypeSearch.sendKeys(" Private Foundation");
    	CompanyTypeSearch.sendKeys(Keys.ENTER);
    	TraidingName.sendKeys("Eco");
    	ContactNumber.sendKeys("9999999999");
    	CompanyEmail.sendKeys("careers@evolutionco.com");
    	CompanyURL.sendKeys("http://www.evolutionco.com");
    	AddressLine.sendKeys("201 - 2nd Floor, Satellite Silver, Sir Mathuradas Vasanji Rd, Chimatpada, Near Marol Naka Metro Station, Marol, Andheri East, Mumbai - 400059, INDIA");
    	CompanyCity.sendKeys("Mumbai");
    	CompanyState.sendKeys("Maharashtra");
    	CompanyZipCode.sendKeys("400059");
    	Thread.sleep(2000);
    	CompanyCountry.click();
    	CompanyCountrySearch.sendKeys(" India");
    	CompanyCountrySearch.sendKeys(Keys.ARROW_DOWN);
    	CompanyCountrySearch.sendKeys(Keys.ENTER);
    	CompanyUsername.sendKeys("EvolutionCO");
    	CompanyPassword.sendKeys("EvolutionCO");
    	Thread.sleep(2000);
    	//CompanyLogo.click();
    	CompanyLogo.sendKeys("C:\\Users\\anjuman\\Downloads\\file_1572609247.png");
    	Thread.sleep(1000);
    	CompanySave.click();
    	Thread.sleep(2000);
    }
    
    public void AddOfficialDocuments() throws InterruptedException
    {
    	organizationLink.click();
    	Thread.sleep(1000);
    	OfficialDocument.click();
    	OfficialDocumentAddNew.click();
    	LicenseName.sendKeys("Pan Card");
    	OfficialDocumentType.click();
    	OfficialDocumentTypeSearch.sendKeys(" Driving License" + Keys.ENTER);
    	Thread.sleep(1000);
    	LicenseNumber.sendKeys("CFFP1234567");
    	OfficialDocumentCompany.click();
    	OfficialDocumentCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
    	OfficialDocumentExpiryDate.click();
    	Thread.sleep(1000);
    	SelectCode.Sl(OfficialDocumentExpiryYear, "2020");
    	SelectCode.Sl(OfficialDocumentExpiryMonth, "Jan");
    	OfficialDocumentExpiryDate1.click();
    	OfficialDocumentNotifications.click();
    	OfficialDocumentNotificationsSearch.sendKeys("No Alarm");
    	Thread.sleep(1000);
    	OfficialDocumentUpload.sendKeys("C:\\Users\\anjuman\\Downloads\\file_1572609247.png");
    	Thread.sleep(1000);
    	OfficialDocumentSave.click();
    	Thread.sleep(2000);
    	OfficialDocumentsSearch.sendKeys("Pan Card" + Keys.ENTER);
    	Thread.sleep(2000);
    }
    
    public void AddLocation() throws InterruptedException
    {
    	organizationLink.click();
    	Location.click();
    	LocationAdd.click();
    	Thread.sleep(2000);
    	LocationCompany.click();
    	Thread.sleep(1000);
    	LocationCompanySearch.sendKeys("EvolutionCO");
    	LocationCompanySearch.sendKeys(Keys.ENTER);
    	LocationName.sendKeys("Mumbai");
    	LocationEmail.sendKeys("careers@evolutionco.com");
    	LocationPhone.sendKeys("02203456789");
    	LocationAddress.sendKeys("201 - 2nd Floor, Satellite Silver, Sir Mathuradas Vasanji Rd, Chimatpada, Near Marol Naka Metro Station, Marol, Andheri East, Mumbai - 400059, INDIA");
    	LocationCity.sendKeys("Mumbai");
    	LocationState.sendKeys("Maharashtra");
    	LocationZip.sendKeys("400059");
    	LocationCountry.click();
    	LocationCountrySearch.sendKeys(" India");
    	LocationCountrySearch.sendKeys(Keys.ARROW_DOWN);
    	LocationCountrySearch.sendKeys(Keys.ENTER);
    	LocationSave.click();
    }
    
    public void AddDepartment() throws InterruptedException
    {
    	organizationLink.click();
    	Department.click();
    	DepartmentName.sendKeys("QA");
    	Thread.sleep(2000);
    	DepartmentCompany.click();
    	Thread.sleep(1000);
    	DepartmentCompanySearch.sendKeys("EvolutionCO");
    	DepartmentCompanySearch.sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
    	DepartmentLocation.click();
    	Thread.sleep(1000);
    	DepartmentLocationSearch.sendKeys("Mumbai");
    	DepartmentCompanySearch.sendKeys(Keys.ENTER);
    	DepartmentSave.click();
    }
    
    public void AddDesignation() throws InterruptedException
    {
    	organizationLink.click();
    	Designation.click();
    	Thread.sleep(2000);
    	DesignationCompany.click();
    	Thread.sleep(1000);
    	DesignationCompanySearch.sendKeys("EvolutionCO");
    	DesignationCompanySearch.sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
    	DesignationDepartment.click();
    	Thread.sleep(1000);
    	DesignationDepartmentSearch.sendKeys("QA");
    	DesignationDepartmentSearch.sendKeys(Keys.ENTER);
    	DesignationName.sendKeys("Sr. Automation Tester");
    	DesignationSave.click();
    }
    
    public void AddAnnouncement() throws InterruptedException
    {
    	organizationLink.click();
    	Thread.sleep(2000);
    	scrol(Announcement);
    	Announcement.click();
    	AnnouncementAdd.click();
    	AnnouncementTitle.sendKeys("Test");
    	AnnouncementStaringDate.click();
    	Thread.sleep(1000);
    	SelectCode.Sl(AnnouncementStartYear, "2019");
    	SelectCode.Sl(AnnouncementStartMonth, "Dec");
    	AnnouncementStartDate1.click();
    	Thread.sleep(1000);
    	AnnouncementEndDate.click();
    	Thread.sleep(1000);
    	SelectCode.Sl(AnnouncementEndYear, "2019");
    	SelectCode.Sl(AnnouncementEndMonth, "Dec");
    	AnnouncementEndDate1.click();
    	AnnouncementCompany.click();
    	Thread.sleep(1000);
    	AnnouncementCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
    	Thread.sleep(1000);
    	AnnouncementDepartment.click();
    	AnnouncementDepartmentSearch.sendKeys("QA" + Keys.ENTER);
    	AnnouncementDesciption.sendKeys("Test");
    	AnnouncementSummary.sendKeys("Test");
    	AnnouncementSave.click();
    	Thread.sleep(2000);
    }
    
    public void AddPolicy() throws InterruptedException
    {
    	organizationLink.click();
    	Thread.sleep(2000);
    	scrol(Policy);
    	Policy.click();
    	PolicyCompany.click();
    	Thread.sleep(1000);
    	PolicyCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
    	PolicyTitle.sendKeys("Test");
    	PolicyDescription.sendKeys("Test");
    	scrol(PolicySave);
    	PolicySave.click();
    	Thread.sleep(2000);
    }
}
