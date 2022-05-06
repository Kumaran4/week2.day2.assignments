package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {
	public static void main(String[] args) {
		//		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		 * 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		 * 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
//		 * 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
//		 * 5. Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();
//		 * 6. Click on Find Accounts
		driver.findElement(By.linkText("Find Accounts")).click();
//		 * 7. Enter AccountName as "Credit Limited Account"
		driver.findElement(By.xpath("//input[@name='accountName'][1]")).sendKeys("Credit Limited Account");
		//driver.findElement(By.xpath("//input[@name='accountName'][2]")).sendKeys("Credit Limited Account");
//		 * 8. Click on Find Accounts using xpath Locator
		//driver.findElement(By.xpath("//button[@type='button'][7]")).click();
		driver.findElement(By.linkText("Find Accounts")).click();
//		 * 9. Click on the edit Button
		
//		 * 

//		 * 
//		 * 10. Get the Text of Account Name and verify 
//		 *  
//		 * 11. Get the Text of Description
//		 * 
//		 * 12. Get the title of the page and verify it.
//		 */
	}
	

}
