package com.marasini.cucumberautomation.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;


public class Base {
	public static Logger logger=LogManager.getLogger(Base.class.getName());
	public static WebDriver driver;
	public Properties prop;
	
	
	public void setPropertyFile() throws IOException {
		prop = new Properties();
		FileInputStream fData = new FileInputStream("C:\\Users\\subas\\eclipse-workspace\\CucumberUdemy\\src\\test\\resources\\data\\data.properties");
		prop.load(fData);
	}


	public WebDriver initDriver() throws IOException {
		
		setPropertyFile();
		logger.info("Property file is set.");
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			logger.info("Chrome driver is set.");
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			logger.info("Gecko driver is set.");
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			logger.info("IE driver is set.");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		logger.info("Implicit wait time of 10 seconds is set.");
		return driver;

	}
	
	public static void takeScreenshot(String result) throws IOException {
	/*	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\E2EProject\\screenshots\\"+result+"-screenshot.png"));
		logger.info(result+"Screenshot saved.");  */
	}
}
