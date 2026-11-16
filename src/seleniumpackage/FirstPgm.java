package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com/");
		String actualtitle= driver.getTitle(); //to reterive the title of web application
		System.out.println("The title of web application is:"+actualtitle);
		
		String expectedtitle ="Google";
		if (actualtitle.equals(expectedtitle)) {
			System.out.println("the title matches");
		}
		else {
			System.out.println("the title does not match");
		}

	}

}
