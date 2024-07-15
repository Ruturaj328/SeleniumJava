package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	    
		options.setCapability("goog:chromeOptions", "{debuggerAddress: localhost:53924}");

		WebDriver driver = new ChromeDriver(options);
		Actions actions = new Actions(driver);

	        // Launch the browser and open a website   
		
	        driver.navigate().to("https://demoqa.com/text-box");
	     
	     // Enter the Full Name
	        WebElement fullName = driver.findElement(By.id("userName"));
	        fullName.sendKeys("Mr.Peter Haynes");
	        
	        //Enter the Email
	        WebElement email=driver.findElement(By.id("userEmail"));
	        email.sendKeys("PeterHaynes@toolsqa.com");
	        
	        // Enter the Current Address
	        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
	        currentAddress.sendKeys("43 School Lane London EC71 9GO");
	        
	        // Copy the Current Address
	        currentAddress.sendKeys(Keys.CONTROL);
	        currentAddress.sendKeys("A");
	        currentAddress.sendKeys(Keys.CONTROL);
	        currentAddress.sendKeys("C");
	        
	        //Press the TAB Key to Switch Focus to Permanent Address
	        currentAddress.sendKeys(Keys.TAB);
	        
	        //Paste the Address in the Permanent Address field
	        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
	        permanentAddress.sendKeys(Keys.CONTROL);
	       
	        permanentAddress.sendKeys("V");

	}

}
