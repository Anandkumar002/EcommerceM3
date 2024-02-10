package Genericlibriary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fileutility {
	public static String getproperty(String key)throws IOException{
		//step 1: get the java representation of physical file
		FileInputStream fis=new FileInputStream(FrameWorkConstants.PROPERTIESDATA_PATH);
    	//step:2 Create the object of properties class
		Properties pobj=new Properties();
		//step:3 Load all key and values to properties object
		pobj.load(fis);
		//step:4 get the value using key
		return pobj.getProperty(key);
	}
}
