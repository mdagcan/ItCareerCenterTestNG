package com.mycompany.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public MethodPage clickMyAccount() {
        return new MethodPage(driver);
    }
}
