package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ebay.JewelryAndWatches;

public class JewelryAndWatchesTest extends CommonAPI {




    @Test(enabled = true)
    public void RolexTest() {
        JewelryAndWatches homePage = new JewelryAndWatches(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickRolex();
        waitFor(3);
        homePage.clickSubmariner();
        String expectedResult = "Rolex Submariner Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void OmegaTest() {
        JewelryAndWatches homePage = new JewelryAndWatches(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickOmega();
        waitFor(3);
        homePage.clickSpeedMaster();
        String expectedResult = "OMEGA Speedmaster Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void BreitlingTest() {
        JewelryAndWatches homePage = new JewelryAndWatches(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickBreitling();
        waitFor(3);
        homePage.clickNavitimer();
        String expectedResult = "Breitling Navitimer Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void TAGHeuerTest() {
        JewelryAndWatches homePage = new JewelryAndWatches(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickTAGHeuer();
        waitFor(3);
        homePage.clickAutavia();
        String expectedResult = "TAG Heuer Autavia Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void PatekPhilippeTest() {
        JewelryAndWatches homePage = new JewelryAndWatches(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickPatekPhilippe();
        waitFor(3);
        homePage.clickCalatrava();
        String expectedResult = "Patek Philippe Calatrava Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void CartierTest() {
        JewelryAndWatches homePage = new JewelryAndWatches(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickCartier();
        waitFor(3);
        waitFor(3);
        homePage.clickCartierWatches();
        waitFor(3);
        homePage.clickSantos();
        String expectedResult = "Cartier Santos Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}