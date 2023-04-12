package propertydata;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/resources/kranthicommondata.properties");
		//Java Lib has inbuilt capability to read the commmon data from property file
		//create the properties object
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty("url");
		System.out.println(value);
	}
}
