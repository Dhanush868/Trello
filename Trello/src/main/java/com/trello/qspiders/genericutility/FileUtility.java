package com.trello.qspiders.genericutility;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * To read the data from property file exclusive for common data
 * @author QCSE6
 *
 */
public class FileUtility {
/**
 * @author QCSE6
 * @param fileName
 * @param key
 * @return value
 * @throws Throwable
 */
	public String readDataFromPropertyFile(String fileName, String key) throws Throwable {
		FileInputStream fis=new FileInputStream(fileName);
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
}
