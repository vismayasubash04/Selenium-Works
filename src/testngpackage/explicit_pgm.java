package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class explicit_pgm {
	ChromeDriver driver;
	
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	@Test
	public void explicit_mthd() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		WebElement electronics=driver.findElement(By.xpath(""));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		Actions act=new Actions(driver);
		act.moveToElement(electronics).perform();
		
		//WebElement option=driver.findElement(By.xpath(""));
		//option.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))).click();
	}

}
