package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    //    public By actualTextElement;
//    public String expectedMessage;
    By nameZToALink = By.id("products-orderby");
    By productNameListLink = By.className("product-item");

    // 1.3 Select Sort By position "Name: Z to A"
    public void selectSortByPositionNameZToA() {
        selectByVisibleTextFromDropDown(nameZToALink, "Name: Z to A");
        // Get all the product and store them in list
        List<WebElement> productList = driver.findElements(productNameListLink);
        List<String> productName = new ArrayList<>();

        for (WebElement product : productList) {

            productName.add(product.findElement(By.className("product-title")).getText());

        }
        // sort the product names in descending order
        List<String> sortedProductNameList = new ArrayList<>(productName);
        Collections.sort(sortedProductNameList, Collections.reverseOrder());


    }

    By nameAToZLink = By.id("products-orderby");


    //2.3 Select Sort By position "Name: A to Z"
    public void selectSortByPositionNameAToZ() {
        selectByVisibleTextFromDropDown(nameAToZLink, "Name: A to Z");
    }
        // 2.4 Select "Build your own computer" and  Click on "Add To Cart"
            By addToCartLink = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");
    public void clickOnAddToCArtButton(){
        try {
            WebElement addToCartButton = waitUntilVisibilityOfElementLocated(addToCartLink,10);
            addToCartButton.click();
        } catch (StaleElementReferenceException e) {
            // Try to locate the element again
            WebElement addToCartButton = waitUntilVisibilityOfElementLocated(addToCartLink,10);
            addToCartButton.click();
        }
    }




}
