package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RightAndDouble {
	ChromeDriver driver;
	
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		}
	@Test
	public void login() throws Exception {
		
		Thread.sleep(2000);
		WebElement doublebtn=driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		
		Actions act=new Actions(driver);
		act.doubleClick(doublebtn);
		
		Thread.sleep(2000);
		WebElement rightbtn=driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		act.contextClick(rightbtn);
		
		act.perform();
	}

}
