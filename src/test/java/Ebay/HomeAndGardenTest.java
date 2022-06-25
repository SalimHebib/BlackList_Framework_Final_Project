package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ebay.HomeAndGarden;


public class HomeAndGardenTest extends CommonAPI {



    @Test(enabled = true)
    public void HomeImprovementTest() {
        HomeAndGarden homePage = new HomeAndGarden(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickHomeImprovement();
        waitFor(3);
        homePage.clickElectricalSupplies();
        homePage.clickOutletsAndSwitches();
        String expectedResult = "Home Electrical Outlets, Switches & Accessories for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void HomeDecorTest() {
        HomeAndGarden homePage = new HomeAndGarden(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickHomeDecor();
        waitFor(3);
        homePage.clickGeorgJensen();
        homePage.clickCobraCandleHolder();
        String expectedResult = "Georg Jensen 2021 Christmas Candle Holders 3 Piece Set | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void BeddingTest() {
        HomeAndGarden homePage = new HomeAndGarden(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickBedding();
        waitFor(3);
        homePage.clickBedSkirts();
        String expectedResult = "Bed Skirts for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void VacuumCleanerTest() {
        HomeAndGarden homePage = new HomeAndGarden(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickVacuumCleaners();
        waitFor(3);
        homePage.clickSteamCleaners();
        String expectedResult = "Steam Cleaners for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void FurnitureTest() {
        HomeAndGarden homePage = new HomeAndGarden(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickFurniture();
        waitFor(3);
        homePage.clickBedroomSets();
        String expectedResult = "Bedroom Furniture Sets for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void AppliancesTest() {
        HomeAndGarden homePage = new HomeAndGarden(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickAppliances();
        waitFor(3);
        homePage.clickCrepeMaker();
        String expectedResult = "Crepe Makers for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}