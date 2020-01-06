package Com.HRMS.Pages;

	import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import Com.HRMS.Base.HRMSBase;
import UTIL.SelectCode;

	public class TrainingPage extends HRMSBase
	{
		@FindBy(xpath = "//span[contains(text(),'Training')]")
		WebElement Training;
		
		@FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/trainers']")
		WebElement TrainerList;
		
		@FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
		WebElement TrainerListAdd;
		
		@FindBy(xpath = "//input[@placeholder='First Name']")
		WebElement TrainerListFirstName;
		
		@FindBy(xpath = "//input[@placeholder='Last Name']")
		WebElement TrainerListLastName;
		
		@FindBy(xpath = "//input[@placeholder='Contact Number']")
		WebElement TrainerListContactNumber;
		
		@FindBy(xpath = "//input[@placeholder='Email']")
		WebElement TrainerListEmail;
		
		@FindBy(xpath = "//span[contains(text(),'Company')]")
		WebElement TrainerListCompany;
		
		@FindBy(xpath = "//input[@class='select2-search__field']")
		WebElement TrainerListCompanySearch;
		
		@FindBy(xpath = "//textarea[@id='address']")
		WebElement TrainerListAddress;
		
		@FindBy(xpath = "//div[@id='add_form']//button[1]")
		WebElement TrainerListSave;
		
		//--------Add Training Type------
		
		@FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/training_type']")
		WebElement TraType;
		
		@FindBy(xpath = "//input[@placeholder='Training Type']")
		WebElement TraTypeName;
		
		@FindBy(xpath = "//div[@class='col-md-4']//button[1]")
		WebElement TraTypeSave;
		
		//------Add Training List-----
		
		@FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/training']")
		WebElement TrainingList;
		
		@FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
		WebElement TrainingAdd;
		
		@FindBy(xpath = "//span[contains(text(),'Company')]")
		WebElement TrainingListCompany;
		
		@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
		WebElement TrainingListcompanySearch;
		
		@FindBy(xpath = "//span[contains(text(),'Training Type')]")
		WebElement TrainingType;
		
		@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
		WebElement TrainingTypeSearch;
		
		@FindBy(xpath = "//span[contains(text(),'Trainer')]")
		WebElement TrainingListTrainer;
		
		@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
		WebElement TrainingListTrainerSearch;
		
		@FindBy(xpath = "//span[contains(text(),'Trainer')]")
		WebElement TraininerName;
		
		@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
		WebElement TraininerNameSearch;
		
		@FindBy(xpath = "//input[@placeholder='Training Cost']")
		WebElement TrainingCost;
		
		@FindBy(xpath = "//input[@placeholder='Start Date']")
		WebElement TrainingListStartDate;
		
		@FindBy(xpath = "//select[@class='ui-datepicker-year']")
		WebElement TrainingListStartYear;
		
		@FindBy(xpath = "//select[@class='ui-datepicker-month']")
		WebElement TrainingListStartMonth;
		
		@FindBy(xpath = "//a[contains(text(),'24')]")
		WebElement TrainingListStartDate1;
		
		@FindBy(xpath = "//input[@placeholder='End Date']")
		WebElement TrainingListEndDate;
		
		@FindBy(xpath = "//select[@class='ui-datepicker-year']")
		WebElement TrainingListEndYear;
		
		@FindBy(xpath = "//select[@class='ui-datepicker-month']")
		WebElement TrainingListEndMonth;
		
		@FindBy(xpath = "//a[contains(text(),'24')]")
		WebElement TrainingListEndDate1;
		
		@FindBy(xpath = "//input[@placeholder='Choose an Employee']")
		WebElement TrainingListEmployee;
		
		@FindBy(xpath = "//ul[@class='select2-selection__rendered']")
		WebElement TrainingListEmployeeSearch;
		
		@FindBy(xpath = "//div[@id='add_form']//button[1]")
		WebElement TrainingListSave;
		
	public TrainingPage()
	  {
		PageFactory.initElements(driver, this);
	  }
		
		public void AddTrainer() throws InterruptedException
		{
			scrol(Training);
			Training.click();
			scrol(TrainerList);
			TrainerList.click();
			Thread.sleep(1000);
			TrainerListAdd.click();
			Thread.sleep(1000);
			TrainerListFirstName.sendKeys("Snehal");
			TrainerListLastName.sendKeys("Shaha");
			TrainerListContactNumber.sendKeys("8888888888");
			TrainerListEmail.sendKeys("SnehalShaha@evolutionCO.com");
			TrainerListCompany.click();
			Thread.sleep(1000);
			TrainerListCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
			TrainerListAddress.sendKeys("201 - 2nd Floor, Satellite Silver, Sir Mathuradas Vasanji Rd, Chimatpada, Near Marol Naka Metro Station, Marol, Andheri East, Mumbai - 400059, INDIA");
			Thread.sleep(1000);
			TrainerListSave.click();
			Thread.sleep(2000);
		}
		
		public void TrainingType() throws InterruptedException
		{
			scrol(Training);
			Training.click();
			Thread.sleep(2000);
			TraType.click();
			TraTypeName.sendKeys("Test");
			Thread.sleep(2000);
			TraTypeSave.click();
			Thread.sleep(2000);
		}
		
		public void AddTraining() throws InterruptedException
		{
			scrol(Training);
			Training.click();
			scrol(TrainingList);
			TrainingList.click();
			TrainingAdd.click();
			Thread.sleep(2000);
			TrainingListCompany.click();
			Thread.sleep(1000);
			TrainingListcompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
			Thread.sleep(2000);
			TrainingType.click();
			TrainingTypeSearch.sendKeys("Job Training" + Keys.ENTER);
			TraininerName.click();
			TraininerNameSearch.sendKeys("Snehal Shaha" + Keys.ENTER);
			TrainingCost.sendKeys("1000");
			TrainingListStartDate.click();
			Thread.sleep(2000);
			SelectCode.Sl(TrainingListStartYear, "2019");
			SelectCode.Sl(TrainingListStartMonth, "Dec");
			TrainingListStartDate1.click();
			Thread.sleep(2000);
			TrainingListEndDate.click();
			Thread.sleep(2000);
			SelectCode.Sl(TrainingListEndYear, "2019");
			SelectCode.Sl(TrainingListEndMonth, "Dec");
			Thread.sleep(2000);
			TrainingListEndDate1.click();
			Thread.sleep(2000);
			TrainingListEmployee.click();
			TrainingListEmployee.sendKeys(" Arjun Verma" + Keys.ENTER);
			TrainingListSave.click();
			Thread.sleep(2000);
		}
		
		
	}


