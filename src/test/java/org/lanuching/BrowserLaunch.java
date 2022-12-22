package org.lanuching;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		chromelaunch();
		impwait(10);
		urlLanuching("https://www.facebook.com/");
		getTitle();
		currentUrl();
		System.out.println(getTitle());
		System.out.println(currentUrl());
		takesScreenShot("facebook");
     	System.out.println("karthik");
     	System.out.println("Request task");
     	System.out.println("completed");
	
	
	
	}
	
	

}
