package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Prioritypgm {
	
	@BeforeClass
	public void bfClass() {
		System.out.println("before class mthd");
	}
	
	@Test(priority=1,invocationCount=3) //invocationCount =3 mthd execute 3 times
	public void mthdx() {
		System.out.println("Mthd X");
	}
	
	@Test(priority = 2 ,enabled =false)
	public void mthdA() {
		System.out.println("mthd A");
	}
	
	@Test(priority = 3)
	public void mthdF() {
		System.out.println("mthd F");
	}
	@AfterClass
	public void afclassmthd() {
		System.out.println("After Class mthd");
	}

}
