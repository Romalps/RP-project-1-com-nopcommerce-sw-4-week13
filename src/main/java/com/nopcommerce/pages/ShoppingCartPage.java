package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends Utility {

    By qtyLink = By.xpath("//input[@class='qty-input']");

    public void changeTheQtyTo2() {
        // 2.16 Change the Qty to "2"

        driver.findElement(qtyLink).clear();
        sendTextToElement(qtyLink, "2");
    }

    By updateShoppingCartLink = By.xpath("//button[@id='updatecart']");

    // Click on "Update shopping cart"
    public void updateTheShoppingCartAfterChangingQty() {

        clickOnElement(updateShoppingCartLink);
    }

    By termsOfServiceCheckboxLink = By.id("termsofservice");

    // 2.18 click on checkbox “I agree with the terms of service”
    public void clickTermsOfServiceCheckbox() {
        clickOnElement(termsOfServiceCheckboxLink);
    }

    By checkOutLink = By.xpath("//button[@id='checkout']");

    //2.19 Click on “CHECKOUT”
    public void clickOnCheckoutButton() {
        clickOnElement(checkOutLink);
    }

    By agreeTermsOfServiceCheckbox = By.xpath("//input[@id='termsofservice']");
    //2.15 click on checkbox “I agree with the terms of service”
    public void clickOnCheckboxIAgreeWithTheTermsOfService(){

        clickOnElement(agreeTermsOfServiceCheckbox);
    }
    By nokiaLumiaCheckoutButton= By.xpath("//button[@id='checkout']");
    //2.16 Click on “CHECKOUT”
    public void clickOnCheckoutButtonAfterAddingNokiaLumia(){

        clickOnElement(nokiaLumiaCheckoutButton);
    }
    By checkboxOnShoppingCartPage = By.xpath("//input[@id='termsofservice']");
    //2.25 click on checkbox “I agree with the terms of service”
    public void clickOnTermsOfServiceCheckboxOnShoppingCartPage() throws InterruptedException {
    Thread.sleep(2000);
        clickOnElement(checkboxOnShoppingCartPage);
    }
    By checkoutButtonOnShoppingCartPage = By.xpath("//button[@id='checkout']");
    //2.26 Click on “CHECKOUT”
    public void clickCheckoutOnShoppingCartPage(){

        clickOnElement(checkoutButtonOnShoppingCartPage);
    }



}
