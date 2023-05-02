package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {

    By firstNameField = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastNameField = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryField = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityField = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1Field = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postcodeField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumberField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");


    // 2.22 Fill the all mandatory field
    public void fillAllMandatoryFieldInBillingAddressForm() {

        // Find the First name field element and send firstname element
        sendTextToElement(firstNameField, "Prime543" + getAlphaNumericString(4));
        // Find the Last name field element and send last name element
        sendTextToElement(lastNameField, "Tester" + getAlphaNumericString(4));
        //Find Email field element and send email element
        sendTextToElement(emailField, "prime" + getAlphaNumericString(4) + "@gmail.com");
        // Select the country from country field element
        selectByVisibleTextFromDropDown(countryField, "United Kingdom");
        // Find City field element and send city element
        sendTextToElement(cityField, "London");
        //Find address1 field element and send address1 element
        sendTextToElement(address1Field, "123,High Road");
        //Find postcode field element and send postcode element
        sendTextToElement(postcodeField, "HA5 7AL");
        //Find phone number field element and send phone number element
        sendTextToElement(phoneNumberField, "07412589000");
    }

    By continueBtnLink = By.xpath("//button[@onclick='Billing.save()']");

    // 2.23 Click on “CONTINUE”
    public void ClickOnContinueButtonAfterFillingTheForm() {

        clickOnElement(continueBtnLink);
    }

    By radioBtnNextDayAirLink = By.id("shippingoption_1");

    // 2.24 Click on Radio Button “Next Day Air($0.00)”
    public void clickOnRadioBtnForNextDayAir() {

        clickOnElement(radioBtnNextDayAirLink);
    }

    By continueButtonLink = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    // 2.25 Click on “CONTINUE”
    public void clickOnContinueButtonAfterClickingTheNextDayAirRadioButton() {
        clickOnElement(continueButtonLink);
    }

    By creditCardRadioButton = By.xpath("//input[@id='paymentmethod_1']");

    //2.26 Select Radio Button “Credit Card
    public void selectRadioButtonForCreditCard() {

        clickOnElement(creditCardRadioButton);
    }

    By continueBtnAfterCreditCard = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    // click on continue button
    public void clickOnContinueButtonAfterSelectingCreditCard() {

        clickOnElement(continueBtnAfterCreditCard);
    }

    By masterCardFromDropdownLink = By.xpath("//select[@id='CreditCardType']");

    // 2.27 Select “Master card” From Select credit card dropdown
    public void selectMasterCardFromCreditCardDropdown() {

        selectByVisibleTextFromDropDown(masterCardFromDropdownLink, "Master card");
    }

    By cardHolderNameField = By.xpath("//input[@id='CardholderName']");
    By cardNumberFiled = By.xpath("//input[@id='CardNumber']");
    By expirationDateField = By.xpath("//select[@id='ExpireMonth']");
    By expirationYearField = By.xpath("//select[@id='ExpireYear']");
    By cardCodeField = By.xpath("//input[@id='CardCode']");

    // 2.28 Fill all the details
    public void fillAllPaymentDetails() {
        // Find cardholder name field element and send element
        sendTextToElement(cardHolderNameField, "Prime543");

        // Find card number field element and send element
        sendTextToElement(cardNumberFiled, "5105105105105100");

        // Find Expiration date field element and send element
        selectByVisibleTextFromDropDown(expirationDateField, "10");

        selectByVisibleTextFromDropDown(expirationYearField, "2028");

        //  Find Card code field element and send element
        sendTextToElement(cardCodeField, "456");
    }

    By continueAfterPaymentCardDetails = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    // 2.29 Click on “CONTINUE”
    public void clickOnContinueAfterPaymentCardDetails() {

        clickOnElement(continueAfterPaymentCardDetails);
    }

    By confirmButtonLink = By.xpath("//button[normalize-space()='Confirm']");

    // 2.34 Click on “CONFIRM”
    public void clickOnConfirmButton() {

        clickOnElement(confirmButtonLink);
    }

    By continueButtonAfterPlacingOrder = By.xpath("//button[normalize-space()='Continue']");

    //2.37 Click on “CONTINUE”
    public void clickOnContinueButtonAfterPlacingOrderSuccessfully() {
        waitUntilVisibilityOfElementLocated(continueButtonAfterPlacingOrder, 10);
        clickOnElement(continueButtonAfterPlacingOrder);
    }

    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postcode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");

    //2.27 Fill the Mandatory fields
    public void fillTheMandatoryFieldsOnCheckoutPage() {

        // Find Country field element and select element
        selectByVisibleTextFromDropDown(country, "India");
        // Find City field element and send element
        sendTextToElement(city, "Mumbai");
        // Find Address1 field element and send element
        sendTextToElement(address1, "45,Joohu Lane");
        // Find Postcode field element and send element
        sendTextToElement(postcode, "385698");
        // Find Phone Number field element and send element
        sendTextToElement(phoneNumber, "0981385698");
    }

    By continueButtonOnCheckout = By.xpath("//button[@onclick='Billing.save()']");

    //2.28 Click on “CONTINUE”
    public void clickOnContinueOnCheckoutPage() {

        clickOnElement(continueButtonOnCheckout);
    }

    By radioButton2ndDayAir = By.xpath("//input[@id='shippingoption_2']");

    //2.29 Click on Radio Button “2nd Day Air ($0.00)”
    public void clickOnRadioButton2ndDayAir() {

        clickOnElement(radioButton2ndDayAir);
    }

    By continueBtnOnCheckout = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    //2.30 Click on “CONTINUE”
    public void clickOnContinueButtonOnCheckoutPage() {

        clickOnElement(continueBtnOnCheckout);
    }

    By radioButtonOnCreditCard = By.xpath("//input[@id='paymentmethod_1']");

    //2.31 Select Radio Button “Credit Card”
    public void selectRadioButtonOnCreditCard() {

        clickOnElement(radioButtonOnCreditCard);
    }

    By continueBtnOnCreditCard = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    // Click on continue button
    public void clickOnContinueOnCreditCard() {

        clickOnElement(continueBtnOnCreditCard);
    }

    By visaCreditCard = By.xpath("//select[@id='CreditCardType']");

    //2.32 Select “Visa” From Select credit card dropdown
    public void selectVisaFromCreditCardDropdown() {

        selectByVisibleTextFromDropDown(visaCreditCard, "Visa");
    }

    By cardHolderName= By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expirationMonth = By.xpath("//select[@id='ExpireMonth']");
    By expirationYear = By.xpath("//select[@id='ExpireYear']");
    By cardCodeNumber= By.xpath("//input[@id='CardCode']");
    //2.33 Fill all the details
    public void fillAllTheDetailsInCreditCard() {

        // Find Cardholder name field element and send element
        sendTextToElement(cardHolderName, "Prime");
        // Find Card Number field element and send element
        sendTextToElement(cardNumber, "5555555555554444");
        // Find Expiration date field element and select element
        selectByValueFromDropDown(expirationMonth, "10");
        selectByValueFromDropDown(expirationYear, "2027");
        // Find Card code number name field element and send element
        sendTextToElement(cardCodeNumber, "789");
    }
    By continueAfterCreditCardDetail =By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    //2.34 Click on “CONTINUE”
    public void clickOnContinueAfterCreditCardDetails(){

        clickOnElement(continueAfterCreditCardDetail);
    }
By confirmLink = By.xpath("//button[normalize-space()='Confirm']");
    //2.38 Click on “CONFIRM”
    public void clickOnConfirmAfterPaymentMethod(){

        clickOnElement(confirmLink);
    }
    By continueAfterSuccessful = By.xpath("//button[normalize-space()='Continue']");
    //2.41 Click on “CONTINUE”
    public void clickContinueButtonAfterSuccessfulOrder(){

        clickOnElement(continueAfterSuccessful);
    }



}
