package Ebay;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayHomePage.SearchByCategory;

public class SearchByCategoryTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled = true)
    public void MotorsTest() {

        SearchByCategory homePage = new SearchByCategory(getDriver());
        LOG.info("Login HomePage successfully ");
        homePage.clickShopByCategory();
        waitFor(3);
        LOG.info("Click ShopByCategory successfully ");
        homePage.clickMotors();
        LOG.info("ClickMotors successfully ");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        LOG.info("ScrollDown Page successfully ");
        homePage.clickVehicles();
        LOG.info("Click Vehicle successfully ");
        homePage.clickElectricHybridCar();
        LOG.info("ClickElectric Hybrid car successfully ");
        String expectedResult = "Green Driving products for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void BusinessIndustrialTest() {
        SearchByCategory homePage = new SearchByCategory(getDriver());
        LOG.info("Login HomePage successfully ");
        homePage.clickShopByCategory();
        LOG.info("Click ShopByCategory successfully ");
        waitFor(3);
        homePage.clickBusinessIndustrial();
        LOG.info("Click Business Industrial successfully ");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1350)", "");
        waitFor(5);
        LOG.info("Scroll Down Page  successfully ");
        homePage.clickDental();
        LOG.info("Click Dental successfully ");
        String expectedResult = "Dental products for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void OtherCategoriesTest() {
        SearchByCategory homePage = new SearchByCategory(getDriver());
        LOG.info("Login HomePage successfully ");
        homePage.clickShopByCategory();
        waitFor(3);
        LOG.info("Click ShopByCategory successfully ");
        homePage.clickOtherCategories();
        LOG.info("Click Other Categories successfully ");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)", "");
        waitFor(5);
        LOG.info("ScrollDown Page successfully ");
        homePage.clickAntiqueFurniture();
        LOG.info("Click antique Furniture successfully ");
        String expectedResult = "Antique Furniture for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void JewelryWatchesTest() {
        SearchByCategory homePage = new SearchByCategory(getDriver());
        LOG.info("Login HomePage successfully ");
        homePage.clickShopByCategory();
        waitFor(3);
        LOG.info("Click ShopByCategory successfully ");
        homePage.clickJewelryWatches();
        LOG.info("Click Jewelry &  Watches successfully ");
        homePage.clickFineJewelry();
        LOG.info("Click fine Jewelry successfully ");
        homePage.clickFineRings();
        LOG.info("Click Fine Rings successfully ");
        String expectedResult = "Fine Rings for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void CollectiblesArtTest() {
        SearchByCategory homePage = new SearchByCategory(getDriver());
        LOG.info("Login HomePage successfully ");
        homePage.clickShopByCategory();
        waitFor(3);
        LOG.info("Click ShopByCategory successfully ");
        homePage.clickCollectiblesArt();
        LOG.info("Click Collectibles Art successfully ");
        homePage.clickStamps();
        LOG.info("Click Stamps successfully ");
        homePage.clickAfricanStamps();
        LOG.info("Click African Stamps successfully ");
        String expectedResult = "African Stamps for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void ClothingAndAccessoriesTest() {
        SearchByCategory homePage = new SearchByCategory(getDriver());
        LOG.info("Login HomePage successfully ");
        homePage.clickShopByCategory();
        waitFor(3);
        LOG.info("Click ShopByCategory successfully ");
        homePage.clickClothing();
        LOG.info("Click Clothing successfully ");
        homePage.clickWomen();
        LOG.info("Click Women successfully ");
        homePage.selectWomenClothing();
        LOG.info("Click WomenClothing  successfully ");
        String expectedResult = "Women's Clothing for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}