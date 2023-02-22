package com.cpagemini.api.MavenDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class MainClass {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C://Maven/chromedriver.exe");
			WebDriver db=new ChromeDriver();
			db.manage().window().maximize();
			db.get("https:\\www.google.com");
			Thread.sleep(4000);
			String title=db.getTitle();
			if(title.equals("Google"))
				System.out.println("Test Passed");
			else
				System.out.println("Test Failed");
			db.quit();
		}
		catch (Exception e){
			e.printStackTrace();
		}

	}

}
