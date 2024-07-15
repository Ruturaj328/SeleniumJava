package com.sample;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class brokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	    
		options.setCapability("goog:chromeOptions", "{debuggerAddress: localhost:53924}");

		WebDriver driver = new ChromeDriver(options);
		Actions actions = new Actions(driver);

	        // Launch the browser and open a website   
		
	        driver.navigate().to("https://demoqa.com/links");
	        String url="";
	        List<WebElement> allURLs = driver.findElements(By.tagName("a"));
	        System.out.println("Total links on the Wb Page: " + allURLs.size());

	        //We will iterate through the list and will check the elements in the list.
	        Iterator<WebElement> iterator = allURLs.iterator();
	        while (iterator.hasNext()) {
	      	  url = iterator.next().getText();
	      	  System.out.println(url);
	        }
	     

	}

}
