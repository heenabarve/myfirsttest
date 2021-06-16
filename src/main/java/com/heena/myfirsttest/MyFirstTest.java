package com.heena.myfirsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {
	
	public static void main(String args[]){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91997\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.com");
		WebElement text= driver.findElement(By.id("twotabsearchtextbox"));
		text.sendKeys("Mobiles");
		text.submit();
		System.out.println("Amazon ");
		
		
		driver.close();
	}

}
