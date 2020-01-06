package Com.HRMS.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.Base.HRMSBase;
import UTIL.SelectCode;

public class TimeSheetPage extends HRMSBase
{
	  @FindBy(xpath = "//span[contains(text(),'Timesheet')]")
	  WebElement TimeSheet;
	  
	  @FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/timesheet/timecalendar/']")
	  WebElement TimeSheetCalender;
	  
	  @FindBy(xpath = "//input[@class='form-control d_month_year hasDatepicker']")
	  WebElement TimeSheetCalenderDate;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-year']")
	  WebElement TimeSheetCalenderYear;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-month']")
	  WebElement TimeSheetCalenderMonth;
	  
	  @FindBy(xpath = "//button[@class='ui-datepicker-close ui-state-default ui-priority-primary ui-corner-all']")
	  WebElement TimeSheetCalenderDone;
	  
	  @FindBy(xpath = "//span[contains(text(),'Company')]")
	  WebElement TimeSheetCalenderCompany;
	  
	  @FindBy(xpath = "//input[@class='select2-search__field']")
	  WebElement TimeSheetCalenderCompanySearch;
	  
	  @FindBy(xpath = "//span[contains(text(),'Choose an Employee')]")
	  WebElement TimeSheetCalenderEmployee;
	  
	  @FindBy(xpath = "//input[@class='select2-search__field']")
	  WebElement TimeSheetCalenderEmployeeSearch;
	  
	  @FindBy(xpath = "//button[contains(text(),'Get')]")
	  WebElement TimeSheetCalenderSave;

	  //--------DateWise Timesheet----
	  
	  @FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/timesheet/date_wise_attendance']")
	  WebElement DatewiseTimesheet;
	  
	  @FindBy(xpath = "//input[@id='start_date']")
	  WebElement DatewiseTimesheetStartDate;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-year']")
	  WebElement DatewiseTimesheetStartYear;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-month']")
	  WebElement DatewiseTimesheetStartMonth;
	  
	  @FindBy(xpath = "//a[contains(text(),'7')]")
	  WebElement DatewiseTimesheetStartDate1;
	  
	  @FindBy(xpath = "//input[@id='end_date']")
	  WebElement DatewiseTimesheetEndDate;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-year']")
	  WebElement DatewiseTimesheetEndYear;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-month']")
	  WebElement DatewiseTimesheetEndMonth;
	  
	  @FindBy(xpath = "//a[contains(text(),'11')]")
	  WebElement DatewiseTimesheetEndDate1;
	  
	  @FindBy(xpath = "//span[contains(text(),'Company')]")
	  WebElement DatewiseTimesheetCompany;
	  
	  @FindBy(xpath = "//input[@class='select2-search__field']")
	  WebElement DatewiseTimesheetCompanySearch;
	  
	  @FindBy(xpath = "//span[contains(text(),'Choose an Employee')]")
	  WebElement DatewiseTimesheetEmployee;
	  
	  @FindBy(xpath = "//input[@class='select2-search__field']")
	  WebElement DatewiseTimesheetEmployeeSearch;
	  
	  @FindBy(xpath = "//button[@class='btn btn-primary save']")
	  WebElement DatewiseTimesheetSave;
	  
	  //-----------UpdateSheet------
	  
	  @FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/timesheet/update_attendance']")
	  WebElement UpdateSheet;
	  
	  @FindBy(xpath = "//input[@id='attendance_date']")
	  WebElement UpdateSheetAttendanceDate;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-year']")
	  WebElement UpdateSheetAttendaceYear;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-month']")
	  WebElement UpdateSheetAttendaceMonth;
	  
	  @FindBy(xpath = "//a[contains(text(),'11')]")
	  WebElement UpdateSheetDate1;
	  
	  @FindBy(xpath = "//div[@class='col-md-4']//button[1]")
	  WebElement UpdateSheetGet;
	  
	  @FindBy(xpath = "//span[contains(text(),'Company')]")
	  WebElement UpdateSheetCompany;
	  
