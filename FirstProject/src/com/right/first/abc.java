package com.right.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();
       
     WebElement value = driver.findElement(By.name("q"));
     value.sendKeys("APJ Abdul Kalam");
     WebElement search = driver.findElement(By.name("btnK"));
     search.click();
     
   

     
       
      
	}

}
