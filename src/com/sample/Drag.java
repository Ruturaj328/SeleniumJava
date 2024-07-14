package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	    
		options.setCapability("goog:chromeOptions", "{debuggerAddress: localhost:53924}");

		WebDriver driver = new ChromeDriver(options);
		Actions actions = new Actions(driver);

	        // Launch the browser and open a website   
		
	        driver.navigate().to("https://demoqa.com/droppable/");
	        
	        driver.manage().window().maximize();

	        Actions laxmi = new Actions(driver);
	        
	     WebElement a=   driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	     
	    WebElement b= driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
	        
	        laxmi.dragAndDrop(a, b).perform();
	        
	        
	}

}
