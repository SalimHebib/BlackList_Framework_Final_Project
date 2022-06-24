package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayHomePage.Toys;

public class ToysTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled = true)
    public void LegoSetsTest() {
        Toys homePage = new Toys(getDriver());
        LOG.info("Login Home Page Successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        LOG.info("Electronics Menu flot");
        homePage.clickLegoSets();
        homePage.clickTajMahal();
        LOG.info("Taj Mahal Shown");
        String expectedResult = "LEGO (R) Complete Sets & Packs for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void DollsTeddyBearTest() {
        Toys homePage = new Toys(getDriver());
        LOG.info("Login Home Page Successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickDollsTeddyBear();
        LOG.info("click Dolls Teddy Bear");
        String expectedResult = "Dolls & Teddy Bears for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());


    }

    @Test(enabled = true)
    public void ToysDealsTest() {
        Toys homePage = new Toys(getDriver());
        LOG.info("Login Home Page Successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickToysDeals();
        LOG.info("Click Toys Successfully");
        homePage.clickShowFeaturedItems();
        waitFor(3);
        LOG.info("Click Show Featured Item Successfully");
        homePage.clickHighestFirst();
        LOG.info("Select Highest First  Successfully");
        String expectedResult = "Toys Deals on eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void ActionsFigureTest() {
        Toys homePage = new Toys(getDriver());
        LOG.info("Login Home Page Successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickActionsFigure();
        LOG.info("Click Actions Figure Successfully");
        waitFor(3);
        homePage.clickMixedLots();
        LOG.info("Click Mixed Lots Successfully");
        String expectedResult = "Action Figures Mixed Lots for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void BuildingToysTest() {
        Toys homePage = new Toys(getDriver());
        LOG.info("Login Home Page Successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickBuildingToys();
        LOG.info("Click building toys Successfully ");
        String expectedResult = "Building Toys for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void RailRoadsToysTest() {
        Toys homePage = new Toys(getDriver());
        LOG.info("Login Home Page Successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Floating Menu Successfully");
        homePage.clickTrains();
        waitFor(3);
        LOG.info("Click Trains Successfully");
        homePage.clickRailRoads();
        LOG.info("Click RailsRoad & Trains Successfully ");
        String expectedResult = "Railroads & Trains for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

}