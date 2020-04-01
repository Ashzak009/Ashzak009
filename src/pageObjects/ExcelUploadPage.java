package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ExcelUploadPage 
{
	WebDriver driver;
	int TimeOutValue= 30;
	
	public ExcelUploadPage(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,TimeOutValue), this);
	}
	
	@FindBy(xpath="//input[@name='file']")
	public
	WebElement selectFile;
	
	@FindBy(name="action")
	public
	WebElement upload;
	
	public void selectUpload(String file_name)
	{
		selectFile.sendKeys(file_name);
		upload.click();
	}

	

}
