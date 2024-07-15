package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	    
		options.setCapability("goog:chromeOptions", "{debuggerAddress: localhost:53924}");

		WebDriver driver = new ChromeDriver(options);
		Actions actions = new Actions(driver);
		String expectedTooltip = "Mail";
	        // Launch the browser and open a website   
		
	        driver.navigate().to("https://demo.guru99.com/test/social-icon.html");
	        
	        WebElement a= driver.findElement(By.xpath("//*[@id=\"top-bar\"]/div/div/div[2]/div/a[1]/span"));
	        
	        String actualTooltip = a.getAttribute("Mail");
	        
	        //Assert the tooltip's value is as expected 		
	        System.out.println("Actual Title of Tool Tip"+actualTooltip);							
	        if(actualTooltip.equals(expectedTooltip)) {							
	            System.out.println("Test Case Passed");					
	        }		
	        driver.close();	
	        

	}

}
