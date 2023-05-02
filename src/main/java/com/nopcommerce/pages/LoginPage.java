package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By checkoutAsGuestLink = By.xpath("//button[normalize-space()='Checkout as Guest']");

    //2.21Click on “CHECKOUT AS GUEST” Tab
    public void clickOnCheckoutAsGuestTab() {

        clickOnElement(checkoutAsGuestLink);
    }

    By registerTabLink = By.xpath("//button[normalize-space()='Register']");

    //2.18 Click on “REGISTER” tab
    public void clickOnRegisterTab() {

        clickOnElement(registerTabLink);
    }
    By loginLink = By.xpath("//a[normalize-space()='Log in']");
    //Click On Login Link
    public void clickOnLoginLink(){

        clickOnElement(loginLink);
    }
    By emailField= By.xpath("//input[@id='Email']");
    // Enter Email field element and send element
    public void enterEmailField(){

        sendTextToElement(emailField,"prime890testing10@gmail.com");
    }

    By passwordField = By.xpath("//input[@id='Password']");
    // Enter Password field element and send element
    public void enterPasswordFiled(){

        sendTextToElement(passwordField,"PrimeTesting89");
    }
    By loginButtonLink= By.xpath("//button[normalize-space()='Log in']");
    // Click on login button link

    public void clickOnLoginButtonLink(){
        clickOnElement(loginButtonLink);
    }

}
