package com.selennium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sele_Actionss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagaraj\\eclipse-workspace\\Day1_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/droppable/");
		WebElement dragBox = driver.findElement(By.id("draggable"));
	    WebElement dropBox = driver.findElement(By.id("droppable"));
	
     	Actions act = new Actions(driver);
	   act.dragAndDrop(dragBox , dropBox).build().perform();
	
	}

}


