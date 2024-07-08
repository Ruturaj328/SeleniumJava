package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	    
        WebDriver driver = new ChromeDriver();

        // Launch the browser and open a website   
        driver.navigate().to("https://www.google.com");
        
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("abc");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).getSize());
        
        
       
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).clear();
        
        driver.get("https://www.toolsqa.com/selenium-training/");
        
        //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/a")).click();
       
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/a")).isDisplayed());
        
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/a")).isEnabled());
        
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/a")).isSelected());
        
        
        
        
	}

}
