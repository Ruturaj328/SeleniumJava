package com.sample;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day1 {
    public static void main(String[] args) {
        // Set the correct path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
    
        WebDriver driver = new ChromeDriver();

        // Launch the browser and open a website
        driver.get("https://www.google.com");
        
        
        System.out.println(driver.getCurrentUrl());
        
        System.out.println(driver.getPageSource());
        

        // Perform actions on the webpage
        System.out.println("Page title is: " + driver.getTitle());
        driver.close();

        // Close the browser
        driver.quit();
    }
}
