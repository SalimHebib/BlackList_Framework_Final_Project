package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ebay.Motors;

public class MotorsTest extends CommonAPI {



    @Test(enabled = true)
    public void CarsAndTrucksTest() {

        Motors homePage = new Motors(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickCarsAndTrucks();
        waitFor(3);
        homePage.clickAcura();
        String expectedResult = "Acura in Body Type:SUV | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void BoatsTest() {

        Motors homePage = new Motors(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickBoats();
        waitFor(3);
        homePage.clickSailBoats();
        waitFor(3);
        String expectedResult = "Sailboats for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void MotorsCycleTest() {

        Motors homePage = new Motors(getDriver());
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickMotorcycles();
        waitFor(3);
        homePage.clickCruiser();
        String expectedResult = "Type Chopper for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void PowerSportsTest() {

        Motors homePage = new Motors(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickPowerSports();
        waitFor(3);
        homePage.clickAtvS();
        String expectedResult = "UTVs for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void ClassicsTest() {

        Motors homePage = new Motors(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickClassics();
        waitFor(3);
        homePage.clickConvertible();
        String expectedResult = "Chevrolet Camaro Cars for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void CampersTest() {

        Motors homePage = new Motors(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickCampers();
        waitFor(3);
        homePage.clickAirstream();
        String expectedResult = "Airstream Travel Trailers for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

}