package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayHomePage.JewelryAndWatches;

public class JewelryAndWatchesTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);


    @Test(enabled = true)
    public void RolexTest() {
        JewelryAndWatches homePage = new JewelryAndWatches(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Jewelry & Watches Floating Menu successfully");
        homePage.clickRolex();
        waitFor(3);
        LOG.info("Click Rolex Watches successfully");
        homePage.clickSubmariner();
        LOG.info("Click Rolex Submariner  successfully");
        String expectedResult = "Rolex Submariner Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void OmegaTest() {
        JewelryAndWatches homePage = new JewelryAndWatches(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Jewelry & Watches Floating Menu successfully");
        homePage.clickOmega();
        waitFor(3);
        LOG.info("Click OMEGA Watches successfully");
        homePage.clickSpeedMaster();
        LOG.info("Click OMEGA Speedmaster Watches successfully");
        String expectedResult = "OMEGA Speedmaster Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void BreitlingTest() {
        JewelryAndWatches homePage = new JewelryAndWatches(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Jewelry & Watches Floating Menu successfully");
        homePage.clickBreitling();
        waitFor(3);
        LOG.info("Click Breitling Watches successfully");
        homePage.clickNavitimer();
        LOG.info("Click Breitling Navitimer Watches successfully");
        String expectedResult = "Breitling Navitimer Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void TAGHeuerTest() {
        JewelryAndWatches homePage = new JewelryAndWatches(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Jewelry & Watches Floating Menu successfully");
        homePage.clickTAGHeuer();
        waitFor(3);
        LOG.info("Click TAG Heuer Watches successfully");
        homePage.clickAutavia();
        LOG.info("Click TAG Heuer Autavia Watches successfully");
        String expectedResult = "TAG Heuer Autavia Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void PatekPhilippeTest() {
        JewelryAndWatches homePage = new JewelryAndWatches(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Jewelry & Watches Floating Menu successfully");
        homePage.clickPatekPhilippe();
        waitFor(3);
        LOG.info("Click Patek Philippe Watches successfully");
        homePage.clickCalatrava();
        LOG.info("Click Patek Philippe Calatrava Watches successfully");
        String expectedResult = "Patek Philippe Calatrava Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void CartierTest() {
        JewelryAndWatches homePage = new JewelryAndWatches(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Jewelry & Watches Floating Menu successfully");
        homePage.clickCartier();
        waitFor(3);
        LOG.info("Click Cartier successfully");
        waitFor(3);
        homePage.clickCartierWatches();
        LOG.info("Click Cartier Watches successfully");
        waitFor(3);
        homePage.clickSantos();
        LOG.info("Click Cartier Santos Watches successfully");
        String expectedResult = "Cartier Santos Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}