package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	    
		options.setCapability("goog:chromeOptions", "{debuggerAddress: localhost:53924}");

		WebDriver driver = new ChromeDriver(options);
			

	        // Launch the browser and open a website   
	        driver.navigate().to("https://demoqa.com/automation-practice-form");
	        
	        driver.findElement(By.xpath("//div[@id='genterWrapper']//div[@class='col-md-9 col-sm-12']//div[1]")).click();
	        
	        driver.findElement(By.xpath("//div[@id='genterWrapper']//div[@class='col-md-9 col-sm-12']//div[1]")).isEnabled();
	        
	        driver.findElement(By.xpath("//div[@id='genterWrapper']//div[@class='col-md-9 col-sm-12']//div[1]")).isDisplayed();
	        
	        driver.findElement(By.xpath("//div[@id='genterWrapper']//div[@class='col-md-9 col-sm-12']//div[1]")).isSelected();
	}

}
