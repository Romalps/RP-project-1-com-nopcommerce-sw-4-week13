package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {



By firstName= By.xpath("//input[@id='FirstName']");
By lastName = By.xpath("//input[@id='LastName']");
By email= By.xpath("//input[@id='Email']");
By password = By.xpath("//input[@id='Password']");
By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");

    //2.20 Fill the mandatory fields
    public void fillTheMandatoryFieldsForRegistration() {

        // Find First name field element and send element
        sendTextToElement(firstName, "Prime"+ getAlphaNumericString(4));
        // Find Last name field element and send element
        sendTextToElement(lastName, "Tester"+ getAlphaNumericString(4));
        // Find Email field element and send element
        sendTextToElement(email, "primetester"+getAlphaNumericString(4)+ "@gmail.com");
        // Find Password field element and send element
        sendTextToElement(password, "Prime54tester32");
        // Find Confirm Password field element and send element
        sendTextToElement(confirmPassword, "Prime54tester32");
    }
    By registerButton = By.xpath("//button[@id='register-button']");
    //2.21 Click on “REGISTER” Button
    public void clickOnRegisterButton(){

        clickOnElement(registerButton);
    }
    By continueTabOnRegisterPage = By.xpath("//a[normalize-space()='Continue']");
    //2.23 Click on “CONTINUE” tab
    public void clickOnContinueTabOnRegisterPage(){

        clickOnElement(continueTabOnRegisterPage);
    }


}
