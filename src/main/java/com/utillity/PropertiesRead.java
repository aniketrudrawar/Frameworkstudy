package com.utillity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {
	
	Properties prop;
	public PropertiesRead()  {
		
		
		
		String path = "C:\\Users\\a123n\\eclipse-workspace\\newjava\\framework\\ConfigFiles\\config,properties";
	
	     prop = new Properties();
	    
		try {
		FileInputStream file = new FileInputStream(path);
	  
	    prop.load(file);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String  URL() {
		 String mailURL = prop.getProperty("url");
		 
		 return mailURL;
	}
	
	public String  username() {
		 String mailusername = prop.getProperty("username");
		 
		 return mailusername;
	}
	
	public String password() {
		 String mailpassword = prop.getProperty("password");
		 
		 return mailpassword;
	}
	
	public String browser() {
		 String mainbrowser = prop.getProperty("browser");
		 
		 return mainbrowser;
	}
	
	

}
