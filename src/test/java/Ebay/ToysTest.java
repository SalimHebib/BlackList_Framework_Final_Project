package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ebay.Toys;

public class ToysTest extends CommonAPI {



    @Test(enabled = true)
    public void LegoSetsTest() {
        Toys homePage = new Toys(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickLegoSets();
        homePage.clickTajMahal();
        String expectedResult = "LEGO (R) Complete Sets & Packs for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void DollsTeddyBearTest() {
        Toys homePage = new Toys(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickDollsTeddyBear();
        String expectedResult = "Dolls & Teddy Bears for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());


    }

    @Test(enabled = true)
    public void ToysDealsTest() {
        Toys homePage = new Toys(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickToysDeals();
        homePage.clickShowFeaturedItems();
        waitFor(3);
        homePage.clickHighestFirst();
        String expectedResult = "Toys Deals on eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void ActionsFigureTest() {
        Toys homePage = new Toys(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickActionsFigure();
        waitFor(3);
        homePage.clickMixedLots();
        String expectedResult = "Action Figures Mixed Lots for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void BuildingToysTest() {
        Toys homePage = new Toys(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickBuildingToys();
        String expectedResult = "Building Toys for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void RailRoadsToysTest() {
        Toys homePage = new Toys(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickTrains();
        waitFor(3);
        homePage.clickRailRoads();
        String expectedResult = "Railroads & Trains for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

}