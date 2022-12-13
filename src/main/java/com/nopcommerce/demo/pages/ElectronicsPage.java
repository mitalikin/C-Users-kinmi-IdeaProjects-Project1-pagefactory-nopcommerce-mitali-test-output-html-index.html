package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicsPage extends Utility {
    @CacheLookup
    @FindBy
            (xpath = "//ul[@class='top-menu notmobile']/li[2]")
    WebElement mouseHooverOnElectronics;
    @CacheLookup
    @FindBy
            (xpath = "//body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellphone;
    @CacheLookup
    @FindBy
            (xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement textCellPhone1;
    @CacheLookup
    @FindBy
            (xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement listView;
    @CacheLookup
    @FindBy
            (xpath = "//div[@class='details']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nameNokiaLumia;
    @CacheLookup
    @FindBy
            (xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumia;
    @CacheLookup
    @FindBy
            (xpath = "//span[@id='price-value-20']")
    WebElement verifyText$349;
    @CacheLookup
    @FindBy

            (xpath = "//input[@id='product_enteredQuantity_20']")//--//input[@id='product_enteredQuantity_1']
    WebElement changeQuantity;
    @CacheLookup
    @FindBy
            (xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;
    @CacheLookup
    @FindBy
            (xpath = "//div[@id='bar-notification']/div/p")
    WebElement verifyTheProductHasBeenAddedmessage;
    @CacheLookup
    @FindBy
            (xpath = "//span[@class='close']")
    WebElement closeButton;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy
            (xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickOnIt;
    @CacheLookup
    @FindBy
            (xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyShoppingCart;
    @CacheLookup
    @FindBy
            (xpath = "//span[@class='product-subtotal']")
    WebElement verifyTotal$698;
    @CacheLookup
    @FindBy
            (xpath = "//input[@id='termsofservice']")
    WebElement checkBox;
    @CacheLookup
    @FindBy
            (xpath = "//button[@id='checkout']")
    WebElement checkOut;
    @CacheLookup
    @FindBy
            (xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeMessage;
    @CacheLookup
    @FindBy
            (xpath = "//button[contains(text(),'Register')]")
    WebElement registerTab;
    @CacheLookup
    @FindBy
            (xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy

            (id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy

            (id = "LastName")
    WebElement LastName;
    @CacheLookup
    @FindBy
            (id = "Email")
    WebElement email;
    @CacheLookup
    @FindBy
            (id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy
            (id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy
            (id = "register-button")
    WebElement register1;
    @CacheLookup
    @FindBy
            (xpath = "//div[text()='Your registration completed']")

    WebElement textMessageYourRegistrationCompleted;
    @CacheLookup
    @FindBy
            (xpath = "//a[@class='button-1 register-continue-button']")
    WebElement continueButton2;
    @CacheLookup
    @FindBy
            (xpath = "//h1[text()='Shopping cart']")
    WebElement getVerifyShoppingCart;
    @CacheLookup
    @FindBy
            (id = "termsofservice")
    WebElement checkBox1;
    @CacheLookup
    @FindBy
            (xpath = "//button[@id='checkout']")
    WebElement checkOutC;
    @CacheLookup
    @FindBy
            (id = "BillingNewAddress_CountryId")
    WebElement country;
    @CacheLookup
    @FindBy
            (id = "BillingNewAddress_City")
    WebElement city;
    @CacheLookup
    @FindBy
            (id = "BillingNewAddress_Address1")
    WebElement address1;
    @CacheLookup
    @FindBy
            (id = "BillingNewAddress_ZipPostalCode")
    WebElement zipPostalCode;
    @CacheLookup
    @FindBy
            (id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy
            (xpath = "//button[text() = 'Continue']")
    WebElement continueButton3;
    @CacheLookup
    @FindBy
            (id = "shippingoption_2")
    WebElement radiobutton1;
    @CacheLookup
    @FindBy
            (xpath = "//div[@id='shipping-method-buttons-container']/button")
    WebElement continueButton4;
    @CacheLookup
    @FindBy
            (xpath = "//input[@id='paymentmethod_1']")
    WebElement clickOnRadioButton2;
    @CacheLookup
    @FindBy
            (xpath = "//div[@id='checkout-step-payment-method']/div/button")
    WebElement clickOnContinue4;
    @CacheLookup
    @FindBy
            (id = "CreditCardType")
    WebElement selectVisa;
    @CacheLookup
    @FindBy
            (xpath = "//input[@data-val-required='Enter cardholder name']")
    WebElement cardholderName;
    @CacheLookup
    @FindBy
            (id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy
            (id = "ExpireMonth")
    WebElement ExpireMonth;
    @CacheLookup
    @FindBy
            (id = "ExpireYear")
    WebElement ExpireYear;
    @CacheLookup
    @FindBy
            (xpath = "//input[@id='CardCode']")
    WebElement CardCode;
    @CacheLookup
    @FindBy
            (xpath = "//div[@id='payment-info-buttons-container']/button")
    WebElement getContinueButton5;
    @CacheLookup
    @FindBy
            (xpath = "//li[@class='payment-method']/span[2]")
    WebElement PaymentMethod1;
    @CacheLookup
    @FindBy
            (xpath = "//li[@class='shipping-method']/span[2]")
    WebElement shippingMethod;
    @CacheLookup
    @FindBy
            (xpath = "//td[@class='subtotal']/span")
    WebElement total$698;
    @CacheLookup
    @FindBy
            (xpath = "//button[text()='Confirm']")
    WebElement confirmButton5;
    @CacheLookup
    @FindBy
            (xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouMessage;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement orderSuccessfullyProcessed;
    @CacheLookup
    @FindBy
            (xpath = "//button[contains(text(),'Continue')]")
    WebElement getContinueButton6;
    @CacheLookup
    @FindBy
            (xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeToOurStore;
    @CacheLookup
    @FindBy
            (xpath = "//a[contains(text(),'Log out')]")
    WebElement logout1;

    public void electronicsPage() {
        Reporter.log("Clicking on Continue Tab : " + mouseHooverOnElectronics.toString());
        mouseHoverToElement(mouseHooverOnElectronics);
    }

    public void setMouseHooverOnCellPhone() {
        Reporter.log("Clicking on Cellphone : " + cellphone.toString());
        mouseHoverToElementAndClick(cellphone);

    }

    public String cellPhone() {
        Reporter.log("Text verify : " + textCellPhone1.toString());
        return getTextFromElement(textCellPhone1);
    }

    public void listView() {
        Reporter.log("Click on listview : " + listView.toString());
        clickOnElement(listView);
    }

    public void nokiaLumia() {
        Reporter.log("Click on NokiaLumia : " + nameNokiaLumia.toString());
        clickOnElement(nameNokiaLumia);
    }

    public String nokiaLumia1() {
        Reporter.log("Verify text NokiaLumia : " + nokiaLumia.toString());
        return getTextFromElement(nokiaLumia);
    }

    public String verifyText1$349() {
        Reporter.log("Verify text $349 : " + verifyText$349.toString());
        return getTextFromElement(verifyText$349);
    }

    public void changeQuntity1(String text) {
        Actions action = new Actions(driver);
        WebElement qty = driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']"));//chnge from by
        qty.click();
        qty.clear();
        qty.sendKeys(text);
        //  clearAndEnterQuantity(changeQuantity, "2");

    }

    public void addToCart() {
        Reporter.log("Click on Add to cart : " + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String message1() {
        Reporter.log("Verify Text message : " + verifyTheProductHasBeenAddedmessage.toString());
        return getTextFromElement(verifyTheProductHasBeenAddedmessage);
    }

    public void closeButton() {
        Reporter.log("Click on CrossTab : " + closeButton.toString());
        clickOnElement(closeButton);
    }

    public void clickOnShoppingCart() {
        mouseHoverToElementAndClick(clickOnIt);
        clickOnElement(clickOnIt);
    }

    public String verifyShoppingCart() {
        Reporter.log("Verify Text message : " + verifyShoppingCart.toString());
        return getTextFromElement(verifyShoppingCart);
    }

    public String totalText698() {
        Reporter.log("Verify Text message : " + verifyTotal$698.toString());
        return getTextFromElement(verifyTotal$698);
    }

    public void checkBox() {
        Reporter.log("Click on checkbox : " + checkBox.toString());
        clickOnElement(checkBox);
    }

    public void checkOut() {
        Reporter.log("Click on checkout : " + checkOut.toString());
        clickOnElement(checkOut);
    }

    public String welcomeMessage1() {
        Reporter.log("Getting Message : " + welcomeMessage.toString());
        return getTextFromElement(welcomeMessage);
    }

    public void registerTab() {
        Reporter.log("Click on Register Tab : " + registerTab.toString());
        clickOnElement(registerTab);
    }

    public String registerText() {
        Reporter.log("Verify Message: " + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void enterFirstname(String text) {
        Reporter.log("Sending text to Firstname : "+text+" to " + firstName.toString());
        sendTextToElement(firstName, text);
    }

    public void enterLastname(String text) {
        Reporter.log("Sending text to Lastname : "+text+" to " + LastName.toString());
        sendTextToElement(LastName, text);
    }

    public void enterEmail1(String text) {
        Reporter.log("Sending text to email : "+text+" to " + email.toString());
        sendTextToElement(email, text);
    }

    public void enterPassword(String text) {
        Reporter.log("Sending text to password : "+text+" to " + password.toString());
        sendTextToElement(password, text);
    }

    public void enterConfirmPassword(String text) {
        Reporter.log("Sending text to confirmPassword : "+text+" to " + confirmPassword.toString());
        sendTextToElement(confirmPassword, text);
    }

    public void registerButton1() {
        Reporter.log("Click on Register Tab : " + register1.toString());
        clickOnElement(register1);
    }

    public String registrationCompleted() {
        Reporter.log("Verify Message : " + textMessageYourRegistrationCompleted.toString());
        return getTextFromElement(textMessageYourRegistrationCompleted);
    }

    public void continueB() {
        Reporter.log("Click on continue : " + continueButton2.toString());
        clickOnElement(continueButton2);
    }

    public String shoppingCart1() {
        Reporter.log("verify Text : " + getVerifyShoppingCart.toString());
        return getTextFromElement(getVerifyShoppingCart);
    }

    public void setCheckBox2() {
        Reporter.log("Click on checkbox : " + checkBox1.toString());
        clickOnElement(checkBox1);
    }

    public void checkout3() {
        Reporter.log("Click on checkout : " + checkOutC.toString());
        clickOnElement(checkOutC);
    }

    public void enterCountry(String text) {
        Reporter.log("Select Country : " + country.toString());
        selectByVisibleTextFromDropDown(country, text);
    }

    public void enterCity(String text) {
        Reporter.log("Sending text to city : "+text+" to " + city.toString());
        sendTextToElement(city, text);

    }

    public void enterAddress1(String text) {
        Reporter.log("Sending text to Address : "+text+" to " + address1.toString());
        sendTextToElement(address1, text);

    }

    public void enterZipPostalCode(String text) {
        Reporter.log("Sending text to zipcode : "+text+" to " + zipPostalCode.toString());
        sendTextToElement(zipPostalCode, text);

    }

    public void enterPhoneNumber(String text) {
        Reporter.log("Sending text to phoneNumber : "+text+" to " + phoneNumber.toString());
        sendTextToElement(phoneNumber, text);

    }

    public void continue3() {
        Reporter.log("Click on Continue : " + continueButton3.toString());
        clickOnElement(continueButton3);
    }

    public void setRadiobutton1() {
        Reporter.log("Click on Radiobutton : " + radiobutton1.toString());
        clickOnElement(radiobutton1);
    }

    public void continue4() {
        Reporter.log("Click on Continue : " + continueButton4.toString());
        clickOnElement(continueButton4);
    }

    public void setClickOnRadioButton2() {
        clickOnElement(clickOnRadioButton2);
        clickOnElement(clickOnContinue4);
    }

    public void selectVisa(String text) {
        Reporter.log("Select paymentMethod : "+text+" to " + selectVisa.toString());
        selectByVisibleTextFromDropDown(selectVisa, text);
    }

    public void setCardholderName(String text) {
        Reporter.log("Enter CardHolderName : "+text+" to " + cardholderName.toString());
        sendTextToElement(cardholderName, text);
    }

    public void setCardNumber(String text) {
        Reporter.log("Enter cardNumber : "+text+" to " + cardNumber.toString());
        sendTextToElement(cardNumber, text);

    }

    public void ExpireMonth(String text) {
        Reporter.log("Enter Date of Expire Month : "+text+" to " + ExpireMonth.toString());
        sendTextToElement(ExpireMonth, text);

    }

    public void ExpireYear(String text) {
        Reporter.log("Enter Date of Expire year : "+text+" to " + ExpireYear.toString());
        sendTextToElement(ExpireYear, text);

    }

    public void cardCode(String text) {
        Reporter.log("Enter cardCode : "+text+" to " + CardCode.toString());
        sendTextToElement(CardCode, text);

    }

    public void setGetContinueButton5() {
        Reporter.log("Click on Continue : " + getContinueButton5.toString());
        clickOnElement(getContinueButton5);

    }

    public String paymentMethod() {
        Reporter.log("Verify Text : " + PaymentMethod1.toString());
        return getTextFromElement(PaymentMethod1);
    }

    public String shippingMethod1() {
        Reporter.log("Verify Text : " + shippingMethod.toString());
        return getTextFromElement(shippingMethod);
    }

    public String total$698() {
        Reporter.log("Verify Text : " + total$698.toString());
        return getTextFromElement(total$698);
    }

    public void confirm5() {
        Reporter.log("Click on Continue : " + confirmButton5.toString());
        clickOnElement(confirmButton5);
    }

    public String thankYou() {
        Reporter.log("Verify Text : " + thankYouMessage.toString());
        return getTextFromElement(thankYouMessage);
    }

    public String orderProcessed() {
        Reporter.log("Verify Text : " + orderSuccessfullyProcessed.toString());
        return getTextFromElement(orderSuccessfullyProcessed);
    }

    public void continueButton6() {
        Reporter.log("Click on Continue : " + getContinueButton6.toString());
        clickOnElement(getContinueButton6);

    }

    public String message5() {
        Reporter.log("Verify Text : " + welcomeToOurStore.toString());
        return getTextFromElement(welcomeToOurStore);
    }

    public void logout1() {
        Reporter.log("Click on Logout : " + logout1.toString());
        clickOnElement(logout1);

    }
}
