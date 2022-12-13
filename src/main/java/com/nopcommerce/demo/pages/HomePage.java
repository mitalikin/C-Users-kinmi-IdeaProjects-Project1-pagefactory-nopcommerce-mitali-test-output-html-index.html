package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class HomePage extends Utility {
@FindBy
        (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")////ul[@class='top-menu notmobile']/li[1]/a[1]
    WebElement clickOnComputer;
@FindBy
        (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")// (linkText = "Electronics")
    WebElement clickOnElectronics;
@FindBy
        (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")//(linkText = "Apparel")
    WebElement clickOnApparel;
@FindBy
        (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]")// (linkText = "Digital downloads")
    WebElement clickOnDigitalDownloads;
@FindBy
        (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")//(linkText = "Books")
    WebElement clickOnBooks;
@FindBy
        (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")// (linkText = "Jewelry")
    WebElement clickOnJewelry;

@FindBy
        (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]")// (linkText = "Gift Cards")
    WebElement clickOnGiftCards;
    public void mouseHoverToElementAndClickOnComputer() {
        Reporter.log("Clicking on Computer Link : " + clickOnComputer.toString());
        clickOnElement(clickOnComputer);
    }

    public void mouseHoverToElementAndClickOnElectronics() {
        Reporter.log("Clicking on Computer Link : " + clickOnElectronics.toString());
        clickOnElement(clickOnElectronics);
    }
    public void mouseHoverToElementAndClickOnApparel() {
        Reporter.log("Clicking on Computer Link : " + clickOnApparel.toString());
        clickOnElement(clickOnApparel);
    }
    public void mouseHoverToElementAndClickOnDigitalDownloads() {
        Reporter.log("Clicking on Computer Link : " + clickOnDigitalDownloads.toString());
        clickOnElement(clickOnDigitalDownloads);

    }
    public void mouseHoverToElementAndClickOnBooks() {
        Reporter.log("Clicking on Computer Link : " + clickOnBooks.toString());
        clickOnElement(clickOnBooks);
    }
    public void mouseHoverToElementAndClickOnJewelry() {
        Reporter.log("Clicking on Computer Link : " + clickOnJewelry.toString());
        clickOnElement(clickOnJewelry);
    }
    public void mouseHoverToElementAndClickOnGiftCards() {
        Reporter.log("Clicking on Computer Link : " + clickOnGiftCards.toString());
        clickOnElement(clickOnGiftCards);
    }






}
