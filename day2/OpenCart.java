package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-username")).sendKeys("Thanyaa");
		driver.findElement(By.id("input-firstname")).sendKeys("Thanyaa");
		driver.findElement(By.id("input-lastname")).sendKeys("Kumaran");
		driver.findElement(By.id("input-email")).sendKeys("thanyaakumaran@gmail.com");
		WebElement dropDown = driver.findElement(By.id("input-country"));
		Select country = new Select(dropDown);
		country.selectByValue("99");
		driver.findElement(By.id("input-password")).sendKeys("Test@123");
		// driver.findElement(By.xpath("//button[@type='submit'][2]")).click();
		driver.close();

	}

}
