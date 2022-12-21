package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver chromelaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static void urlLanuching(String url) {
		driver.get(url);

	}

	public static void impwait(int SECONDS) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}

	public static String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void sendKeys(WebElement k, String text) {
		k.sendKeys(text);

	}

	public static void quit() {
		driver.quit();

	}

	public static void click(WebElement k) {
		k.click();

	}

	public static String getText(WebElement p) {
		String text = p.getText();
		return text;

	}

	public static String getAttribute(WebElement p) {
		String value = p.getAttribute("value");
		return value;

	}

	public static String getInnerText(WebElement p) {
		String inner = p.getAttribute("innerText");
		return inner;

	}

	public static WebDriver actionsMove(WebElement from) {
		Actions k = new Actions(driver);
		k.moveToElement(from).perform();
		return driver;

	}

	public static WebDriver actionsDropDown(WebElement from, WebElement to) {
		Actions k = new Actions(driver);
		k.dragAndDrop(from, to).perform();
		return driver;
	}

	public static void simpleAlert() {

		Alert pot = driver.switchTo().alert();
		pot.accept();

	}

	public static void confrimAlert() {
		Alert pot = driver.switchTo().alert();
		pot.dismiss();

	}

	public static WebDriver promptAlert(String text) {
		Alert pot = driver.switchTo().alert();
		pot.sendKeys(text);
		pot.accept();
		return driver;

	}

	public static void selectByIndex(WebElement web, int index) {
		Select s = new Select(web);
		s.selectByIndex(index);

	}

	public static void selectByValue(WebElement web, String text) {
		Select s = new Select(web);
		s.selectByValue(text);

	}

	public static void selectByVisibleText(WebElement web, String text) {
		Select s = new Select(web);
		s.selectByVisibleText(text);

	}

	public static void getOptionsByindex(WebElement web, int index) {
		Select s = new Select(web);
		List<WebElement> options = s.getOptions();
		options.get(index);

	}

	public static void getOptionsByValue(WebElement web, String text) {
		Select s = new Select(web);
		List<WebElement> options = s.getOptions();

		for (WebElement x : options) {
			x.getText();

		}

	}

	public static void getOptionsByText(WebElement web, String text) {
		Select s = new Select(web);
		List<WebElement> options = s.getOptions();

		for (WebElement x : options) {
			x.getText();

		}

	}
	public static void getAllSelectedOptions(WebElement web, String text) {
		Select s = new Select(web);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		

		for (WebElement x : allSelectedOptions) {
			x.getText();

	}
		}
	public static void getFirstSelectedOptions(WebElement web, String text) {
		Select s = new Select(web);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		firstSelectedOption.getText();
		
		
	}
	public static void isMultiple(WebElement web) {
	
		Select s = new Select(web);
		boolean multiple = s.isMultiple();
	
	}
	public static void deselectByIndex(WebElement web, int index) {
		Select s = new Select(web);
		s.deselectByIndex(index);

	}
	public static void deselectByValue(WebElement web,String text) {
		Select s = new Select(web);
		s.deselectByValue(text);
	}
	public static void deselectByVisibleText(WebElement web, String text) {
		Select s = new Select(web);
		s.deselectByVisibleText(text);
	}
	public static void deselectAll(WebElement web) {
		Select s = new Select(web);
		s.deselectAll();
		
	}
	public static void takesScreenShot(String k) throws IOException {
		TakesScreenshot screen=(TakesScreenshot) driver;
		File From = screen.getScreenshotAs(OutputType.FILE);
		File to =new File("D:\\karthik java\\BrowserLanuching\\Sceern\\"+k+".png");
		FileUtils.copyFile(From, to);	
	
	}
	public static void javascriptExcutorClick(WebElement web) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", web);
	}
	public static void javascriptExecutorSetter(WebElement web,String text) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','text')", web);

	}
	public static WebDriver javascriptExecutorgetter(WebElement web) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("return arguments[0].getAttribute('value')", web);
return driver;
	}
	
	
	public static void javascriptExecutorScrollDown(WebElement web) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0],scrollIntoView(true)", web);
		
	}
	public static void javascriptExecutorScrollup(WebElement web) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0],scrollIntoView(flase)", web);
		
	}






























}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
