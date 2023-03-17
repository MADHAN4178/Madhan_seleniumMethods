package com.selennium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sele_Drop_Down {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\nagaraj\\\\eclipse-workspace\\\\Day1_Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/select-menu");
/*		Actions Act = new Actions(driver);
		Robot re = new Robot();

		
		WebElement selextindex = driver.findElement(By.id("oldSelectMenu"));		
		Select sel1 = new Select(selextindex);
		sel1.selectByIndex(3);
		Thread.sleep(2000);
		sel1.selectByIndex(5);
	Thread.sleep(2000);
	sel1.selectByVisibleText("Yellow");
	
	Thread.sleep(2000);
	
	WebElement mult = driver.findElement(By.xpath("//*[@id=\'selectMenuContainer\']/div[7]/div/div/div"));
mult.click();
for(int i=0; i<=3; i++)
	{
	
		re.keyPress(KeyEvent.VK_DOWN);
		re.keyRelease(KeyEvent.VK_DOWN);
		re.keyPress(KeyEvent.VK_ENTER);
		re.keyPress(KeyEvent.VK_ENTER);
		
	}
Thread.sleep(2000);
	WebElement findElement = driver.findElement(By.name("cars"));
	Select mul4 = new Select(findElement);
	
for (int i = 0; i < 4; i++) {
mul4.selectByIndex(i);
	
}
Thread.sleep(2000);
*/
WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\'withOptGroup\']"));
Select sc = new Select(findElement2);
sc.selectByIndex(3);
	
	
	}

}
