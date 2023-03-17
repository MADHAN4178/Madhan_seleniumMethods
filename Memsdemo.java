package com.selennium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Memsdemo {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nagaraj\\eclipse-workspace\\Day1_Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		Robot rc = new Robot();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		{
		driver.get("http://memsdevops.com/#/account/login?returnUrl=%2F");

		Actions act = new Actions(driver);

		WebElement usernamer = driver.findElement(By.id("username"));

		usernamer.sendKeys("admin");

		WebElement pass = driver.findElement(By.id("password"));

		pass.sendKeys("OmS$@nDb0xAh$");

		WebElement domain = driver.findElement(By.xpath("//input[@type='text']"));
		domain.clear();
		domain.sendKeys("demov1");

		WebElement button = driver.findElement(By.xpath("(//button[@type='submit'])[5]"));

		button.click();
		Thread.sleep(2000);
		
		WebElement findElement2 = driver.findElement(By.xpath("(//input[@role='combobox'])[1]"));
        findElement2.sendKeys("Test done");
		
		WebElement textarea = driver.findElement(By.name("RRNos"));
		textarea.sendKeys("hi");
        Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.id("ngb-tab-1"));
		findElement.click();
		WebElement text1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		text1.sendKeys("text 1 added");
		WebElement expa = driver.findElement(By.xpath("(//input[@placeholder=\"MM/DD/YYYY\"])[2]"));

		expa.sendKeys("09/05/2023");
		js.executeScript("arguments[0].scrollIntoView(true);",expa);
		
		WebElement findElement3 = driver.findElement(By.partialLinkText("Repair Requests "));
	   act.moveToElement(findElement3);
	 	
	}
    }
}
