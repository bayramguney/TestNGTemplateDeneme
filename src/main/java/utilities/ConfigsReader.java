package utilities;

import java.io.*;
import java.util.*;

public class ConfigsReader {

	private static Properties prop;
	static String filePath = "src/test/resources/properties/Config.properties";

//	public static Properties readProperties() {
//		try {
//			FileInputStream fis = new FileInputStream(filePath);
//			prop = new Properties();
//			prop.load(fis);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return prop;
//	}

	public static String getProperty(String key) {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
}
