package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationdemo {
	ChromeDriver driver;
	
	@BeforeEach
	public void browser_setup() {
		driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void alertbox() throws Exception{
		WebElement alertok =driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		alertok.click();
		
		Alert al=driver.switchTo().alert(); 
		String alText=al.getText(); 
		System.out.println("Alert text="+alText);
		
		Thread.sleep(2000);
		al.accept();
		
		WebElement alerttwo=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alerttwo.click();
		
		WebElement alerttwobtn=driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		alerttwobtn.click();
		
		Alert al2=driver.switchTo().alert();
		Thread.sleep(2000);
		al2.dismiss();
		
		WebElement alertthree=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alertthree.click();
		
		WebElement alertthreebtn=driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		alertthreebtn.click();
		
		Alert al3=driver.switchTo().alert();
		al3.sendKeys("vismaya");
		
		Thread.sleep(2000);
		al3.accept();	
}
}
