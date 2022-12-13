package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
HomePage homePage;
@BeforeMethod(alwaysRun = true)
    public void inIt(){
    homePage=new HomePage();
}
    @Test(groups = {"sanity","regression"})
    public void verifyPageNavigationToComputerPageSuccessfully() {

       // homePage.selectMenu("Computers");
        homePage.mouseHoverToElementAndClickOnComputer();
        //homepage.mouseHoverToElementAndClick(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a[1]"));
        String expectedText = "Computers";
        String actualText = getTextFromElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a[1]"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }

    @Test
    public void verifyPageNavigationToElectronicsPageSuccessfully() {
        //homepage.selectMenu("Electronics");
        homePage.mouseHoverToElementAndClickOnElectronics();
        // mouseHoverToElementAndClick(By.linkText("Electronics"));
        String expectedText = "Electronics";
        String actualText = getTextFromElement(By.linkText("Electronics"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }

    @Test
    public void verifyPageNavigationToApparelPageSuccessfully() {
      //  homePage.selectMenu("Apparel");
        homePage.mouseHoverToElementAndClickOnApparel();
        mouseHoverToElementAndClick(By.linkText("Apparel"));
        String expectedText = "Apparel";
        String actualText = getTextFromElement(By.linkText("Apparel"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }

    @Test
    public void verifyPageNavigationToDigitalDownloadsPageSuccessfully() {
        //homePage.selectMenu("Digital downloads");
        homePage.mouseHoverToElementAndClickOnDigitalDownloads();
        //mouseHoverToElementAndClick(By.linkText("Digital downloads"));
        String expectedText = "Digital downloads";
        String actualText = getTextFromElement(By.linkText("Digital downloads"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }

    @Test
    public void verifyPageNavigationToBooksPageSuccessfully() {
     //   homePage.selectMenu("Books");
        homePage.mouseHoverToElementAndClickOnBooks();
        //mouseHoverToElementAndClick(By.linkText("Books"));
        String expectedText = "Books";
        String actualText = getTextFromElement(By.linkText("Books"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }

    @Test
    public void verifyPageNavigationToJewelryPageSuccessfully() {
      //  homePage.selectMenu("Jewelry");
        homePage.mouseHoverToElementAndClickOnJewelry();
        //  mouseHoverToElementAndClick(By.linkText("Books"));
        String expectedText = "Jewelry";
        String actualText = getTextFromElement(By.linkText("Jewelry"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }

    @Test
    public void verifyPageNavigationToGiftCardsPageSuccessfully() {
       // homepage.selectMenu("Gift Cards");
        homePage.mouseHoverToElementAndClickOnGiftCards();
        //mouseHoverToElementAndClick(By.linkText("Gift Cards"));
        String expectedText = "Gift Cards";
        String actualText = getTextFromElement(By.linkText("Gift Cards"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }






}
