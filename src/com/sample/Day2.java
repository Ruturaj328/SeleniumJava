package com.sample;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day2 {
    public static void main(String[] args) {
        // Set the correct path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
    
        WebDriver driver = new ChromeDriver();

        // Launch the browser and open a website   
        driver.navigate().to("https://www.google.com");
        
        driver.navigate().to("https://www.gmail.com");
        
        driver.navigate().back();
        
        driver.navigate().forward();
        
        driver.navigate().refresh();
        
       // driver.quit();
    }
}
