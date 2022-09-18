package hardSoftAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SftAssrt {

SoftAssert softAssert = new SoftAssert();
	
	
	@Test
	public void softAss() {
		
	//in below lines we dont need to put hard assert because it doesn't matter 
	//so create softAssert obj and put soft asserts

		System.out.println(" home page title");
		
		softAssert.assertEquals(true, false);     //soft assert
		
// you can also print some messages with Asserts like below
		System.out.println("create a new account");    
		softAssert.assertEquals(true, false, "this line doesn't pass although its OK");     //soft assert

		System.out.println("sign out");
		softAssert.assertEquals(true, false);     //soft assert
		
		softAssert.assertAll(); // if you dont put this line then your test case will got and marked passed
}
}