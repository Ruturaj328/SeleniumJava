package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	    
		options.setCapability("goog:chromeOptions", "{debuggerAddress: localhost:53924}");

		WebDriver driver = new ChromeDriver(options);
		Actions actions = new Actions(driver);

	        // Launch the browser and open a website   
		
	        driver.navigate().to("https://www.amazon.com/");
	        
	        WebElement a= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	        
	        actions.contextClick(a).perform();
	        
	        a.sendKeys("bag");
	        
	        WebElement b=driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
	        
	        actions.doubleClick(b).perform();
	        
	        

	}

}
