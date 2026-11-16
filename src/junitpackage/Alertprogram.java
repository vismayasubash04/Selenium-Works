package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprogram {
	ChromeDriver driver;
	
	@BeforeEach
	public void browser_setup() {
		driver =new ChromeDriver();
		driver.get("file:///C:/Users/Aiswarya/Desktop/alert.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void alertpage() throws Exception {
		WebElement display=driver.findElement(By.xpath("/html/body/input[1]"));
		display.click();
		
		//handle alert box
		Alert alrt=driver.switchTo().alert(); //to switch to alert box
		String alert_text=alrt.getText(); //to retrive the alert text
		System.out.println("Alert text="+alert_text);
		
		Thread.sleep(2000);
		alrt.accept(); // to click on ok button
		
		WebElement firstname=driver.findElement(By.xpath("/html/body/input[2]"));
		firstname.sendKeys("Vismaya");
		
		WebElement lastname=driver.findElement(By.xpath("/html/body/input[3]"));
		lastname.sendKeys("subash");
		
		WebElement submit=driver.findElement(By.xpath("/html/body/input[4]"));
		submit.click();	
	}
}
