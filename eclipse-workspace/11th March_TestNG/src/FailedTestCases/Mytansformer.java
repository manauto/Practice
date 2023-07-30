package FailedTestCases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Mytansformer implements IAnnotationTransformer {

	//Iannotation is a class
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		
		annotation.setRetryAnalyzer(RetryAnalyser.class);
	}
}