package POMpagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	//locating weblements using page factory
	@FindBy(xpath="//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(id="upass")WebElement password;
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]")WebElement loginbtn;
	
	//constructor
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void setvalues() 
	{
		username.sendKeys("abcd@gmail.com");
		password.sendKeys("1234");
	}
	
	public void loginmthd() 
	{
		loginbtn.click();
	}
	public String titlemthd() 
	{
		String title=driver.getTitle();
		return title;
	}

}
