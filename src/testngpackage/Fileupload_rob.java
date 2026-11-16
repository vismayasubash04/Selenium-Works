package testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Fileupload_rob {
	ChromeDriver driver;
	
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
	}

}
