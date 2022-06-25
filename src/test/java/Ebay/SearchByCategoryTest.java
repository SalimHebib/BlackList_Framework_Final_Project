package Ebay;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ebay.SearchByCategory;

public class SearchByCategoryTest extends CommonAPI {



    @Test(enabled = true)
    public void MotorsTest() {

        SearchByCategory homePage = new SearchByCategory(getDriver());
        homePage.clickShopByCategory();
        waitFor(3);
        homePage.clickMotors();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        homePage.clickVehicles();
        homePage.clickElectricHybridCar();
        String expectedResult = "Green Driving products for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void BusinessIndustrialTest() {
        SearchByCategory homePage = new SearchByCategory(getDriver());
        homePage.clickShopByCategory();
        waitFor(3);
        homePage.clickBusinessIndustrial();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1350)", "");
        waitFor(5);
        homePage.clickDental();
        String expectedResult = "Dental products for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void OtherCategoriesTest() {
        SearchByCategory homePage = new SearchByCategory(getDriver());
        homePage.clickShopByCategory();
        waitFor(3);
        homePage.clickOtherCategories();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)", "");
        waitFor(5);
        homePage.clickAntiqueFurniture();
        String expectedResult = "Antique Furniture for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void JewelryWatchesTest() {
        SearchByCategory homePage = new SearchByCategory(getDriver());
        homePage.clickShopByCategory();
        waitFor(3);
        homePage.clickJewelryWatches();
        homePage.clickFineJewelry();
        homePage.clickFineRings();
        String expectedResult = "Fine Rings for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void CollectiblesArtTest() {
        SearchByCategory homePage = new SearchByCategory(getDriver());
        homePage.clickShopByCategory();
        waitFor(3);
        homePage.clickCollectiblesArt();
        homePage.clickStamps();
        homePage.clickAfricanStamps();
        String expectedResult = "African Stamps for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void ClothingAndAccessoriesTest() {
        SearchByCategory homePage = new SearchByCategory(getDriver());
        homePage.clickShopByCategory();
        waitFor(3);
        homePage.clickClothing();
        homePage.clickWomen();
        homePage.selectWomenClothing();
        String expectedResult = "Women's Clothing for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}