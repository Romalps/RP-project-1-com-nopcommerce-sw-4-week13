package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CellPhonesPage extends Utility {

    By listViewTab = By.xpath("//a[normalize-space()='List']");

    // 2.4 Click on List View Tab
    public void clickOnListViewTab() {
        waitUntilVisibilityOfElementLocated(listViewTab, 20);
        clickOnElement(listViewTab);
    }

    /*By nokiaLumiaLink =  By.linkText("Nokia Lumia 1020");

    // 2.5 Click on product name “Nokia Lumia 1020” link
    public void clickOnProductNameNokiaLumiaLink() {
    waitUntilElementToBeClickable(nokiaLumiaLink,20);
    clickOnElement(nokiaLumiaLink);

    }*/
    By productNokiaLumiaLink= By.linkText("Nokia Lumia 1020");
    public void clickOnProductNameNokiaLumiaLink() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(productNokiaLumiaLink);

    }


}
