package eshipz_qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Intigration_armx {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.get("https://eshipz-qa.herokuapp.com");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password55");
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='collapsible-header side-nav-data waves-effect waves-light'])[2]")).click();
		driver.findElement(By.xpath("//a[@href='/integrations/shipper-accounts/list']")).click();
		driver.findElement(By.xpath("//i[.='add']")).click();
		driver.findElement(By.xpath("//span[.='ARAMEX']")).click();
		driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("Dummy");
		driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("shashi@ecourierz.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Ecz@ecz1");
		driver.findElement(By.xpath("//input[@name='Version']")).sendKeys("v2.0");
		driver.findElement(By.xpath("//input[@name='AccountNumber']")).sendKeys("36671891");
		driver.findElement(By.xpath("//input[@name='AccountPin']")).sendKeys("432432");
		driver.findElement(By.xpath("//input[@name='AccountEntity']")).sendKeys("BOM");
		driver.findElement(By.xpath("//input[@name='AccountCountryCode']")).sendKeys("IN");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
