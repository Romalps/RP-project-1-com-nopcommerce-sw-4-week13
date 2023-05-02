package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    RegisterPage registerPage = new RegisterPage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumia1020Page nokiaLumia1020Page = new NokiaLumia1020Page();

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() {
        // 2.1 Click on Computer Menu.
        homePage.selectMenu("Computers");
        homePage.clickOnComputerMenu();
        //2.2 Click on Desktop
        homePage.clickOnDesktopFromComputerMenuTab();
        // 2.3 Select Sort By position "Name: A to Z" and
        desktopPage.selectSortByPositionNameAToZ();
        //  2.4 Click on "Add To Cart"
        desktopPage.clickOnAddToCArtButton();
        buildYourOwnComputerPage.buildYourOwnComputer();

        // 2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputerPage.clickOnAddToCartButton();

        // After that close the bar clicking on the cross button.
        buildYourOwnComputerPage.closeTheBarClickingOnTheCrossButton();
        // 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputerPage.mouseHoverOnShoppingCartAndClickOnGoTOCartButton();
        // 2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeTheQtyTo2();
        shoppingCartPage.updateTheShoppingCartAfterChangingQty();

        // 2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickTermsOfServiceCheckbox();
        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButton();
        //2.21Click on “CHECKOUT AS GUEST” Tab
        loginPage.clickOnCheckoutAsGuestTab();
        // 2.22 Fill the all mandatory field
        checkoutPage.fillAllMandatoryFieldInBillingAddressForm();
        // 2.23 Click on “CONTINUE”
        checkoutPage.ClickOnContinueButtonAfterFillingTheForm();
        // 2.24 Click on Radio Button “Next Day Air($0.00)”
        checkoutPage.clickOnRadioBtnForNextDayAir();
        // 2.25 Click on “CONTINUE”
        checkoutPage.clickOnContinueButtonAfterClickingTheNextDayAirRadioButton();
        // 2.26 Select Radio Button “Credit Card”
        checkoutPage.selectRadioButtonForCreditCard();
        //2.27 Select “Master card” From Select credit card dropdown
        checkoutPage.clickOnContinueButtonAfterSelectingCreditCard();
        checkoutPage.selectMasterCardFromCreditCardDropdown();
        //2.28 Fill all the details
        checkoutPage.fillAllPaymentDetails();
        //2.29 Click on “CONTINUE”
        checkoutPage.clickOnContinueAfterPaymentCardDetails();
        // 2.34 Click on “CONFIRM”
        checkoutPage.clickOnConfirmButton();
        //2.37 Click on “CONTINUE”
        checkoutPage.clickOnContinueButtonAfterPlacingOrderSuccessfully();
        //2.37 Verify the text “Welcome to our store”
        Assert.assertEquals(getTextFromElement(By.xpath("//h2[normalize-space()='Welcome to our store']")), "Welcome to our store");

    }

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        //1.1 Mouse Hover on “Electronics” Tab
        //1.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverOnElectronicsTab();

    }

    @Test
    public void verifyThatTheProductAddedToSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        //2.1 Mouse Hover on “Electronics” Tab
        //2.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverOnElectronicsTab();
        // 2.4 Click on List View Tab
        cellPhonesPage.clickOnListViewTab();

        // 2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonesPage.clickOnProductNameNokiaLumiaLink();
        //2.8 Change quantity to 2
        nokiaLumia1020Page.changeQuantityTo2();
        //2.9 Click on “ADD TO CART” tab
        nokiaLumia1020Page.clickAddToCartTab();
        // After that close the bar clicking on the cross button.
        nokiaLumia1020Page.afterThatCloseTheBarClickingOnTheCrossButton();
        // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumia1020Page.moseHoverOnShoppingCartAndClickOnGoToCartButton();
        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnCheckboxIAgreeWithTheTermsOfService();
        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButtonAfterAddingNokiaLumia();
        //2.18 Click on “REGISTER” tab
        loginPage.clickOnRegisterTab();
        //2.20 Fill the mandatory fields
        registerPage.fillTheMandatoryFieldsForRegistration();
        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();
        //2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinueTabOnRegisterPage();
        loginPage.clickOnLoginLink();
        loginPage.enterEmailField();
        loginPage.enterPasswordFiled();
        loginPage.clickOnLoginButtonLink();
        //2.25 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsOfServiceCheckboxOnShoppingCartPage();
        //2.26 Click on “CHECKOUT”
        shoppingCartPage.clickCheckoutOnShoppingCartPage();
        //2.27 Fill the Mandatory fields
        checkoutPage.fillTheMandatoryFieldsOnCheckoutPage();
        //2.28 Click on “CONTINUE”
        checkoutPage.clickOnContinueOnCheckoutPage();
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkoutPage.clickOnRadioButton2ndDayAir();
        //2.30 Click on “CONTINUE”
        checkoutPage.clickOnContinueButtonOnCheckoutPage();
        //2.31 Select Radio Button “Credit Card”
        checkoutPage.selectRadioButtonOnCreditCard();
        // Click on continue button
        checkoutPage.clickOnContinueOnCreditCard();
        //2.32 Select “Visa” From Select credit card dropdown
        checkoutPage.selectVisaFromCreditCardDropdown();
        //2.33 Fill all the details
        checkoutPage.fillAllTheDetailsInCreditCard();
        //2.34 Click on “CONTINUE”
        checkoutPage.clickOnContinueAfterCreditCardDetails();
        //2.38 Click on “CONFIRM”
        checkoutPage.clickOnConfirmAfterPaymentMethod();
        //2.41 Click on “CONTINUE”
        checkoutPage.clickContinueButtonAfterSuccessfulOrder();
        //2.42 Verify the text “Welcome to our store”
        Assert.assertEquals(getTextFromElement(By.xpath("//h2[normalize-space()='Welcome to our store']")), "Welcome to our store");
        //2.43 Click on “Logout” link
        homePage.clickOnLogoutLink();
        //2.44 Verify the URL is “https://demo.nopcommerce.com/
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://demo.nopcommerce.com/");


    }
}
