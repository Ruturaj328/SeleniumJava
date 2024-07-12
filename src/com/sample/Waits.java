package com.sample;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	    
		options.setCapability("goog:chromeOptions", "{debuggerAddress: localhost:53924}");

		WebDriver driver = new ChromeDriver(options);
			

	        // Launch the browser and open a website   
		
	        driver.navigate().to("https://demoqa.com/alerts");
	        
	        driver.manage().window().maximize();
	        
	        
	        
	        driver.findElement(By.id("alertButton")).click();
	       
	       Alert a= driver.switchTo().alert();
	      
	       a.accept();
	       
	       driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
	       
	       Alert b = driver.switchTo().alert();
	      
	       
	       System.out.print(b.getText());
	       b.dismiss();
	        
	        driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		       
		       Alert c = driver.switchTo().alert();
		      
		       
		       
		       c.sendKeys("Laxmi");
		       
		       c.accept();
	       
	        

	}

}
