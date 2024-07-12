package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	    
		options.setCapability("goog:chromeOptions", "{debuggerAddress: localhost:53924}");

		WebDriver driver = new ChromeDriver(options);
			

	        // Launch the browser and open a website   
		
	        driver.navigate().to("https://demoqa.com/automation-practice-form");
	        
	     // Create object of the Select class
	        Select se = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
	        			
	        // Select the option by index
	        se.selectByIndex(3);
	        se.selectByValue("NCR");
	        se.selectByVisibleText("UP");
	}

}
