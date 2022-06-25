package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ebay.DailyDeals;


public class    DailyDealsTest extends CommonAPI {



    @Test(enabled = true)
    public void SportingGoodsTest() {
        DailyDeals homePage = new DailyDeals(getDriver());
        waitFor(3);
        homePage.clickDailyDeals();
        waitFor(3);
        homePage.hoverOverFloatingMenuSportingGoods(getDriver());
        homePage.clickGolf();
        waitFor(3);
        homePage.clickCobraSnake();
        String expectedResult = "NEW 2022 Cobra LTDX Fairway Wood - Choose Your Loft, Shaft, Flex, Hand, & Color | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void FashionTest() {
        DailyDeals homePage = new DailyDeals(getDriver());
        waitFor(3);
        homePage.clickDailyDeals();
        waitFor(3);
        homePage.hoverOverFloatingMenuFashion(getDriver());
        homePage.clickFineJewelry();
        waitFor(3);
        String expectedResult = "Fine jewelry Deals on eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void TechTest() {
        DailyDeals homePage = new DailyDeals(getDriver());
        waitFor(3);
        homePage.clickDailyDeals();
        waitFor(3);
        homePage.hoverOverFloatingMenuTech(getDriver());
        homePage.clickIpads();
        waitFor(3);
        homePage.clickAppleIPad();
        String expectedResult = "Apple iPad 10.2-inch 8th Gen (2020) 32GB Cellular + Wifi - Excellent | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }


    @Test(enabled = true)
    public void AutomotiveTest() {
        DailyDeals homePage = new DailyDeals(getDriver());
        waitFor(3);
        homePage.clickDailyDeals();
        waitFor(3);
        homePage.hoverOverFloatingMenuAutomotive(getDriver());
        waitFor(3);
        homePage.clickCarAccessories();
        String expectedResult = "Car accessories Deals on eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void HomeGardenTest() {
        DailyDeals homePage = new DailyDeals(getDriver());
        waitFor(3);
        homePage.clickDailyDeals();
        waitFor(3);
        homePage.hoverOverFloatingMenuHomeGarden(getDriver());
        homePage.clickKitchenDiningBar();
        waitFor(3);
        String expectedResult = "Kitchen dining bar Deals on eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void OtherDealsTest() {
        DailyDeals homePage = new DailyDeals(getDriver());
        waitFor(3);
        homePage.clickDailyDeals();
        homePage.hoverOverFloatingMenuOtherDeals(getDriver());
        waitFor(3);
        homePage.clickLuggage();
        String expectedResult = "Luggage travel Deals on eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}