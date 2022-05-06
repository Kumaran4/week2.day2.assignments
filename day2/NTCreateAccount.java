package Week2.day2;

import java.time.Duration;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {
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
		// * 7. Select preferred currency as Indian Rupee using SelectByValue
		WebElement elementIndianRupee = driver.findElement(By.id("currencyUomId"));
		Select DropDown = new Select(elementIndianRupee);
		// DropDown.selectByIndex(20);
		// DropDown.selectByValue("INR - Indian Rupee");
		DropDown.selectByVisibleText("INR - Indian Rupee");
		// * 8. Enter the Description text as "NRI Account"
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		// * 9. Enter LocalName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Local");
		// * 10. Enter SiteName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("TestLeaf");
		// * 11. Enter value for AnnualRevenue Field using Xpath Locator but class as
		// Attribute
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("10cr");
		// * 17. Click on Create Account using Xpath Locator
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// * 18. Get the Text of Error Message Displayed (hint: Red Texts)
		String text = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		System.out.println(text);
		// * close the browser
		driver.close();
	}

}
