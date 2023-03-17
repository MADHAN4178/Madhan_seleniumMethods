package com.selennium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\Day1_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		   
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
			driver.navigate().to("https://letcode.in/table");
		
		WebElement fullbody = driver.findElement(By.id("simpletable"));
		
		List<WebElement> headres = fullbody.findElements(By.tagName("tr"));	
		
		int size = headres.size();

       System.out.println(size);

       for (WebElement Head : headres) {
    	    String text = Head.getText();
		System.out.println(text);
	}
       
       List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr[3]/td"));
	for (WebElement webElement : findElements) {
		String text = webElement.getText();
		System.out.println(text);
	}
       List<WebElement> findElements2 = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td/input"));       
   for (WebElement webElement : findElements2) {
	
	   webElement.click();
}
	 
   
		/*
   driver.get("https://cosmocode.io/automation-practice-webtable/");
   
   List<WebElement> overll = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td/input"));

   
   for (WebElement madhn : overll) {

	madhn.click();

   }
int size = overll.size();
   System.out.println(size);
	
*/
}
     
	}
	

