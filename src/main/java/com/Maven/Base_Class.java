package com.Maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;

	// browser Launch
	public static WebDriver browserLaunch(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Folder\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (browsername.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Folder\\firefoxdriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}
		return driver;
	}

	// close
	public static void closeBrowser() {
		driver.close();
	}

	// quit
	public static void quitTheWindow() {
		driver.quit();
	}

	// navigateTo
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	// navigateBack
	public static void navigateBack() {
		driver.navigate().back();
	}

	// navigate forward
	public static void navigateForward() {
		driver.navigate().forward();
	}

	// navigate refresh
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	// Get
	public static void getUrl(String url) {
		driver.get(url);
	}

	// Alert
	private static void alertSimple() {
		Alert s = driver.switchTo().alert();
		s.accept();
	}

	private static void alertComplex() {
		Alert s1 = driver.switchTo().alert();
		s1.dismiss();
	}

	// Actions
	// Frames
	// Robot
	private static void robot() throws Throwable {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	// Window Handles
	// Dropdown
	// Checkbox
	// is enable
	// is displayed
	// is selsected

	// get title
	private static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// get current url
	private static void currentUrl() {
		String current = driver.getCurrentUrl();
		System.out.println(current);
	}

// get text

	// wait
	// take screenshot
	private static void screenshot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(location);
		FileHandler.copy(src, dest);
	}

	// scroll up and down
	// sendkeys
	public static void input(WebElement element, String input) {
		element.sendKeys(input);
	}

	// Get first selected options
	// get all selected options
	// is multiple
	// click
	public static void clickIt(WebElement element) {
		element.click();
	}

	// radiobutton
	// Select by index
	public static void index(WebElement element, int index) {
		Select s1 = new Select(element);
		s1.selectByIndex(index);
	}

	// Select by value
	public static void value(WebElement element, String Value) {
		Select s1 = new Select(element);
		s1.selectByValue(Value);
	}

	// select by visible text
	public static void visibletext(WebElement element, String text) {
		Select s1 = new Select(element);
		s1.selectByVisibleText(text);
	}

}
