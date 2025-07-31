package utils;

import org.testng.asserts.SoftAssert;

public class SoftAssertionUtil1 {

	private static SoftAssert getInstance;
	
	private SoftAssertionUtil1() {
		
	}

	public static SoftAssert getInstance() {
		if (getInstance == null) {
			getInstance = new SoftAssert();
		}
		return getInstance;
	}

	public static void assertEquals(Object actual, Object expected, String msg) {
		try {
			getInstance.assertEquals(actual, expected);
		} catch (AssertionError e) {
			getInstance.fail(msg);
		}
	}

	public static void assertAll() {
		getInstance.assertAll();
	}
}
//note: singleton Pattern create instance once. 
//solve problem of accessing instance:- by making softasssert method as static and access it .