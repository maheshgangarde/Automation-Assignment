package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/controlgroup/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath(""));
		WebElement Rightclick= driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/a"));
		Actions ac=new Actions(driver);
		ac.contextClick(Rightclick).perform();
	
}
}
		