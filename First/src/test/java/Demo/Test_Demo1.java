package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Demo1 {
	WebDriver driver;

	@BeforeTest
	public void bt() {
		//System.out.println("This is first");
		
		System.setProperty("webdriver.chrome.driver", "/Users/pratibha.ranjan/Drivers/chromedriver");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		 
	}
	
	@AfterTest
	public void at() throws InterruptedException {
		//System.out.println("This is third");
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void testcase1() throws InterruptedException {
		//System.out.println("This is second");
		
		  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.xpath("//*[@name='Submit' or @id='btnLogin']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("welcome")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	  
	}
	
}