	  @FindBy(xpath = "//input[@class='select2-search__field']")
	  WebElement UpdateSheetCompanySearch;
	  
	  @FindBy(xpath = "//span[contains(text(),'Choose an Employee')]")
	  WebElement UpdateSheetEmployee;
	  
	  @FindBy(xpath = "//input[@class='select2-search__field']")
	  WebElement UpdateSheetEmployeeSearch;
	  
	  @FindBy(xpath = "//button[@id='add_attendance_btn']")
	  WebElement UpdateSheetAddNew;
	  
	  @FindBy(xpath = "//input[@id='attendance_date_m']")
	  WebElement UpdateSheetAttendanceDt;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-year']")
	  WebElement UpdateSheetyear;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-month']")
	  WebElement UpdateSheetmonth;
	  
	  @FindBy(xpath = "//a[contains(text(),'1')]")
	  WebElement UpdateSheetDay;
	  
	  @FindBy(xpath = "//input[@id='clock_in_m']")
	  WebElement UpdateSheetInTime;
	  
	  @FindBy(xpath = "//div[@class='popover-content']//div[contains(text(),'9')][1]")
	  WebElement UpdateSheetInTimeHours;
	  
	  @FindBy(xpath = "//div[@class='popover-content']//div[contains(text(),'30')][1]")
	  WebElement UpdateSheetInTimeMinutes;
	  
	  @FindBy(xpath = "//input[@id='clock_out_m']")
	  WebElement UpdateSheetOutTime;
	  
	  @FindBy(xpath = "//div[@class='clockpicker-dial clockpicker-hours']//div[contains(text(),'6')][1]")
	  WebElement UpdateSheetOutTimeHours;
	  
	  @FindBy(xpath = "//div[@class='clockpicker-dial clockpicker-minutes']//div[contains(text(),'30')][1]")
	
	  WebElement UpdateSheetOutTimeMinutes;
	  
	  @FindBy(xpath = "//button[contains(text(),'Save')]")
	  WebElement UpdateSheetSave;
	  
	  //-------------Add Overtime-------
	  
	  @FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/overtime_request']")
	  WebElement Overtime;
	  
	  @FindBy(xpath = "//button[@id='add_attendance_btn']")
	  WebElement OvertimeAddNew;
	  
	  @FindBy(xpath = "//span[contains(text(),'Company')]")
	  WebElement OvertimeCompany;
	  
	  @FindBy(xpath = "//input[@class='select2-search__field']")
	  WebElement OvertimeCompanySearch;
	  
	  @FindBy(xpath = "//span[contains(text(),'Choose an Employee')]")
	  WebElement OvertimeEmployee;
	  
	  @FindBy(xpath = "//input[@class='select2-search__field']")
	  WebElement OvertimeEmployeeSearch;
	  
	  @FindBy(xpath = "//input[@placeholder='Date']")
	  WebElement OvertimeDate;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-year']")
	  WebElement OvertimeYear;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-month']")
	  WebElement OvertimeMonth;
	  
	  @FindBy(xpath = "//a[contains(text(),'24')]")
	  WebElement OvertimeDate1;
	  
	  @FindBy(xpath = "//input[@id='clock_in_m']")
	  WebElement OvertimeInTime;
	  
	  @FindBy(xpath = "//div[@class='popover-content']//div[contains(text(),'9')][1]")
	  WebElement OvertimeInTimeHour;
	  
	  @FindBy(xpath = "//div[@class='popover-content']//div[contains(text(),'30')][1]")
	  WebElement OvertimeInTimeMint;
	  
	  @FindBy(xpath = "//input[@id='clock_out_m']")
	  WebElement OvertimeOutTime;
	  
	  @FindBy(xpath = "//div[@class='clockpicker-dial clockpicker-hours']//div[contains(text(),'21')][1]")
	  WebElement OvertimeOutTimeHour;
	  
	  @FindBy(xpath = "//div[@class='clockpicker-dial clockpicker-minutes']//div[contains(text(),'30')][1]")
	  WebElement OvertimeOutTimeMint;
	  
