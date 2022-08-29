package Practice;

import org.testng.annotations.Test;

public class twoTest extends Base{
	
	@Test(groups = "smoke")
	public void secondTest() {
		
		System.out.println("Second");
		
	}

}