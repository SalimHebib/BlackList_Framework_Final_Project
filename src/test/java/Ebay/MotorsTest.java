package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayHomePage.Motors;

public class MotorsTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled = true)
    public void CarsAndTrucksTest() {

        Motors homePage = new Motors(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Motors Floating Menu successfully");
        waitFor(3);
        homePage.clickCarsAndTrucks();
        waitFor(3);
        LOG.info("Click Cars & Trucks successfully");
        homePage.clickAcura();
        LOG.info("Click Acura successfully ");
        String expectedResult = "Acura in Body Type:SUV | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void BoatsTest() {

        Motors homePage = new Motors(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Motors Floating Menu successfully");
        waitFor(3);
        homePage.clickBoats();
        LOG.info("Click Boats successfully ");
        waitFor(3);
        homePage.clickSailBoats();
        LOG.info("Click SailBoats successfully ");
        waitFor(3);
        String expectedResult = "Sailboats for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void MotorsCycleTest() {

        Motors homePage = new Motors(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Motors Floating Menu successfully ");
        waitFor(3);
        homePage.clickMotorcycles();
        LOG.info("Click Motorcycles successfully ");
        waitFor(3);
        homePage.clickCruiser();
        LOG.info("Click Cruiser successfully ");
        String expectedResult = "Type Chopper for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void PowerSportsTest() {

        Motors homePage = new Motors(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Motors Floating Menu successfully ");
        waitFor(3);
        homePage.clickPowerSports();
        LOG.info("Click PowerSports successfully ");
        waitFor(3);
        homePage.clickAtvS();
        LOG.info("Click AtvS successfully ");
        String expectedResult = "UTVs for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void ClassicsTest() {

        Motors homePage = new Motors(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Motors Floating Menu successfully ");
        waitFor(3);
        homePage.clickClassics();
        LOG.info("Click Classics successfully ");
        waitFor(3);
        homePage.clickConvertible();
        LOG.info("Click Convertible successfully ");
        String expectedResult = "Chevrolet Camaro Cars for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void CampersTest() {

        Motors homePage = new Motors(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Motors Floating Menu successfully ");
        waitFor(3);
        homePage.clickCampers();
        LOG.info("Click Campers successfully ");
        waitFor(3);
        homePage.clickAirstream();
        LOG.info("Click AirStream successfully ");
        String expectedResult = "Airstream Travel Trailers for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

}