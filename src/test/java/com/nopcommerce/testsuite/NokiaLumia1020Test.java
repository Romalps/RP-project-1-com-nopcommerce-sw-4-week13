package com.nopcommerce.testsuite;

import com.nopcommerce.pages.CellPhonesPage;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.NokiaLumia1020Page;
import com.nopcommerce.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NokiaLumia1020Test extends BaseTest {

    HomePage homePage = new HomePage();
    CellPhonesPage cellPhonesPage=new CellPhonesPage();
    NokiaLumia1020Page nokiaLumia1020Page =new NokiaLumia1020Page();

    @Test
    public void verifyThatTheProductAddedToSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        //2.1 Mouse Hover on “Electronics” Tab
        //2.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverOnElectronicsTab();
        //2.3 Verify the text “Cell phones”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Cell phones']")), "Cell phones");
        // 2.4 Click on List View Tab
        cellPhonesPage.clickOnListViewTab();

        // 2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonesPage.clickOnProductNameNokiaLumiaLink();
        //2.6 Verify the text “Nokia Lumia 1020”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Nokia Lumia 1020']")), "Nokia Lumia 1020");
        //2.7 Verify the price “$349.00”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[@id='price-value-20']")), "$349.00");
        //2.8 Change quantity to 2
        nokiaLumia1020Page.changeQuantityTo2();
        //2.9 Click on “ADD TO CART” tab
        nokiaLumia1020Page.clickAddToCartTab();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(getTextFromElement(By.xpath("//p[@class='content']")), "The product has been added to your shopping cart");
        // After that close the bar clicking on the cross button.
        nokiaLumia1020Page.afterThatCloseTheBarClickingOnTheCrossButton();
        // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumia1020Page.moseHoverOnShoppingCartAndClickOnGoToCartButton();




    }
}
