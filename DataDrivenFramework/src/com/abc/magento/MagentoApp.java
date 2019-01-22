package com.abc.magento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoApp {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\acer\\eclipse-newjava\\DataDrivenFramework\\src\\com\\abc\\utilities\\data.properties ");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String un=p.getProperty("un");
		String pwd=p.getProperty("pwd");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys(un);;
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement( By.id("send2")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
		
		
		
		
		
    
	}

}
