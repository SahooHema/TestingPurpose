package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class PropertyReader {
	
	public static String propertyReader(String filepath,String key) {
		String value=null;;
		try {
			FileInputStream filestream = new FileInputStream(filepath);				
		Properties prop = new Properties();
			prop.load(filestream);
		value=	prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;				
	}
}
