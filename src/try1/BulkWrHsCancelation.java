package try1;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class BulkWrHsCancelation
{
	static WebDriver driver;
	
@Test
	public static void forNow() throws InterruptedException, AWTException
	{
		String path = "C:\\Users\\Windows\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://eshipz-qa.herokuapp.com/");
		
	


		LoginPage login= new LoginPage(driver);
		login.eshipzLogin("krupa.ecourierz@gmail.com", "password");


		HomePage home = new HomePage(driver);
		home.clickOnMyAccount();
		home.clickOnDeliveryWarehouse();
		driver.navigate().refresh();
		List<WebElement> ele = driver.findElements(By.xpath("//a[@title='Delete Warehouse']//i"));
		int count1 = ele.size();
		System.out.println(count1);   
				for(int i=0; i<=count1-1; i++)
		{

		WebElement ele1 = driver.findElement(By.xpath("(//i[text()='delete_forever'])[10]"));
		ele1.click();
		  WebElement a = driver.switchTo().activeElement();
		a.findElement(By.xpath("//button[.='Delete']")).click();
		driver.navigate().refresh();
		//System.out.println("-------SUCCESS--------");
		}                       



		//TO UNSUBSCRIBE		
		/*driver.findElement(By.xpath("(//i[.='attach_money'])[1]")).click();
		driver.navigate().refresh();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        boolean res = driver.findElement(By.xpath("(//a[@id='unsubscribe_essential'])[1]")).isEnabled();
        System.out.println(res);
        if(res==true)
        {
        	driver.findElement(By.xpath("(//a[@id='unsubscribe_essential'])[1]")).click();
        }

		WebElement one = driver.switchTo().activeElement();
		one.findElement(By.xpath("//a[@id='unsubConfirmed'][1]")).click();
		System.out.println("----Successfully unsubscribed-------");*/




	}

	

}

