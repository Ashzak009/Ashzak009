package eshipz_qa;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dem11 
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
		driver.findElement(By.xpath("(//div[@class='collapsible-header side-nav-data waves-effect waves-light'])[2]")).click();
		driver.findElement(By.xpath("//a[@href='/integrations/shipper-accounts/list']")).click();
		driver.findElement(By.xpath("//i[.='add']")).click();
		driver.findElement(By.xpath("//span[.='FEDEX']")).click();
		driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("Dummy");
		driver.findElement(By.xpath("//input[@name='account_number']")).sendKeys("762271583");
		driver.findElement(By.xpath("//input[@name='key']")).sendKeys("WcUX5wR8Gy74sxn0");	
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1svg1sK4Ny28vLaKlsxAUrSuH");
		driver.findElement(By.xpath("//input[@name='meter_number']")).sendKeys("109481732");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		@AfterTest
	public void closeapp() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}	
}
