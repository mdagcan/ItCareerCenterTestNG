package com.mycompany.pages;

import org.openqa.selenium.WebDriver;

public class MethodPage extends BasePage{
    public MethodPage(WebDriver driver) {
        super(driver);
    }
    public MethodPage asLogin() throws InterruptedException {
        myAccount.click(); Thread.sleep(3000);
        userName.sendKeys("testuser1");
        passWord.sendKeys("SeleniumTestAccount1");
        remeberMe.click();
        login.click();
        return new MethodPage(driver);
    }
    public MethodPage yazLogin() throws InterruptedException {
        myAccount.click(); Thread.sleep(3000);
        userName.sendKeys("testuser1");
        passWord.sendKeys("SeleniumAccount1");
        remeberMe.click();
        login.click();
        return new MethodPage(driver);
    }
    public MethodPage kolayTest() throws InterruptedException {
        myAccount.click(); Thread.sleep(3000);
        userName.sendKeys("testuser1");
        passWord.sendKeys("SeleniumAccount1");
        remeberMe.click(); Thread.sleep(3000);
        login.click();	Thread.sleep(3000);
        return new MethodPage(driver);
    }
}
