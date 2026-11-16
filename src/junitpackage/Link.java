package junitpackage;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	ChromeDriver driver;
	 
	@BeforeEach
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void linkcount() {
		List<WebElement> link=driver.findElements(By.tagName("a")); //a tag is been located
		System.out.println("Link count="+link.size());
		
		for(WebElement li:link) {
			System.out.println("link---"+li.getAttribute("href"));
			System.out.println(li.getText()+"---"+li.getAttribute("href"));

		}
	}

}
