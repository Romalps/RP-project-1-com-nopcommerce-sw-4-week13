package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {


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
        // 2.30 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[normalize-space()='Credit Card']")), "Credit Card");
        //2.32 Verify “Shipping Method” is “Next Day Air”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[normalize-space()='Next Day Air']")), "Next Day Air");
        //2.33 Verify Total is “$2,950.00”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]")), "$2,950.00");
        // 2.34 Click on “CONFIRM”
        checkoutPage.clickOnConfirmButton();
        // 2.35 Verify the Text “Thank You”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Thank you']")), "Thank you");
        //2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(getTextFromElement(By.xpath("//strong[normalize-space()='Your order has been successfully processed!']")), "Your order has been successfully processed!");
        //2.37 Click on “CONTINUE”
        checkoutPage.clickOnContinueButtonAfterPlacingOrderSuccessfully();


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
        //2.12 Verify the message "Shopping cart"
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Shopping cart']")), "Shopping cart");
        //2.13 Verify the quantity is 2
       // Assert.assertEquals(getTextFromElement(By.xpath("(//tbody//td[@class='quantity']//input[@id='itemquantity11236']")), "2");
        //2.14 Verify the Total $698.00
        Assert.assertEquals(getTextFromElement(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]")), "$698.00");
        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnCheckboxIAgreeWithTheTermsOfService();
        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButtonAfterAddingNokiaLumia();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']")), "Welcome, Please Sign In!");
        //2.18 Click on “REGISTER” tab
        loginPage.clickOnRegisterTab();
        //2.20 Fill the mandatory fields
        registerPage.fillTheMandatoryFieldsForRegistration();
        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();
        //2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinueTabOnRegisterPage();
        //2.24 Verify the text “Shopping cart”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Shopping cart']")), "Shopping cart");
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
        //2.35 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[normalize-space()='Credit Card']")), "Credit Card");
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[normalize-space()='2nd Day Air']")), "2nd Day Air");

        //2.37 Verify Total is “$698.00”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]")), "$698.00");
        //2.38 Click on “CONFIRM”
        checkoutPage.clickOnConfirmAfterPaymentMethod();
        //2.39 Verify the Text “Thank You”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Thank you']")), "Thank you");
        //2.40 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(getTextFromElement(By.xpath("//strong[normalize-space()='Your order has been successfully processed!']")), "Your order has been successfully processed!");
        //2.41 Click on “CONTINUE”
        checkoutPage.clickContinueButtonAfterSuccessfulOrder();


    }
}
