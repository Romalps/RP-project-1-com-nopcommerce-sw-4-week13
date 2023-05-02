package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumia1020Page extends Utility {

    By qty = By.xpath("//input[@id='product_enteredQuantity_20']");

    //2.8 Change quantity to 2
    public void changeQuantityTo2() {

        driver.findElement(qty).clear();
        sendTextToElement(qty, "2");
    }

    By addToCartTab = By.xpath("//button[@id='add-to-cart-button-20']");

    //2.9 Click on “ADD TO CART” tab
    public void clickAddToCartTab() {

        clickOnElement(addToCartTab);
    }

    By crossButton = By.xpath("//span[@title='Close']");

    // After that close the bar clicking on the cross button.
    public void afterThatCloseTheBarClickingOnTheCrossButton() {

        clickOnElement(crossButton);
    }

    By shoppingCartButton = By.xpath("//span[@class='cart-label']");
    By goToCartButton = By.xpath("//button[normalize-space()='Go to cart']");

    // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void moseHoverOnShoppingCartAndClickOnGoToCartButton() throws InterruptedException {
//        waitUntilVisibilityOfElementLocated(shoppingCartButton, 20);
//        mouseHoverToElementAndClick(shoppingCartButton);
//        mouseHoverToElementAndClick(goToCartButton);
        Thread.sleep(3000);
         actionsMethodForMouseHover(shoppingCartButton, goToCartButton);
    }


}
