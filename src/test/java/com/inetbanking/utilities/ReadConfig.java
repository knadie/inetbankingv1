package com.inetbanking.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig
{
	Properties pro;
	
	public ReadConfig() 
	{
		try 
		{
		File aaa=new File("./Configuration/config.properties");
		pro= new Properties();
		FileInputStream fis=new FileInputStream(aaa);
		pro.load(fis);
		}
		catch(Exception e)
		{
			
		}
	}
	
	public String getURL()
	{
		String url=pro.getProperty("Baseurl");
		return url;
		
	}
	public String getUsername() 
	{
		String username=pro.getProperty("username");
		return username;
	}
	public String getPassword() 
	{
		String password=pro.getProperty("password");
		return password;
		
	}
	/*public String getchromepath() 
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
		
	}*/
}
