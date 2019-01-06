package eshipz_qa;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		WebElement ele= driver.findElement(By.xpath("(//div[@class='collapsible-header side-nav-data waves-effect waves-light'])[1]"));
		ele.click();
		driver.findElement(By.xpath("(//a[@class='waves-effect waves-light'])[2]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@name='billing_name']"));
		//driver.findElement(By.xpath("//input[@name='billing_phone']"));
		//driver.findElement(By.xpath("//input[@name='billing_email']"));
		driver.findElement(By.xpath("//i[.='add_circle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='contact_name']")).sendKeys("krupa");
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("d.v.krupa@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("6666666666");
		driver.findElement(By.id("street1")).sendKeys("Rajajinagar");
		driver.findElement(By.id("street2")).sendKeys("Rajajinagar11");
		driver.findElement(By.id("street3")).sendKeys("Rajajinagar333");
		driver.findElement(By.id("city")).sendKeys("Banglore");
		driver.findElement(By.id("state")).sendKeys("Karnataka");
		driver.findElement(By.id("postal_code")).sendKeys("572106");
		driver.findElement(By.xpath("//span[.='India']"));
		driver.findElement(By.id("alias_name")).sendKeys("krupa");
		driver.findElement(By.id("tax_id")).sendKeys("523470");
		driver.findElement(By.id("fax")).sendKeys("mjgutls");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.navigate().refresh();
		WebElement p = driver.findElement(By.xpath("//input[@class='select-dropdown']"));
		p.click();
		WebElement ware_hs = driver.findElement(By.xpath("//span[contains(.,'krupa ')]"));
		boolean pst = ware_hs.isDisplayed();
		System.out.println(pst);
		}
		@AfterTest
	public void closeapp() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}	
}
