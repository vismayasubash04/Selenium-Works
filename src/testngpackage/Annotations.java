package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeTest
	public void beforetestmethod() {
		System.out.println("Before test method--");
	}
	
	@BeforeClass
	public void beforeclassmthd() {
		System.out.println("Before class method--");
	}
	
	@BeforeMethod
	public void befmthd() {
		System.out.println("Before Method");
	}
	
	@Test
	public void testmthdA() {
		System.out.println("Test method A");
	}
	
	@Test
	public void testmthdX() {
		System.out.println("Test method X");
	}
	
	@Test
	public void testmthdC() {
		System.out.println("Test method C");
	}
	@AfterMethod
	public void afmthd() {
		System.out.println("After method");
	}
	
	@AfterClass
	public void afclassmthd() {
		System.out.println("After class method");
	}
	
	@AfterTest
	public void aftestmthd() {
		System.out.println("After Class Method");
	}

}
