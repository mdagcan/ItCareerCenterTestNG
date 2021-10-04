package com.mycompany.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }
    public void getTitle() {
        System.out.println(driver.getTitle());
    }
// =============================  PAGE FACTORY == Write Locatin strategies here on this page ================
    @FindBy(xpath = "//a[@title='My account']")
    WebElement myAccount;
    @FindBy(css = "input[id=username]")
    WebElement userName;
    @FindBy(id = "password")
    WebElement passWord;
    @FindBy(css = "input[value=forever]")
    WebElement remeberMe;
    @FindBy(name = "login")
    WebElement login;
}
