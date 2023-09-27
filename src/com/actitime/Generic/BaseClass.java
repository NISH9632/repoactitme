package com.actitime.Generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.Pom.EnterTimeTrackPage;
import com.actitime.Pom.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		Reporter.log("open Browser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		driver.get(url);
		
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pwd);
	
		
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setLogout();
		
		
	}
	
@AfterTest
 public void closeBrowser() {
	Reporter.log("closeBrowser",true);
	driver.close();
	
}
}