	  @FindBy(xpath = "//textarea[@id='xin_reason']")
	  WebElement OvertimeReason;
	  
	  @FindBy(xpath = "//button[contains(text(),'Save')]")
	  WebElement OvertimeSave;
	  
	  //-----------OfficeShift--------------
	  
	  @FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/timesheet/office_shift']")
	  WebElement OfficeShift;
	  
	  @FindBy(xpath = "//button[@class='btn btn-xs btn-primary']")
	  WebElement OfficeShiftAddNew;
	  
	  @FindBy(xpath = "//span[contains(text(),'Company')]")
	  WebElement OfficeShiftCompany;
	  
	  @FindBy(xpath = "//input[@class='select2-search__field']")
	  WebElement OfficeShiftCompanySearch;
	  
	  @FindBy(xpath = "//input[@placeholder='Shift Name']")
	  WebElement OfficeShiftName;
	  
	  @FindBy(xpath = "//div[@class='clockpicker-dial clockpicker-hours']//div[contains(text(),'19')][1]")
	  WebElement OfficeShiftInHour;
	  
	  @FindBy(xpath = "//input[@class='form-control timepicker clear-1'][@placeholder='In Time']")
	  WebElement OfficeShiftMondayIn;
	  
	  @FindBy(xpath = "//div[@class='clockpicker-dial clockpicker-minutes']//div[contains(text(),'30')]")
	  WebElement OfficeShiftInMinutes;
	  
	  @FindBy(xpath = "//input[@class='form-control timepicker clear-1'][@placeholder='Out Time']")
	  WebElement OfficeShiftMondayOut;
	  
	  @FindBy(xpath = "//div[@class='clockpicker-dial clockpicker-hours']//div[contains(text(),'4')][1]")
	  WebElement OfficeShiftOutHours;
	  
	  @FindBy(xpath = "//div[@class='clockpicker-dial clockpicker-minutes']//div[contains(text(),'30')][1]")
	  WebElement OfficeShiftOutMinutes;
	  
	  @FindBy(xpath = "//input[@class='form-control timepicker clear-2'][@placeholder='In Time']")
	  WebElement OfficeShiftTuesdayIn;
	  
	  @FindBy(xpath = "//input[@class='form-control timepicker clear-2'][@placeholder='Out Time']")
	  WebElement OfficeShiftTuesdayOut;
	  
	  @FindBy(xpath = "//input[@class='form-control timepicker clear-3'][@placeholder='In Time']")
	  WebElement OfficeShiftWedIN;
	  
	  @FindBy(xpath = "//input[@class='form-control timepicker clear-3'][@placeholder='Out Time']")
	  WebElement OfficeShiftWedOut;
	  
	  @FindBy(xpath = "//input[@class='form-control timepicker clear-4'][@placeholder='In Time']")
	  WebElement OfficeShiftThrIn;
	  
	  @FindBy(xpath = "//input[@class='form-control timepicker clear-4'][@placeholder='Out Time']")
	  WebElement OfficeShiftThrOut;
	  
	  @FindBy(xpath = "//input[@class='form-control timepicker clear-5'][@placeholder='In Time']")
	  WebElement OfficeShiftFriIn;
	  
	  @FindBy(xpath = "//input[@class='form-control timepicker clear-5'][@placeholder='Out Time']")
	  WebElement OfficeShiftFriOut;
	  
	  @FindBy(xpath = "//div[@class='form-actions box-footer']//button[1]")
	  WebElement OfficeShiftSave;
	  
	  @FindBy(xpath = "//input[contains(@class,'form-control input-sm')]")
	  WebElement OfficeShiftSearch;
	  
	  //----------Manage Holidays---------
	  
	  @FindBy(xpath = "//a[@href='http://www.evolutionco.in:9090/hrms/admin/timesheet/holidays']")
	  WebElement Holidays;
	  
