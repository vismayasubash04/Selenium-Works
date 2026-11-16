package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {
	ChromeDriver driver;
	
	@BeforeEach
	public void browser_setup() {
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void homepage() throws Exception  {
		Thread.sleep(2000);
		WebElement search= driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		//search.sendKeys("Mobiles");
		search.sendKeys("Mobiles",Keys.ENTER);
		
		WebElement electronics=driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]/ul/li[6]/div/a;"));
		electronics.click();
		WebElement cart=driver.findElement(By.xpath("//a[@id=\"nav-cart\"]"));
		cart.click();
		
	}

}
