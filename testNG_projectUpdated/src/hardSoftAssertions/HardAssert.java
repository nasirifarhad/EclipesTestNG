package hardSoftAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	//hard assertion will fail after single statement fail while soft assertion won't
	//and will continue executing remaining lines
	//below codes are a good practice for putting hard assertions because if the browser won't open so 
	//there is no point of executing other test cases...
	@Test
	public void hardAsserttion () {
		System.out.println("open browser");
		Assert.assertEquals(true, false); //must be hard assertion
		System.out.println("enter user name");
		System.out.println("enter password");
		System.out.println("click on sign in button");
		//you can also put msg with assertions
		Assert.assertEquals(true, false,"this line doesn't pass"); //must be hard assertion
		
		


	}

}
