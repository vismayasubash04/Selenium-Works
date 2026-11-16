package junitpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralapropertylogin {
	ChromeDriver driver;
	@BeforeEach
	public void setup() {
		driver =new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();	//to maximize the window
	}
	@Test
	public void titleverification() {
		String actualtitle=driver.getTitle();
		System.out.println("Title of the web page:"+actualtitle);
	}
	
	@Test
	public void textverification() {
		String sourcecode=driver.getPageSource();//to reterive the source code information
		if(sourcecode.contains("User Login")) {
			System.out.println("Text is present");
		}
		else {
			System.out.println("Text is not present");
		}
	}
	@Test 
	public void login() {
		WebElement username =driver.findElement(By.id("ulogin")); //locating username with locator id
		username.sendKeys("abcd"); //only string values are accepted
		
	WebElement password =driver.findElement(By.name("upass"));
	password.sendKeys("pass123");
	
	WebElement loginButton =driver.findElement(By.id("sub_logbtn"));
	loginButton.click();
	}
	@AfterEach
	public void closewindow() {
		driver.quit();
	}

}
