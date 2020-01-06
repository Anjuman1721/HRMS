package UTIL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectCode 
{
	
	public static void Sl(WebElement Demo, String Value) 
	{
		Demo.click();
		Select s= new Select(Demo);
		//System.out.println(Value);
		s.selectByVisibleText(Value);
	}
}
