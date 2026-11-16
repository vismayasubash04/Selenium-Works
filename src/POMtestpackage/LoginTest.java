package POMtestpackage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMbasepackage.BaseClass;
import POMpagepackage.LoginPage;

public class LoginTest extends BaseClass
{
	LoginPage obj;
	
	@BeforeMethod
	public void objectmethod() 
	{
		obj=new LoginPage(driver);
		
	}
	@Test
	public void logintest() {
		obj.setvalues();
		obj.loginmthd();
	}

	@Test
	public void titleverification() 
	{
		System.out.println(obj.titlemthd());
	}
	}


