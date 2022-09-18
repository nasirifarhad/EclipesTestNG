package retryConceptInTestNG;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TheTransformer implements IAnnotationTransformer {
//1- IAnnotationTranformer is an interface and we are going to implements and override the following method
//along with its parameters exactly as it is.
//2- make sure to import Constructor amd Method from java.lang.reflect
//this is the standard and exact form of method with its parameters, write it as exact as abelow
//3- you can do this listener from Testng.xml, there you have to write listener after suite then run it from there
// if you want to run it from test itself then you have to write it after @Test(retryAnalyzer = RetryAnalyzer.class) 
	
public void transform(ITestAnnotation annotation,Class testClass,Constructor testConstructor,Method testMethod)
	{
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

	
	
}