	  @FindBy(xpath = "//span[contains(text(),'Company')]")
	  WebElement HolidaysCompany;
	  
	  @FindBy(xpath = "//input[@class='select2-search__field']")
	  WebElement HolidaysCompanySearch;
	  
	  @FindBy(xpath = "//input[@placeholder='Event Name']")
	  WebElement HolidaysEventName;
	  
	  @FindBy(xpath = "//input[@placeholder='Start Date']")
	  WebElement HolidaysStartDate;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-year']")
	  WebElement HolidaysStartYear;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-month']")
	  WebElement HolidaysStartMonth;
	  
	  @FindBy(xpath = "//a[contains(text(),'17')]")
	  WebElement HolidaysStartDate1;
	  
	  @FindBy(xpath = "//input[@placeholder='End Date']")
	  WebElement HolidaysEndDate;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-year']")
	  WebElement HolidaysEndYear;
	  
	  @FindBy(xpath = "//select[@class='ui-datepicker-month']")
	  WebElement HolidaysEndMonth;
	  
	  @FindBy(xpath = "//a[contains(text(),'22')]")
	  WebElement HolidaysEndDate1;
	  
	  @FindBy(xpath = "//textarea[@id='description']")
	  WebElement HolidaysDescription;
	  
	  @FindBy(xpath = "//span[@class=\"select2-selection select2-selection--single\"]//span[contains(text(),'Published')]")
	  WebElement HolidaysStatus;
	  
	  @FindBy(xpath = "//input[@class='select2-search__field']")
	  WebElement HolidaysStatusSearch;
	  
	  @FindBy(xpath = "//div[@class='col-md-4']//button[1]")
	  WebElement HolidaysSave;
	  
      public TimeSheetPage()
      {
    	  PageFactory.initElements(driver, this);
      }
      
      public void AddTimeSheetCalender() throws InterruptedException
      {
    	  TimeSheet.click();
    	  Thread.sleep(1000);
    	  TimeSheetCalender.click();
    	  TimeSheetCalenderDate.click();
    	  Thread.sleep(1000);
    	  SelectCode.Sl(TimeSheetCalenderYear, "2019");
    	  SelectCode.Sl(TimeSheetCalenderMonth, "Dec");
    	  TimeSheetCalenderDone.click();
    	  TimeSheetCalenderCompany.click();
    	  Thread.sleep(1000);
    	  TimeSheetCalenderCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
    	  Thread.sleep(1000);
    	  TimeSheetCalenderEmployee.click();
    	  TimeSheetCalenderEmployeeSearch.sendKeys(" Arjun Verma" + Keys.ENTER);
    	  TimeSheetCalenderSave.click();
    	  Thread.sleep(2000);
      }
      
      public void AddDatewiseTimesheet() throws InterruptedException
      {
    	  TimeSheet.click();
    	  Thread.sleep(1000);
    	  DatewiseTimesheet.click();
    	  DatewiseTimesheetStartDate.click();
    	  Thread.sleep(1000);
    	  SelectCode.Sl(DatewiseTimesheetStartYear, "2019");
    	  SelectCode.Sl(DatewiseTimesheetStartMonth, "Dec");
    	  DatewiseTimesheetStartDate1.click();
    	  DatewiseTimesheetEndDate.click();
    	  Thread.sleep(1000);
    	  SelectCode.Sl(DatewiseTimesheetEndYear, "2019");
    	  SelectCode.Sl(DatewiseTimesheetEndMonth, "Dec");
    	  DatewiseTimesheetEndDate1.click();
    	  DatewiseTimesheetCompany.click();
    	  Thread.sleep(1000);
    	  DatewiseTimesheetCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
    	  Thread.sleep(1000);
    	  DatewiseTimesheetEmployee.click();
    	  DatewiseTimesheetEmployeeSearch.sendKeys(" Arjun Verma" + Keys.ENTER);
    	  DatewiseTimesheetSave.click();
    	  Thread.sleep(2000);
    	  
      }
      
