package eshipz_qa;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Integration_Del 
{
	public String baseUrl="https://eshipz-qa.herokuapp.com";
	String driver_path="./software/geckodriver.exe";
	WebDriver driver;
	@BeforeTest
	public void openapp() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver",driver_path);
		driver=new FirefoxDriver();
		driver.get(baseUrl);
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password55");
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		Thread.sleep(3000);
	}
	@Test
	public void main() throws InterruptedException, AWTException 
	{
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='collapsible-header side-nav-data waves-effect waves-light'])[2]")).click();
		driver.findElement(By.xpath("//a[@href='/integrations/shipper-accounts/list']")).click();
		driver.findElement(By.xpath("//i[.='add']")).click();
		driver.findElement(By.xpath("//span[.='DELHIVERY']")).click();
		driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("Dummy");
		driver.findElement(By.xpath("//input[@name='token']")).sendKeys("2bc8efcddc40b32628163b60e5198e74b808aaa3");
		driver.findElement(By.xpath("//input[@name='warehouse_id']")).sendKeys("Ganesh Pawar");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		@AfterTest
	public void closeapp() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}	
}
