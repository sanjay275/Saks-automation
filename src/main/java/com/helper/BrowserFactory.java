package com.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver launchBrowser(String browsername,String url)
    {
        if(browsername.equalsIgnoreCase("chrome"))
        {
            //System.setProperty("webdriver.chrome.driver","C:\\Users\\H895456\\Downloads\\ChromeDriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(url);
            driver.manage().window().maximize();

        }
        else if(browsername.equalsIgnoreCase( "IE"))
        {

        }
        return driver;
    }
}
