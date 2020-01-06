package Com.HRMS.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.Base.HRMSBase;

public class FileManager extends HRMSBase
{
   @FindBy(xpath = "//span[contains(text(),'Files Manager')]")
   WebElement FileManager;
   
   @FindBy(xpath = "//span[contains(text(),'Choose Department')]")
   WebElement FileManagerDepartment;
   
   @FindBy(xpath = "//input[@class='select2-search__field']")
   WebElement FileManagerDepartmentSearch;
   
   @FindBy(xpath = "//input[@id='xin_file']")
   WebElement FileManagerUplaod;
   
   @FindBy(xpath = "//div[@class='wrapper']//button[1]")
   WebElement FileManagerSave;
   
   @FindBy(xpath = "//a[contains(text(),'QA')]")
   WebElement FileManagerDepartment1;
   
   @FindBy(xpath = "//input[@class='form-control input-sm']")
   WebElement FileManagerSearch;
   
      public FileManager()
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void AddFile() throws InterruptedException
   {
        scrol(FileManager);
        FileManager.click();
        Thread.sleep(1000);
        FileManagerDepartment.click();
        FileManagerDepartmentSearch.sendKeys("QA" + Keys.ENTER);
        Thread.sleep(1000);
        FileManagerUplaod.sendKeys("E:\\Anju Data\\Downloads\\SmartEmployee1.png");
        FileManagerSave.click();
        Thread.sleep(1000);
        FileManagerDepartment1.click();
        Thread.sleep(1000);
        FileManagerSearch.sendKeys("QA");
        Thread.sleep(2000);
}
}
