package eshipz_qa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home_page
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
	public void Home() throws InterruptedException, AWTException 
	{
		driver.findElement(By.xpath("//img[@src='/static/img/ecz_white_logo.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/dashboard/shipments/pre-schedule']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@href='/dashboard/shipments/scheduled']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@href='/dashboard/shipments/cancelled']")).click();
		Thread.sleep(5000);
	    driver.navigate().back();
	    driver.navigate().refresh();
		driver.findElement(By.id("start_date")).sendKeys("12/12/2018");;
		driver.findElement(By.id("end_date")).sendKeys("12/14/2018");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		WebElement k = driver.findElement(By.xpath("//img[@src='/static/img/user.svg']"));
		boolean p = k.isDisplayed();
		System.out.println(p);
		driver.findElement(By.xpath("//img[@src='/static/img/order_creation.svg']")).click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("(//img[@src='/static/img/upload.svg'])[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//img[@src='/static/img/help.svg']")).click();
		 Thread.sleep(3000);
		 Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_W);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_W);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//img[@src='/static/img/exit_to_app.png']")).click();
			}
	@AfterTest
	public void closeapp() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}	
}
