package junitpackage;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecode {
	ChromeDriver driver;
	
	@BeforeEach
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void login() throws Exception {
		String url=driver.getCurrentUrl();//
		URI ob=new URI(url);//verify the text is in limit format
		URL Link=ob.toURL();
		HttpURLConnection con=(HttpURLConnection)Link.openConnection();
		int responsecode=con.getResponseCode();
		System.out.println("Response code is "+responsecode);
		
		if(responsecode==200) {
			System.out.println("valid link");
		}
		else if (responsecode==404) {
			System.out.println("Broken link");
		}
		else {
			System.out.println("other response code");
		}
	}
}
