package Com.HRMS.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.Base.HRMSBase;

public class Tickets extends HRMSBase
{
//------------Tickets----------
    
    @FindBy(xpath = "//span[contains(text(),'Tickets')]")
    WebElement Tickets;
    
    @FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
    WebElement TicketsAddNew;
    
    @FindBy(xpath = "//span[contains(text(),'Company')]")
    WebElement TicketsCompany;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement TicketsCompanySearch;
    
    @FindBy(xpath = "//div[@class='box-block']//input[@placeholder='Subject']")
    WebElement TicketsSubject;
    
    @FindBy(xpath = "//span[contains(text(),'Employee')]")
    WebElement TicketsEmployee;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement TicketsEmployeeSearch;
    
    @FindBy(xpath = "//span[contains(text(),'Select Priority')]")
    WebElement TicketsSelectPriority;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement TicketsPrioritySearch;
    
    @FindBy(xpath = "//textarea[@id='description']")
    WebElement TicketsDescription;
    
    @FindBy(xpath = "//div[@id='add_form']//button[1]")
    WebElement TicketsSave;
    
  public Tickets()
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void AddTickets() throws InterruptedException
  {
	  scrol(Tickets);
	  Tickets.click();
	  Thread.sleep(2000);
	  TicketsAddNew.click();
	  TicketsCompany.click();
	  Thread.sleep(1000);
	  TicketsCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
	  Thread.sleep(2000);
	  TicketsSubject.sendKeys("Test");
	  TicketsEmployee.click();
	  Thread.sleep(1000);
	  TicketsEmployeeSearch.sendKeys(" Arjun Verma" + Keys.ENTER);
	  Thread.sleep(2000);
	  TicketsSelectPriority.click();
	  Thread.sleep(1000);
	  TicketsPrioritySearch.sendKeys("Low" + Keys.ENTER);
	  Thread.sleep(2000);
	  TicketsDescription.sendKeys("Test");
	  TicketsSave.click();
	  Thread.sleep(2000);
  }
}
