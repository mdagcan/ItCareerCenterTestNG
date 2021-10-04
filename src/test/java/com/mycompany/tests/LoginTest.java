package com.mycompany.tests;

import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @Test
    public void myLogin() throws InterruptedException {
        homePage.clickMyAccount()  // Standart code kismi, butun fonksiyonlardan once bu kisim gelecek
                .asLogin();
    }
    @Test
    public void ikinciTest() throws InterruptedException {
        homePage.clickMyAccount()  // Standart code kismi, butun fonksiyonlardan once bu kisim gelecek
                .yazLogin();
    }
    @Test
    public void ucuncuTest() throws InterruptedException {
        homePage.clickMyAccount()  // Standart code kismi, butun fonksiyonlardan once bu kisim gelecek
                .kolayTest();
    }
}
