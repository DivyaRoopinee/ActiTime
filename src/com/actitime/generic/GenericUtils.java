package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	public static void getScreenShot(WebDriver driver,String name)
	{
		
		try 
		{
			TakesScreenshot t=(TakesScreenshot) driver;
			File src=t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./screenshots/"+name+".png"));
		} 
		
		catch (IOException e) 
		{
			
		}
		
	}
	public static void selectByIndex(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public static void selectByValue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void deselectByIndex(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.deselectByIndex(index);
	}
	public static void deselectByValue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public static void deselectByVisibleText(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void deselectAll(WebElement element)
	{
		Select sel=new Select(element);
		sel.deselectAll();
	}
	public static void getAllSelectedOptions(WebElement element)
	{
		Select sel=new Select(element);
		sel.getAllSelectedOptions();
	}
	public static void getFirstSelectedOption(WebElement element)
	{
		Select sel=new Select(element);
		sel.getFirstSelectedOption();
	}
	public static void getOptions(WebElement element)
	{
		Select sel=new Select(element);
		sel.getOptions();
	}
	
	public static void isMultiple(WebElement element)
	{
		Select sel=new Select(element);
		sel.isMultiple();
	}
	
	
	
	
	
}
