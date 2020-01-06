package Com.HRMS.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.Base.HRMSBase;
import UTIL.SelectCode;

public class Recruitment extends HRMSBase
{
	@FindBy(xpath = "//span[contains(text(),'Recruitment')]")
	WebElement Recruitment;

	@FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/job_post']")
	WebElement RecruitmentJobPost;

	@FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
	WebElement RecruitmentAddNew;

	@FindBy(xpath = "//span[contains(text(),'Employer')]")
	WebElement RecruitmentEmployer;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement RecruitmentEmployerSearch;

	@FindBy(xpath = "//div[@class='box-block']//input[@placeholder='Job Title']")
	WebElement RecruitmentTitle;

	@FindBy(xpath = "//span[contains(text(),'Job Type')]")
	WebElement RecruitmentJobType;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement RecruitmentJobTypeSearch;

	@FindBy(xpath = "//span[contains(text(),'Category')]")
	WebElement RecruitmentCategory;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement RecruitmentCategorySearch;

	@FindBy(xpath = "//input[@placeholder='Number of Positions']")
	WebElement RecruitmentNumberOfPostion;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	WebElement RecruitmentFeatured;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement RecruitmentFeaturedSearch;

	@FindBy(xpath = "//span[@class=\"select2-selection select2-selection--single\"]//span[contains(text(),'Published')]")
	WebElement RecruitmentStatus;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement RecruitmentStatusSearch;

	@FindBy(xpath = "//input[@placeholder='Date of Closing']")
	WebElement RecruitmentDateOfClosing;

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement RecruitmentClosingYear;

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement RecruitmentMonth;

	@FindBy(xpath = "//a[contains(text(),'31')]")
	WebElement RecruitmentClosingDate;

	@FindBy(xpath = "//span[contains(text(),'Male')]")
	WebElement RecruitmentGender;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement RecruitmentGenderSearch;

	@FindBy(xpath = "//span[contains(text(),'Fresh')]")
	WebElement RecruitmentExperience;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement RecruitmentExperienceSearch;

	@FindBy(xpath = "//textarea[@placeholder='Short Description']")
	WebElement RecruitmentDescription;

	@FindBy(xpath = "//div[@class='form-actions box-footer']//button[1]")
	WebElement RecruitmentSave;

	@FindBy(xpath = "//tr[3]//td[1]//a[1]//button[1]//span[1]")
	WebElement RecruitmentView;

	//..........Employer.........

	@FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/job_post/employer']")
	WebElement Employer;

	@FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
	WebElement EmployerAddNew;

	@FindBy(xpath = "//input[@placeholder='Company Name']")
	WebElement EmployerCompanyName;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement EmployerFirstName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement EmployerLastName;

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement EmployerEmail;

	@FindBy(xpath = "//input[@placeholder='Contact Number']")
	WebElement EmployerContactNumber;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement EmployerPassword;

	@FindBy(xpath = "//input[@id='company_logo']")
	WebElement EmployerCompanyLogo;

	@FindBy(xpath = "//div[@id='add_form']//button[1]")
	WebElement EmployerSave;

	public Recruitment()
	{
		PageFactory.initElements(driver, this);
	}

	public JobPrtal AddRecruitment() throws InterruptedException
	{
		scrol(Recruitment);
		Recruitment.click();
		RecruitmentJobPost.click();
		RecruitmentAddNew.click();
		Thread.sleep(1000);
		RecruitmentEmployer.click();
		Thread.sleep(2000);
		RecruitmentEmployerSearch.sendKeys(" Thomas Fleming" + Keys.ENTER);
		RecruitmentTitle.sendKeys("Test");
		RecruitmentJobType.click();
		Thread.sleep(2000);
		RecruitmentJobTypeSearch.sendKeys("Full Time" + Keys.ENTER);
		RecruitmentCategory.click();
		Thread.sleep(2000);
		RecruitmentCategorySearch.sendKeys("Software" + Keys.ENTER);
		Thread.sleep(1000);
		RecruitmentNumberOfPostion.sendKeys("03");
		RecruitmentFeatured.click();
		Thread.sleep(2000);
		RecruitmentFeaturedSearch.sendKeys("Yes" + Keys.ENTER);
		RecruitmentStatus.click();
		Thread.sleep(2000);
		RecruitmentStatusSearch.sendKeys("Published" + Keys.ENTER);
		RecruitmentDateOfClosing.click();
		Thread.sleep(2000);
		SelectCode.Sl(RecruitmentClosingYear, "2019");
		SelectCode.Sl(RecruitmentMonth, "Dec");
		RecruitmentClosingDate.click();
		RecruitmentGender.click();
		Thread.sleep(2000);
		RecruitmentGenderSearch.sendKeys("Male" + Keys.ENTER);
		RecruitmentExperience.click();
		Thread.sleep(2000);
		RecruitmentExperienceSearch.sendKeys("2 Years" + Keys.ENTER);
		RecruitmentDescription.sendKeys("Test");
		Thread.sleep(2000);
		RecruitmentSave.click();
		Thread.sleep(2000);
		RecruitmentView.click();
		Thread.sleep(1000);
		//	System.out.println(driver.getTitle());

		for(String winHandle : driver.getWindowHandles()){
			//System.out.println(winHandle);
			//System.out.println(driver.getTitle());
			driver.switchTo().window(winHandle);
			//System.out.println(driver.getTitle());
		}

		return new JobPrtal();	

	}
	
	public void AddNewEmployer() throws InterruptedException
	{
		scrol(Recruitment);
		Recruitment.click();
		Employer.click();
		Thread.sleep(2000);
		EmployerAddNew.click();
		EmployerCompanyName.sendKeys("EvolutionCO");
		EmployerFirstName.sendKeys("Arjun");
		EmployerLastName.sendKeys("Verma");
		EmployerEmail.sendKeys("careers@evolutionco.com");
		EmployerContactNumber.sendKeys("8888899999");
		EmployerPassword.sendKeys("Arjun@123");
		Thread.sleep(1000);
		EmployerCompanyLogo.sendKeys("C:\\Users\\anjuman\\Downloads\\file_1572609247.png");
		Thread.sleep(2000);
		EmployerSave.click();
		Thread.sleep(2000);
	}
}
