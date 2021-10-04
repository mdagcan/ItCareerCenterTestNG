package com.mycompany.tests;

import com.mycompany.pages.HomePage;
import com.mycompany.util.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    WebDriver driver;
    HomePage homePage;
    @BeforeMethod
    public void setUp() throws FileNotFoundException, IOException {
        Properties testConfig= 	new Properties();
        testConfig.load(new FileInputStream("TestConfig.properties"));
        driver= Browser.createDriver(testConfig.getProperty("browser"));
        driver.get(testConfig.getProperty("baseUrl"));
        homePage= new HomePage(driver);
    }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
