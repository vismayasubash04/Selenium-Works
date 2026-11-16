package junitpackage;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ResponseCodepgm2 {
ChromeDriver driver;
	
	@BeforeEach
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
}
	@Test
	public void linkcount() throws Exception {
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links ="+links.size());
		
		for(WebElement li:links) {
			String url=li.getAttribute("href");
			verify(url);
		}
	}
	private void verify(String url) throws Exception {
		
		try {
			
		
		URI ob=new URI(url);
		URL value=ob.toURL();
		HttpURLConnection con=(HttpURLConnection)value.openConnection();
		
		int responsecode =con.getResponseCode();
		if(responsecode==200) {
			System.out.println("valid link"+url);
		}
		else if(responsecode==404) {
			System.out.println("broken link "+url);
		}
		else {
			System.out.println("other response code"+url);
		}	
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	}
