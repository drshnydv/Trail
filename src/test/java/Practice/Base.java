package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	@BeforeSuite(groups = {"smoke","regression"})
	public void BS() {
		
		System.out.println("Before Suite");
		
	}
	
	@AfterSuite(groups = {"smoke","regression"})
	public void AS() {
		
		System.out.println("After Suite");
		
	}
	
	@BeforeClass(groups = {"smoke","regression"})
	public void BC() {
		
		System.out.println("Before Class");
		
	}
	
	@AfterClass(groups = {"smoke","regression"})
	public void AC() {
		
		System.out.println("After Class");
		
	}
	
	@BeforeMethod(groups = {"smoke","regression"})
	public void BM() {
		
		System.out.println("Before Metod");
		
	}
	
	@AfterMethod(groups = {"smoke","regression"})
	public void AM() {
		
		System.out.println("After Method");
		
	}

}
