package eshipz_qa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateShipment 
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
		driver.findElement(By.xpath("(//a[@href='/create-shipment'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Shipper Accounts']")).click();
		Thread.sleep(4000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='Pickup Warehouses']")).click();
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(4000);
		driver.findElement(By.id("customer_ref")).sendKeys("1");
		driver.findElement(By.id("parcel_details")).sendKeys("bag");
		driver.findElement(By.id("cod_amount")).sendKeys("1114");
		WebElement ele = driver.findElement(By.xpath("//select[@ng-change='changeValue(order.shipment.warehouse_id,order,warehouse_address)']"));
		ele.click();
		Select s= new Select(ele);
		s.selectByIndex(1);
		WebElement ele1 = driver.findElement(By.xpath("//select[@ng-model='order.shipment.courier_purpose']"));
		ele1.click();
		Select s1= new Select(ele1);
		s1.selectByIndex(1);
		WebElement ele2 = driver.findElement(By.xpath("//select[@ng-model='order.is_document']"));
		ele2.click();
		Select s2=new Select(ele2);
		s2.selectByIndex(2);
			  driver.findElement(By.id("length")).sendKeys("10");
			  driver.findElement(By.id("width")).sendKeys("10");
			  driver.findElement(By.id("height")).sendKeys("10");
			  driver.findElement(By.id("item_desc")).sendKeys("toys");
			  driver.findElement(By.id("weight")).sendKeys("50");
			  driver.findElement(By.id("value")).sendKeys("20");
			  driver.findElement(By.id("receiver_name")).sendKeys("joy");
			  driver.findElement(By.id("receiver_phone")).sendKeys("8155555555");
			  driver.findElement(By.id("receiver_email")).sendKeys("test@gmail.com");
			  driver.findElement(By.id("receiver_city")).sendKeys("Banglore");
			  driver.findElement(By.id("receiver_pincode")).sendKeys("560003");
			  driver.findElement(By.xpath("//select[@ng-model='order.shipment.type']")).sendKeys("r");
			  Thread.sleep(3000);
			  driver.findElement(By.id("receiver_street1")).sendKeys("Malleshwaram");
			  driver.findElement(By.id("receiver_street2")).sendKeys("Malleshwaram1");
			  driver.findElement(By.id("receiver_street3")).sendKeys("Malleshwaram3");
			  driver.findElement(By.id("receiver_state")).sendKeys("KA");
			  WebElement e = driver.findElement(By.xpath("//select[@ng-model='order.shipment.country']"));
			   Select s4= new Select(e);
			 List<WebElement> options4 =s4.getOptions();
			 int count4 = options4.size();
			 System.out.println(count4);
			 for(WebElement b:options4)
			 {
				 String text =  b.getText();
				 System.out.println(text);
			 }
			 e.sendKeys("India");
			 e.sendKeys(Keys.ENTER);
			 Thread.sleep(6000);
			 driver.findElement(By.xpath("//button[@class='btn waves-effect waves-light right']")).click();
			  Thread.sleep(3000);
			  WebElement p = driver.findElement(By.xpath("//select[@ng-model='selectedService']"));
			  p.sendKeys("I");
			  p.sendKeys("I");
			  p.sendKeys(Keys.ENTER);
			 Thread.sleep(3000);
			   driver.findElement(By.xpath("//button[@class='btn btn-danger ng-scope']")).click();
			   Thread.sleep(1000);
			   driver.findElement(By.xpath("(//span[1])[4]")).click();
			   Thread.sleep(1000);
			   r.keyPress(KeyEvent.VK_ALT);
			   r.keyPress(KeyEvent.VK_S);
			   r.keyRelease(KeyEvent.VK_ALT);
			   r.keyRelease(KeyEvent.VK_S);
			   r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	@AfterTest
	public void closeapp() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}	
}
