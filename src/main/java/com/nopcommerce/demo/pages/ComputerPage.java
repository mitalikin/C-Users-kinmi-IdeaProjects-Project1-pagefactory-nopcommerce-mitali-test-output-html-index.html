package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy
            (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")//ul[@class='top-menu notmobile']/li[1]/a[1]
    WebElement mouseHoverAndClickOnComputer;
    @CacheLookup
    @FindBy
            (linkText = "Desktops")  //(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement clickOnDeskTop;
    @CacheLookup
    @FindBy
            (xpath = "//select[@id='products-orderby']")
    WebElement selectSortByZToA;
    @CacheLookup
    @FindBy
            (xpath = "//select[@id='products-orderby']")
    WebElement selectSortByAToZ;
    @CacheLookup
    @FindBy
            (xpath = "//div[@class='add-info']//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/1/1/1\"),!1']")
    WebElement clickOnAddToCart;
    @CacheLookup
    @FindBy
            (xpath = "//h1[text()='Build your own computer']")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy
            (xpath = "//select[@id='product_attribute_1']")
    WebElement selectFirstOptionFromProcessor;
    @CacheLookup
    @FindBy
            (name = "product_attribute_2")
    WebElement selectFirstOptionFromRam;
    @CacheLookup
    @FindBy
            (id = "product_attribute_3_7")
    WebElement selectRadioButton;

    @CacheLookup
    @FindBy
            (id = "product_attribute_4_9")
    WebElement selectRadioButton1;
    @CacheLookup
    @FindBy
            (id = "product_attribute_5_12")
    WebElement selectTotalCommander;

    @FindBy
            (id = "price-value-1")
    WebElement textPrice$1475;

    public void mouseHoverToElementAndClickOnComputer() {
        Reporter.log("Clicking on Computer Tab : " + mouseHoverAndClickOnComputer.toString());
        clickOnElement(mouseHoverAndClickOnComputer);
    }

    public void setClickOnDeskTop() {
        Reporter.log("Clicking on Desktop : " + clickOnDeskTop.toString());
        clickOnElement(clickOnDeskTop);
    }

    public void setSelectSortByZToA(String sortZToA) {
        clickOnElement(selectSortByZToA);
        selectByVisibleTextFromDropDown(selectSortByZToA, sortZToA);
    }

    public void setSelectSortByAToZ(String sortAToZ) {

        clickOnElement(selectSortByAToZ);
        //selectByVisibleTextFromDropDown(selectSortByAToZ, sortAToZ);
    }

    public void setClickOnAddToCart() {
        Reporter.log("Clicking on Add to cart Tab : " + clickOnAddToCart.toString());
        clickOnElement(clickOnAddToCart);
    }

    public String getBuildYourComputerText() {
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectFirstOptionFromDropDown(String option) {
        selectByVisibleTextFromDropDown(selectFirstOptionFromProcessor, option);
    }

    public void selectFirstOptionFromDropDown2(String option) {
        selectByVisibleTextFromDropDown(selectFirstOptionFromRam, option);
    }

    public void selectRadioButtonTab() {
        clickOnElement(selectRadioButton);
    }

    public void selectRadioButton1Tab() {
        clickOnElement(selectRadioButton1);
    }

    public void selectCheckbox() {
        clickOnElement(selectTotalCommander);
    }

    public String verifyPriceText() {
        return getTextFromElement(textPrice$1475);
    }


}
