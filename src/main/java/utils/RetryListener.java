package utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;




public class RetryListener implements IAnnotationTransformer {

	public void transform(ITestAnnotation testannotation,Constructor testcons,Class testclass, Method testmethod ) {
		Class<? extends IRetryAnalyzer> retry= testannotation.getRetryAnalyzerClass();
		if(retry==null) {
			testannotation.setRetryAnalyzer(FailRetry.class);
		}
	}
 
}

