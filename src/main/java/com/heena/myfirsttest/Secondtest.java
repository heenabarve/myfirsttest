package com.heena.myfirsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Secondtest {
public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91997\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://eliasnogueira.com/external/selenium-java-architecture/");
		Thread.sleep(2000);
		
		//enter email
		WebElement ID = driver.findElement(By.id("email"));
		ID.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		//ID.submit();
		
		//enter password
		WebElement Pass = driver.findElement(By.id("password"));
		Pass.sendKeys("abcd");
		Thread.sleep(2000);
		//Pass.submit();
		
		//select country
		WebElement Con = driver.findElement(By.name("country"));
		Select d1 = new Select (Con);
		d1.selectByIndex(1);
		Thread.sleep(2000);
		
		//select budget
		WebElement Price = driver.findElement(By.name("budget"));
		Select d2 = new Select(Price);
		d2.selectByIndex(2);
		Thread.sleep(2000);
		
		/*
		//check box is selected
		WebElement chkBx = driver.findElement(By.name("optionsCheckboxes"));
		  boolean flag2 = chkBx.isSelected();
		  System.out.println(flag2);
		  
		  Thread.sleep(2000);
		  
		  if(flag2)      //true
		  {
			System.out.println("checkbox is already selected");  
		  }
		  else  //false
		  {
			  System.out.println("select checkbox");
			  chkBx.click();
		
		  Thread.sleep(2000);
		  }
		  
		  */
			//click on next 
		WebElement btn = driver.findElement(By.xpath("//input[@name='next']"));
		btn.click();
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		//slect Room type
		WebElement Room = driver.findElement(By.name("job"));
		Room .click();
		
		driver.close();
	}
}

