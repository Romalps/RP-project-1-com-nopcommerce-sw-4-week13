package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BuildYourOwnComputerPage extends Utility {

    By processor = By.id("product_attribute_1");
    By ram8GB = By.id("product_attribute_2");
    By hDD400GBRadioButton = By.id("product_attribute_3_7");
    By oSVistaPremiumRadioButton = By.id("product_attribute_4_9");
    By softwareCheckboxesForMSOffice = By.id("product_attribute_5_10");
    By softwareCheckboxesForCommander = By.id("product_attribute_5_12");

    public void buildYourOwnComputer() {

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        selectByVisibleTextFromDropDown(processor, "2.2 GHz Intel Pentium Dual-Core E2200");

        // 2.7.Select "8GB [+$60.00]" using Select class.
        selectByVisibleTextFromDropDown(ram8GB, "8GB [+$60.00]");
        waitUntilVisibilityOfElementLocated(hDD400GBRadioButton, 10);
        // 2.8 Select HDD radio "400 GB [+$100.00]"
        clickOnElement(hDD400GBRadioButton);
        waitUntilVisibilityOfElementLocated(oSVistaPremiumRadioButton, 10);
        // 2.9 Select OS radio "Vista Premium [+$60.00]"
        clickOnElement(oSVistaPremiumRadioButton);
        waitUntilVisibilityOfElementLocated(softwareCheckboxesForMSOffice, 20);
        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
//        clickOnElement(softwareCheckboxesForMSOffice);
//        clickOnElement(softwareCheckboxesForMSOffice);
        clickOnElement(softwareCheckboxesForCommander);
    }

    By addToCartBtn = By.id("add-to-cart-button-1");

    // 2.12 Click on "ADD TO CARD" Button.
    public void clickOnAddToCartButton() {
        clickOnElement(addToCartBtn);
    }

    By crossButtonLink = By.xpath("//span[@title='Close']");

    // After that close the bar clicking on the cross button.
    public void closeTheBarClickingOnTheCrossButton() {
        clickOnElement(crossButtonLink);
    }

    By shoppingCart = By.xpath("//span[@class='cart-label']");
    By goToCartLink = By.xpath("//button[normalize-space()='Go to cart']");

    // 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void mouseHoverOnShoppingCartAndClickOnGoTOCartButton() {
        try {
            Actions actions = new Actions(driver);
            WebElement shoppingCartElement = waitUntilVisibilityOfElementLocated(shoppingCart, 10);
            actions.moveToElement(shoppingCartElement).perform();
            WebElement goToCartButton = waitUntilElementToBeClickable(goToCartLink, 10);
            goToCartButton.click();
        } catch (ElementNotInteractableException e) {
            // Handle the exception
        }

    }
}