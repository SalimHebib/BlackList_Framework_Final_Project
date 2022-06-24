package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayHomePage.HomeAndGarden;


public class HomeAndGardenTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled = true)
    public void HomeImprovementTest() {
        HomeAndGarden homePage = new HomeAndGarden(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickHomeImprovement();
        LOG.info("Click Home improvement Successfully");
        waitFor(3);
        homePage.clickElectricalSupplies();
        LOG.info("Click SElectrical supplies Successfully");
        homePage.clickOutletsAndSwitches();
        LOG.info("Click outlets And Switches Successfully");
        String expectedResult = "Home Electrical Outlets, Switches & Accessories for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void HomeDecorTest() {
        HomeAndGarden homePage = new HomeAndGarden(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickHomeDecor();
        LOG.info("Click Home Decor Successfully");
        waitFor(3);
        homePage.clickGeorgJensen();
        LOG.info("Click George Jensen Successfully");
        homePage.clickCobraCandleHolder();
        LOG.info("Click Cobra Candle Holder Successfully");
        String expectedResult = "Georg Jensen 2021 Christmas Candle Holders 3 Piece Set | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void BeddingTest() {
        HomeAndGarden homePage = new HomeAndGarden(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickBedding();
        LOG.info("Click Bedding Successfully");
        waitFor(3);
        homePage.clickBedSkirts();
        LOG.info("Click Bed Skirts Successfully");
        String expectedResult = "Bed Skirts for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void VacuumCleanerTest() {
        HomeAndGarden homePage = new HomeAndGarden(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickVacuumCleaners();
        LOG.info("Click Vacuum Cleaner Successfully");
        waitFor(3);
        homePage.clickSteamCleaners();
        LOG.info("Click Steam Cleaners Successfully");
        String expectedResult = "Steam Cleaners for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void FurnitureTest() {
        HomeAndGarden homePage = new HomeAndGarden(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickFurniture();
        LOG.info("Click Furniture Successfully");
        waitFor(3);
        homePage.clickBedroomSets();
        LOG.info("Click Bedroom Sets Successfully");
        String expectedResult = "Bedroom Furniture Sets for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void AppliancesTest() {
        HomeAndGarden homePage = new HomeAndGarden(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickAppliances();
        LOG.info("Click Appliances Successfully");
        waitFor(3);
        homePage.clickCrepeMaker();
        LOG.info("Click Crepe Maker Successfully");
        String expectedResult = "Crepe Makers for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}