      public void UpdateAttendance() throws InterruptedException
      {
    	  TimeSheet.click();
    	  Thread.sleep(1000);
    	  scrol(UpdateSheet);
    	  UpdateSheet.click();
    	  UpdateSheetAttendanceDate.click();
    	  Thread.sleep(1000);
    	  SelectCode.Sl(UpdateSheetAttendaceYear, "2019");
    	  SelectCode.Sl(UpdateSheetAttendaceMonth, "Dec");
    	  UpdateSheetDate1.click();
    	  Thread.sleep(1000);
    	  UpdateSheetCompany.click();
    	  Thread.sleep(1000);
    	  UpdateSheetCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
    	  Thread.sleep(1000);
    	  UpdateSheetEmployee.click();
    	  UpdateSheetEmployeeSearch.sendKeys(" Arjun Verma" + Keys.ENTER);
    	  UpdateSheetGet.click();
    	  Thread.sleep(1000);
    	  UpdateSheetAddNew.click();
    	  Thread.sleep(1000);
    	  UpdateSheetAttendanceDt.click();
    	  Thread.sleep(1000);
    	  SelectCode.Sl(UpdateSheetyear, "2019");
    	  SelectCode.Sl(UpdateSheetmonth, "Dec");
    	  UpdateSheetDay.click();
    	  Thread.sleep(1000);
    	  UpdateSheetInTime.click();
    	  Thread.sleep(1000);
    	  UpdateSheetInTimeHours.click();
    	  Thread.sleep(1000);
    	  UpdateSheetInTimeMinutes.click();
    	  Thread.sleep(2000);
    	  UpdateSheetOutTime.click();
    	  Thread.sleep(1000);
    	  UpdateSheetOutTimeHours.click();
    	  Thread.sleep(1000);
    	  UpdateSheetOutTimeMinutes.click();
    	  Thread.sleep(1000);
    	  UpdateSheetSave.click();
    	  Thread.sleep(2000);
      }
      
      public void OverTime() throws InterruptedException
      {
    	  TimeSheet.click();
    	  Thread.sleep(1000);
    	  scrol(Overtime);
    	  Overtime.click();
    	  OvertimeAddNew.click();
    	  Thread.sleep(1000);
    	  OvertimeCompany.click();
    	  Thread.sleep(1000);
    	  OvertimeCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
    	  Thread.sleep(1000);
    	  OvertimeEmployee.click();
    	  OvertimeEmployeeSearch.sendKeys(" Arjun Verma" + Keys.ENTER);
    	  OvertimeDate.click();
    	  Thread.sleep(1000);
    	  SelectCode.Sl(OvertimeYear, "2019");
    	  SelectCode.Sl(OvertimeMonth, "Dec");
    	  OvertimeDate1.click();
    	  Thread.sleep(1000);
    	  OvertimeInTime.click();
    	  Thread.sleep(1000);
    	  OvertimeInTimeHour.click();
    	  Thread.sleep(1000);
    	  OvertimeInTimeMint.click();
    	  Thread.sleep(1000);
    	  OvertimeOutTime.click();
    	  Thread.sleep(1000);
    	  OvertimeOutTimeHour.click();
    	  Thread.sleep(1000);
    	  OvertimeOutTimeMint.click();
    	  Thread.sleep(1000);
    	  OvertimeReason.sendKeys("Test");
    	  Thread.sleep(1000);
    	  OvertimeSave.click();
    	  Thread.sleep(2000);
      }
      
