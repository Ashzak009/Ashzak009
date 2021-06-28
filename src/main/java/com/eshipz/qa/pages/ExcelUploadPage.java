package com.eshipz.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.eshipz.qa.base.BaseClass;

public class ExcelUploadPage extends BaseClass
{
	int TimeOutValue= 30;
	
	public ExcelUploadPage() 
	{	
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,TimeOutValue), this);
	}
	
	@FindBy(className="sidenav-heading")
	public WebElement excelPageHeaderName;
	
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
	
	@FindBy(xpath="(//div[@class='row notes']//b)[1]")
	public WebElement excelTemplate_link;
	
	@FindBy(xpath="(//div[@class='row notes']//b)[2]")
	public WebElement countryWithCode_link;
	
	@FindBy(xpath="(//div[@class='row notes']//b)[3]")
	public WebElement countryWithCodeUnderMapping_link;
	
	public String getPageHeaderName()
	{
		return (excelPageHeaderName.getText());
	}
	
	
	public ForwardCreateShipmentPage selectUpload(String file_name) throws InterruptedException
	{
		selectFile.sendKeys(file_name);
		upload.click();
		return (new ForwardCreateShipmentPage());
		
	}
}
