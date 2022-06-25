package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayHomePage.DailyDeals;


public class    DailyDealsTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled = true)
    public void SportingGoodsTest() {
        DailyDeals homePage = new DailyDeals(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.clickDailyDeals();
        waitFor(3);
        LOG.info("Click Daily Deals Successfully ");
        homePage.hoverOverFloatingMenuSportingGoods(getDriver());
        LOG.info("Floating Menu Successfully");
        homePage.clickGolf();
        waitFor(3);
        LOG.info("Click Golf Successfully");
        homePage.clickCobraSnake();
        LOG.info("Click Cobra snake Successfully");
        String expectedResult = "NEW 2022 Cobra LTDX Fairway Wood - Choose Your Loft, Shaft, Flex, Hand, & Color | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void FashionTest() {
        DailyDeals homePage = new DailyDeals(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.clickDailyDeals();
        waitFor(3);
        LOG.info("Click Daily Deals Successfully ");
        homePage.hoverOverFloatingMenuFashion(getDriver());
        LOG.info("Click Daily Deals Successfully ");
        homePage.clickFineJewelry();
        waitFor(3);
        LOG.info("Click Fine Jewelry Successfully ");
        String expectedResult = "Fine jewelry Deals on eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void TechTest() {
        DailyDeals homePage = new DailyDeals(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.clickDailyDeals();
        waitFor(3);
        LOG.info("Click Daily Deals Successfully ");
        homePage.hoverOverFloatingMenuTech(getDriver());
        LOG.info("Click Daily Deals Successfully ");
        homePage.clickIpads();
        waitFor(3);
        LOG.info("Click Ipads Successfully ");
        homePage.clickAppleIPad();
        LOG.info("Click Apple Ipad Successfully ");
        String expectedResult = "Apple iPad 10.2-inch 8th Gen (2020) 32GB Cellular + Wifi - Excellent | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }


    @Test(enabled = true)
    public void AutomotiveTest() {
        DailyDeals homePage = new DailyDeals(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.clickDailyDeals();
        waitFor(3);
        LOG.info("Click Daily Deals Successfully ");
        homePage.hoverOverFloatingMenuAutomotive(getDriver());
        LOG.info("Click Daily Deals Successfully ");
        waitFor(3);
        homePage.clickCarAccessories();
        LOG.info("Click Car Accessories Successfully ");
        String expectedResult = "Car accessories Deals on eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void HomeGardenTest() {
        DailyDeals homePage = new DailyDeals(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.clickDailyDeals();
        waitFor(3);
        LOG.info("Click Daily Deals Successfully ");
        homePage.hoverOverFloatingMenuHomeGarden(getDriver());
        LOG.info("Click Daily Deals Successfully ");
        homePage.clickKitchenDiningBar();
        waitFor(3);
        LOG.info("Click Kitchen & dining & Bar Successfully ");
        String expectedResult = "Kitchen dining bar Deals on eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void OtherDealsTest() {
        DailyDeals homePage = new DailyDeals(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.clickDailyDeals();
        LOG.info("Click Daily Deals Successfully ");
        homePage.hoverOverFloatingMenuOtherDeals(getDriver());
        LOG.info("Click Daily Deals Successfully ");
        waitFor(3);
        homePage.clickLuggage();
        LOG.info("Click Luggage Travel Successfully ");
        String expectedResult = "Luggage travel Deals on eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}