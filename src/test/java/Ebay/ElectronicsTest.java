package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ebay.Electronics;

public class ElectronicsTest extends CommonAPI {


    @Test(enabled = true)
    public void CameraDronesTest() {
        Electronics homePage = new Electronics(getDriver());
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickCamerasAndPhoto();
        waitFor(1);
        homePage.clickCameraDrones();
        String expectedResult = "Drones for Sale - Shop New & Used Camera Drones - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void headPhonesTest() {
        Electronics homePage = new Electronics(getDriver());
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickHeadPhones();
        waitFor(3);
        homePage.clickHeadPhoneParts();
        homePage.clickWhite();
        String expectedResult = "White Headphone Parts for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

     @Test(enabled = true)
    public void VideoGamesTest() {
        Electronics homePage = new Electronics(getDriver());
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickVideoGames();
        waitFor(3);
        homePage.clickPs5();
        String expectedResult = "Sony PlayStation 5 Video Games for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void NintendoToysTest() {
        Electronics homePage = new Electronics(getDriver());
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickNintendo();
        waitFor(3);
        homePage.clickBatteries();
        String expectedResult = "Video Game Batteries for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void VehicleElectronicsTest() {
        Electronics homePage = new Electronics(getDriver());
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickVehicleElectronics();
        waitFor(3);
        homePage.clickCarVideo();
        String expectedResult = "Car Video Monitors & Equipment for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void SmartHomeTest() {
        Electronics homePage = new Electronics(getDriver());
        waitFor(3);
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickSmartHome();
        waitFor(3);
        homePage.clickSmartPlugs();
        String expectedResult = "Smart Home Devices & Surveillance - Speakers, Cameras & More - eBay";           Assert.assertEquals(expectedResult, getPageTitle());
    }

}