package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayHomePage.Electronics;

public class ElectronicsTest extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled = true)
    public void CameraDronesTest() {
        Electronics homePage = new Electronics(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickCamerasAndPhoto();
        waitFor(1);
        LOG.info("Click Camera And Photo Successfully");
        homePage.clickCameraDrones();
        LOG.info("Click Camera Drones Successfully");
        String expectedResult = "Drones for Sale - Shop New & Used Camera Drones - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void headPhonesTest() {
        Electronics homePage = new Electronics(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        homePage.clickHeadPhones();
        LOG.info("Click Head Phones Successfully");
        waitFor(3);
        homePage.clickHeadPhoneParts();
        LOG.info("Click Head Phones Parts Successfully");
        homePage.clickWhite();
        LOG.info("Click white Successfully");
        String expectedResult = "White Headphone Parts for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

     @Test(enabled = true)
    public void VideoGamesTest() {
        Electronics homePage = new Electronics(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        homePage.clickVideoGames();
        waitFor(3);
        LOG.info("Click Video Games Successfully");
        homePage.clickPs5();
        LOG.info("Click Ps5 Successfully");
        String expectedResult = "Sony PlayStation 5 Video Games for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void NintendoToysTest() {
        Electronics homePage = new Electronics(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickNintendo();
        LOG.info("Click Nintendo Successfully");
        waitFor(3);
        homePage.clickBatteries();
        LOG.info("Click Batteries Successfully");
        String expectedResult = "Video Game Batteries for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void VehicleElectronicsTest() {
        Electronics homePage = new Electronics(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickVehicleElectronics();
        LOG.info("Click Vehicle Electronics Successfully");
        waitFor(3);
        homePage.clickCarVideo();
        LOG.info("Click Car Video Successfully");
        String expectedResult = "Car Video Monitors & Equipment for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void SmartHomeTest() {
        Electronics homePage = new Electronics(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        LOG.info("Floating Menu Successfully");
        waitFor(3);
        homePage.clickSmartHome();
        LOG.info("Click Smart Home Successfully");
        waitFor(3);
        homePage.clickSmartPlugs();
        LOG.info("Click Smart Plugs Successfully");
        String expectedResult = "Smart Home Devices & Surveillance - Speakers, Cameras & More - eBay";           Assert.assertEquals(expectedResult, getPageTitle());
    }

}