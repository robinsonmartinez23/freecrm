package com.crm.qa.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    // WebDriver object
    private static WebDriver obj;
    // Constructor
    private Driver() {
    }

    public static WebDriver getDriver() {
        String browserName = ConfigReader.read("browser");
        if (obj == null) {
            switch (browserName.toLowerCase().trim()) {
                case "chrome":
                    System.out.println("Creating object...");
                    WebDriverManager.chromedriver().setup();
                    obj = new ChromeDriver();
                    break;
                case "firefox":
                    System.out.println("Creating object...");
                    WebDriverManager.firefoxdriver().setup();
                    obj = new FirefoxDriver();
                    break;
                case "edge":
                    System.out.println("Creating object...");
                    WebDriverManager.edgedriver().setup();
                    obj = new EdgeDriver();
                    break;
                default:
                    System.out.println(browserName+" Is an UNKNOWN BROWSER!!!");
                    obj = null;
            }
            return obj;
        } else {
            return obj;
        }

    }
    public static void closeBrowser() {
        if (obj != null) {
            obj.quit();
            obj = null;
        }
        System.out.println("Browser closed");
    }
}