      public void OfficeShift() throws InterruptedException
      {
    	  TimeSheet.click();
    	  Thread.sleep(1000);
    	  scrol(OfficeShift);
    	  OfficeShift.click();
    	  OfficeShiftAddNew.click();
    	  Thread.sleep(1000);
    	  OfficeShiftCompany.click();
    	  Thread.sleep(1000);
    	  OfficeShiftCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
    	  OfficeShiftName.sendKeys("Night Shift");
    	  Thread.sleep(1000);
    	  OfficeShiftMondayIn.click();
    	  Thread.sleep(1000);
    	  OfficeShiftInHour.click();
    	  Thread.sleep(1000);
    	  OfficeShiftInMinutes.click();
    	  Thread.sleep(1000);
    	  OfficeShiftMondayOut.click();
    	  Thread.sleep(1000);
    	  OfficeShiftOutHours.click();
    	  Thread.sleep(1000);
    	  OfficeShiftOutMinutes.click();
    	  Thread.sleep(1000);
    	  OfficeShiftTuesdayIn.click();
    	  Thread.sleep(1000);
    	  OfficeShiftInHour.click();
    	  Thread.sleep(1000);
    	  OfficeShiftInMinutes.click();
    	  Thread.sleep(1000);
    	  OfficeShiftTuesdayOut.click();
    	  Thread.sleep(1000);
    	  OfficeShiftOutHours.click();
    	  Thread.sleep(1000);
    	  OfficeShiftOutMinutes.click();
    	  Thread.sleep(1000);
    	  OfficeShiftWedIN.click();
    	  Thread.sleep(1000);
    	  OfficeShiftInHour.click();
    	  Thread.sleep(1000);
    	  OfficeShiftInMinutes.click();
    	  Thread.sleep(1000);
    	  OfficeShiftWedOut.click();
    	  Thread.sleep(1000);
    	  OfficeShiftOutHours.click();
    	  Thread.sleep(1000);
    	  OfficeShiftOutMinutes.click();
    	  Thread.sleep(1000);
    	  OfficeShiftThrIn.click();
    	  Thread.sleep(1000);
    	  OfficeShiftInHour.click();
    	  Thread.sleep(1000);
    	  OfficeShiftInMinutes.click();
    	  Thread.sleep(1000);
    	  OfficeShiftThrOut.click();
    	  Thread.sleep(1000);
    	  OfficeShiftOutHours.click();
    	  Thread.sleep(1000);
    	  OfficeShiftOutMinutes.click();
    	  Thread.sleep(1000);
    	  OfficeShiftFriIn.click();
    	  Thread.sleep(1000);
    	  OfficeShiftInHour.click();
    	  Thread.sleep(1000);
    	  OfficeShiftInMinutes.click();
    	  Thread.sleep(1000);
    	  OfficeShiftFriOut.click();
    	  Thread.sleep(1000);
    	  OfficeShiftOutHours.click();
    	  Thread.sleep(1000);
    	  OfficeShiftOutMinutes.click();
    	  Thread.sleep(1000);
    	  OfficeShiftSave.click();
    	  Thread.sleep(1000);
    	  OfficeShiftSearch.click(); 
    	  Thread.sleep(2000);
      }
      
      public void ManageHoliday() throws InterruptedException
      {
    	  TimeSheet.click();
    	  Thread.sleep(1000);
    	  scrol(Holidays);
    	  Holidays.click();
    	  Thread.sleep(1000);
    	  HolidaysCompany.click();
    	  Thread.sleep(1000);
    	  HolidaysCompanySearch.sendKeys("EvolutionCO" + Keys.ENTER);
    	  HolidaysEventName.sendKeys("Holidays");
    	  HolidaysStartDate.click();
    	  Thread.sleep(1000);
    	  SelectCode.Sl(HolidaysStartYear,"2019");
    	  SelectCode.Sl(HolidaysStartMonth, "Dec");
    	  HolidaysStartDate1.click();
    	  HolidaysEndDate.click();
    	  Thread.sleep(1000);
    	  SelectCode.Sl(HolidaysEndYear,"2019");
    	  SelectCode.Sl(HolidaysEndMonth, "Dec");
    	  HolidaysEndDate1.click();
    	  Thread.sleep(1000);
    	  HolidaysDescription.sendKeys("Test");
    	  HolidaysStatus.click();
    	  Thread.sleep(1000);
    	  HolidaysStatusSearch.sendKeys("Published" + Keys.ENTER);
    	  HolidaysSave.click();
    	  Thread.sleep(2000);
      }
      
      
}
