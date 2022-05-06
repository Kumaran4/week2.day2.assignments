package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	public static void main(String[] args) {
		// * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// * 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// * 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		// * 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// * 5. Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();
		// * 6. Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		// * 7. Enter AccountName Field Using Xpath Locator value as Debit Limited
		// Account
		driver.findElement(By.xpath("//input[@name='accountName'][1]")).sendKeys("Debit Limited Account");
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		// * 8. Enter DEscriptiion as "Selenium Automation Tester"
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		// * 9. Enter LocalName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Local");
		// * 10. Enter SiteName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("TestLeaf");
		// * 11. Enter value for AnnualRevenue Field using Xpath Locator but class as
		// Attribute
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("10cr");
		// * 14. Click on Create Account using Xpath Locator
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// * 15.Close the browser
		driver.close();

	}

}
