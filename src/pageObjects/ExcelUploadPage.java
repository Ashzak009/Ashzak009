package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

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
	public WebElement selectFile;
	
	@FindBy(name="action")
	public WebElement upload;
	
	@FindBy(xpath="//select[@name='select_mapper']")
	public WebElement map_dropdown;
	
	@FindBy(xpath="//input[@class='select-dropdown']")
	public WebElement map_dropdown_1;
	
	@FindBy(xpath="//span[.='ESHIPZ']")
	public WebElement eshipz_option;
	
	@FindBy(xpath="//a[@href='/excel-upload/excel-mapper']")
	public WebElement add_map_button;
	
	public void selectUpload(String file_name) throws InterruptedException
	{
		selectFile.sendKeys(file_name);
/*		Select map = new Select(map_dropdown);
		List<WebElement> trecqe = map.getOptions();
		int number = trecqe.size();
		System.out.println("number"+number);
		for(int i=0;i<=number;i++)
		{
		System.out.println("with in for loop"+trecqe);
		}
		map.selectByIndex(0);*/
		map_dropdown_1.click();
		Thread.sleep(2000);
		eshipz_option.click();
		upload.click();
	}

	

}
