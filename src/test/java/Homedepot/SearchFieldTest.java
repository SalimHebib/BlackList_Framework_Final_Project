package Homedepot;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homedepot.HomePage;

public class SearchFieldTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled = true)
    public void homeDecorTest() {
        HomePage homepage = new HomePage(getDriver());
        homepage.searchElementAndEnter("home decorators collection");
        waitFor(3);
        homepage.clickChandeliers();
        String expectedResult = "Home Decorators Collection - Chandeliers - Lighting - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void outdoorChairsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.searchElementAndEnter("outdoor chairs");
        waitFor(3);
        homePage.clickPatioFurniture();
        String expectedResult = "Search Results for outdoor chairs at The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void bedroomSetsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.searchElementAndEnter("bedroom sets");
        waitFor(3);
        homePage.clickBedroomFurniture();
        String expectedResult = "Bedroom Sets - Bedroom Furniture - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void livingRoomTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.searchElementAndEnter("living room ");
        waitFor(3);
        homePage.clickFlooring();
        String expectedResult = "Search Results for living room at The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void diningTableTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.searchElementAndEnter("dining Table");
        waitFor(3);
        homePage.clickKitchen();
        String expectedResult = "Kitchen & Dining Tables - Kitchen & Dining Room Furniture - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void tileTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.searchElementAndEnter("tile");
        waitFor(3);
        homePage.clickFloorTile();
        String expectedResult = "Floor - Tile - Flooring - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void gardenFenceTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.searchElementAndEnter("garden fence");
        waitFor(3);
        homePage.clickGardenFencing();
        String expectedResult = "Search Results for garden fence at The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void poolsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.searchElementAndEnter("pools");
        waitFor(3);
        homePage.clickPools();
        String expectedResult = "Inflatable Pools - Pools - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void doorMatTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.searchElementAndEnter("Door Mat");
        waitFor(3);
        homePage.clickDoorMat();
        String expectedResult = "Door Mats - Mats - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    //10
    @Test(enabled = true)
    public void BBQGrillMatTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.searchElementAndEnter("BBQ Grill");
        waitFor(3);
        homePage.clickKamadoGrills();
        String expectedResult = "Kamado Grills - Charcoal Grills - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }


}