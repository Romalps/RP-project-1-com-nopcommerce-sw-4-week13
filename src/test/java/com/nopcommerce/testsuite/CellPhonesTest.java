package com.nopcommerce.testsuite;

import com.nopcommerce.pages.CellPhonesPage;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CellPhonesTest extends BaseTest {

    HomePage homePage = new HomePage();
    CellPhonesPage cellPhonesPage=new CellPhonesPage();
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        //1.1 Mouse Hover on “Electronics” Tab
        //1.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverOnElectronicsTab();
        //1.3 Verify the text “Cell phones”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Cell phones']")), "Cell phones");

    }

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


    }
}
