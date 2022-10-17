package com.crm.Generic_Utilities;

import java.io.FileInputStream;
import java.util.Properties;


public class File_Utility {
	
	/**
	 * This method is used to launch the application
	 * @param Key
	 * @return
	 * @throws Throwable
	 * @author Hemanth
	 */

	public String getPropertyKeyValue(String Key) throws Throwable {
		//FileInputStream fis=new FileInputStream("./Common_Data.properties");
		FileInputStream fis=new FileInputStream(IPathConstant.PROPERTYFILE_PATH);
	Properties p=new Properties();
	p.load(fis);
	 String value = p.getProperty(Key);
	 return value;
	 
	
	}
}
