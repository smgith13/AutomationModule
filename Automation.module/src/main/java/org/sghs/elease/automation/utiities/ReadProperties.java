package org.sghs.elease.automation.utiities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	static String userdir = System.getProperty("user.dir") + "//testConfigResources//";
	static FileInputStream fileInput;
	static Properties prop;

	public static Properties loadProperties(String TestProperties, String unknown) {
		File file;
		String path = userdir  + TestProperties + ".properties";
		try {
			fileInput = new FileInputStream(new File(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;

	}
}
