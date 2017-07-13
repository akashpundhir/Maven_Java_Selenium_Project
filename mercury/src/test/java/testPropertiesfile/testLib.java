package testPropertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testLib {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		Properties lib=new Properties();
		lib.load(new FileInputStream("ObjectRepo\\ObjectsConfig.properties"));
		
		
		System.out.println(lib.getProperty("FirstName"));
		System.out.println(lib.getProperty("LastName"));
		System.out.println(lib.getProperty("EmailID"));
		System.out.println(lib.getProperty("CreatePassword"));
		
		System.out.println(lib.getProperty("loginEmailID"));
		
		System.out.println(lib.getProperty("loginpassword"));
		
	}

}
