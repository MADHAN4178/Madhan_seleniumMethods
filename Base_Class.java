package com.selennium;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	
	public static void Browser_lunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nagaraj\\eclipse-workspace\\Day1_Selenium\\Driver1\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void navigateTo(String S) {
		driver.navigate().to(S);
	}

	public static void navigateback() {
		driver.navigate().back();
	}

	public static void navigatefrwd() {
		driver.navigate().forward();
	}

	public static void navigateRefr() {
		driver.navigate().refresh();
	}

	public static void getUrl(String a) {
		driver.get(a);
	}

	public static void Maximize() {
		driver.manage().window().maximize();
	}

	public static void Alertaccept() {
		driver.switchTo().alert().accept();
	}

	public static void AlertDismis() {
		driver.switchTo().alert().dismiss();
	}

	public static void AlertSendkey(String S) {
		driver.switchTo().alert().sendKeys(S);
	}

	public static void actionscontet() {
		Actions act = new Actions(driver);
		act.contextClick();
	}

	public static void Robot(WebElement Re) throws AWTException {
		Robot re = new Robot();
	}

	public static void Frames(WebElement F) {
		driver.switchTo().frame(F);
	}

	public static void windowhandling(WebElement win) {
		String windowHandle = driver.getWindowHandle();
		windowHandle.equals(win);
	}

	public static void Dropdown(WebElement AB, WebElement cd) {
		Actions dp1 = new Actions(driver);
		dp1.dragAndDrop(AB, cd);
	}

	public static void Check_box(WebElement c, String Xpa) {
		c.findElement(By.xpath(Xpa));
	}

	public static void Isenable(WebElement A) {
		boolean selected = A.isSelected();
		System.out.println(selected);
	}

	public static void Isdisplayed(WebElement dis) {
		boolean selected = dis.isSelected();
		System.out.println(selected);
	}

	public static void Isselected(WebElement sele) {
		boolean selected = sele.isSelected();
		System.out.println(selected);
	}

	public static void Getoptions(WebElement gto) {
	}

	public static void Gettitle(WebElement w) {
		w.getText();
	}

	public static void Getcurrenturl() {
		driver.getCurrentUrl();
	}

	public static void getText(WebElement text) {
		String text2 = text.getText();
	System.out.println(text2);
	}

	public static void Getattribute(WebElement attr, String Get) {
		attr.getAttribute(Get);
	}

	public static void waitimplicit() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void Scrollupanddown(String expa)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", expa);
	}

	public static void SendKeys(WebElement wb, String S) {
		wb.sendKeys(S);
	}

	public static void Getfirstselectedoptions(WebElement gt, String s) {
		Select sele = new Select(gt);
		WebElement firstSelectedOption = sele.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
	}

	public static void Getallselectedoptions(WebElement L, String K) {
		Select sele = new Select(L);
		List<WebElement> allSelectedOptions = sele.getAllSelectedOptions();
		System.out.println(allSelectedOptions);
	}
	}


