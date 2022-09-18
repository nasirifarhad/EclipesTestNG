package retryConceptInTestNG;

import org.testng.annotations.Test;

public class RetryInTestNG {
	
	// we can re-execute the failed test case and there are 2 kind as follows
	//1. at test level
	//2. at run time
	
	
//	@Test(retryAnalyzer = RetryAnalyzer.class)  // in here we give the address of RetryAnalyzer class that we impelements
//	//it will try this test case 3 times (its retrying in test level)
//	public void TestNo1 () {
//		System.out.println(9/0);
//	}
	
	
	@Test
	public void TestNo2 () {
		System.out.println(9/0);
	}

}
