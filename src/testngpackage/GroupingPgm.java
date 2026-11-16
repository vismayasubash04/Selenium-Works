package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupingPgm {
	
	@BeforeClass(alwaysRun=true)
	public void bfclass() {
		System.out.println("before class method");
	}
	
	@Test(priority =1,groups="smoke")
	public void testmthd() {
		System.out.println("test method");
	}
	
	@Test(priority =2,groups="sanity")
	public void testmthd_two() {
		System.out.println("test method two");
	}
	
	@Test(priority =3,groups={"regression","smoke"})
	public void testmthd_three() {
		System.out.println("test method three");
	}
	
	@AfterClass(alwaysRun=true)
	public void afclass() {
		System.out.println("after class method");
	}
	

}
