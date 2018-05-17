package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Lib {

public static String Printtitle(WebDriver driver)	{
	String value=driver.getTitle();
	return value;
}
	
public static WebElement findelement(WebDriver driver, String xpath)	{
WebElement webelem=driver.findElement(By.xpath(xpath))	;
return webelem;
}
	
public static String readproperties(String key ) throws IOException	{
	File fl=new File("/Users/gazifarhana/eclipse-workspace1/CityBank/src/test/resources/ObjectRepository/Locator.Properties");
	FileInputStream fis=new FileInputStream(fl);
	Properties prop=new Properties();
	prop.load(fis);
	String locator=prop.getProperty(key);
	return locator;
}
	

	
	
}
