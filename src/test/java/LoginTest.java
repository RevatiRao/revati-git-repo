import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
	WebDriverManager.firefoxdriver().setup();	
	driver = new FirefoxDriver();
	
	}
	@Test
	public void doLogin() throws InterruptedException 
	{
		
		driver.get("http://gmail.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("revatidrao222@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("dhawal92");
		driver.findElement(By.id("SignIn")).click(); //just to test GIT updates
	}
	
	@AfterTest
	public void tearDown()
	{
	driver.quit();
	}
	
}
