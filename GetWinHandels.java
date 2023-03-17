package com.selennium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetWinHandels {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nagaraj\\eclipse-workspace\\Day1_Selenium\\Driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();

		Actions act = new Actions(driver);
		
	

		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/");
		String oldwd = driver.getWindowHandle();

		WebElement Minitv = driver.findElement(By.xpath("(//a[@tabindex=\"0\"])[5]"));

		act.contextClick(Minitv).build().perform();

		Robot re = new Robot();
		re.keyPress(KeyEvent.VK_DOWN);
		re.keyRelease(KeyEvent.VK_DOWN);

		re.keyPress(KeyEvent.VK_ENTER);
		re.keyRelease(KeyEvent.VK_ENTER);

		WebElement computer = driver.findElement(By.xpath("(//a[@tabindex='0'])[17]"));
		act.contextClick(computer).build().perform();
		re.keyPress(KeyEvent.VK_DOWN);
		re.keyRelease(KeyEvent.VK_DOWN);

		re.keyPress(KeyEvent.VK_ENTER);
		re.keyRelease(KeyEvent.VK_ENTER);

		WebElement acc = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		// act.contextClick(acc).build().perform();
		act.moveToElement(acc);

		WebElement pro = driver
				.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[2]/a[1]"));
		act.contextClick(pro).build().perform();
		re.keyPress(KeyEvent.VK_DOWN);
		re.keyRelease(KeyEvent.VK_DOWN);

		re.keyPress(KeyEvent.VK_ENTER);
		re.keyRelease(KeyEvent.VK_ENTER);

		int windowsize = driver.getWindowHandles().size();

		System.out.println("Numbe of page opened :" + windowsize);

		Set<String> allwind = driver.getWindowHandles();
		


		Thread.sleep(2000);
		for (String allwindow : allwind) {
			String title = driver.switchTo().window(allwindow).getTitle();
			System.out.println();
			System.out.println(title);
			String currentUrl = driver.switchTo().window(allwindow).getCurrentUrl();
			System.out.println("" + currentUrl);
			Thread.sleep(2000);
		}

		String page2 = "Wish List";
		Thread.sleep(2000);
		for (String string : allwind) {
			if (driver.switchTo().window(string).getTitle().equals(page2)) {
				break;
			}
		}

		Thread.sleep(3000);

		String String = driver.switchTo().window(oldwd).getTitle();
		System.out.println("Code Run");
		System.out.println(String);

		driver.quit();

	}

}
