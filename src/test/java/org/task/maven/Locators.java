package org.task.maven;

import org.baseclass.BaseClass;
import org.baseclass.LoginPage;

public class Locators extends BaseClass {
	
	
	public static void main(String[] args) {
		
		
		chromelaunch();
		urlLanuching("https://www.facebook.com/");
		impwait(10);
		
		
		LoginPage p=new LoginPage();
		
		sendKeys(p.getTxtuser(), "karthikm1718");
		sendKeys(p.getTxtpass(), "147896");
		click(p.getBtnlogin());
		driver.navigate().refresh();
		sendKeys(p.getTxtuser(), "mukesh1415");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
