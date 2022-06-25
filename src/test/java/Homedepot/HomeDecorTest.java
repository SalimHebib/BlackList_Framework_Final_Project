package Homedepot;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homedepot.HomeDecor;

public class HomeDecorTest extends CommonAPI {


    @Test(enabled = true)
    public void loveSeatsTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu2(getDriver());
        waitFor(3);
        homepage.clickLoveSeats();
        String expectedResult="Loveseats - Living Room Furniture - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void sofasTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu2(getDriver());
        waitFor(3);
        homepage.clickSofas();
        String expectedResult="Sofas - Living Room Furniture - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void tvStandTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu2(getDriver());
        waitFor(3);
        homepage.clickTVStand();
        String expectedResult="TV Stands - Living Room Furniture - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void sofaBedsTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu2(getDriver());
        waitFor(3);
        homepage.clickSofaBeds();
        waitFor(3);
        homepage.clickFurniture();
        String expectedResult="Sofa Beds - Living Room Furniture - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void bedsTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu2(getDriver());
        waitFor(3);
        homepage.clickBeds();
        waitFor(3);
        homepage.clickCanopyBeds();
        String expectedResult="Beds - Bedroom Furniture - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void dresserTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu2(getDriver());
        waitFor(3);
        homepage.clickDresser();
        String expectedResult="Dressers - Bedroom Furniture - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void armoriesTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu2(getDriver());
        waitFor(3);
        homepage.clickArmories();
        String expectedResult="Armoires & Wardrobes - Bedroom Furniture - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void nightstandsTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu2(getDriver());
        waitFor(3);
        homepage.clickNightstands();
        String expectedResult="Nightstands - Bedroom Furniture - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void mattressCoversTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu2(getDriver());
        waitFor(3);
        homepage.clickMattressCovers();
        String expectedResult="Mattress Covers - Bedding & Bath - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void outdoorTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu2(getDriver());
        waitFor(3);
        homepage.clickOutdoor();
        String expectedResult="Outdoor Lounge Furniture - Patio Furniture - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void dayBedsTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu2(getDriver());
        waitFor(3);
        homepage.clickDayBeds();
        String expectedResult="Daybeds - Bedroom Furniture - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void airFriersTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverSmallKitchen(getDriver());
        waitFor(3);
        homepage.clickAirFriers();
        String expectedResult="Air Fryers - Small Kitchen Appliances - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void cookersTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverSmallKitchen(getDriver());
        waitFor(3);
        homepage.clickCookers();
        String expectedResult="Cookers - Small Kitchen Appliances - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void riceCookerTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverSmallKitchen(getDriver());
        waitFor(3);
        homepage.clickRiceCooker();
        String expectedResult="Rice Cookers - Cookers - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void eggCookerTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverSmallKitchen(getDriver());
        waitFor(3);
        homepage.clickEggCooker();
        String expectedResult="Egg Cookers - Small Kitchen Appliances - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void deepFryersTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverSmallKitchen(getDriver());
        waitFor(3);
        homepage.clickDeepFryers();
        String expectedResult="Deep Fryers - Small Kitchen Appliances - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void blenderTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverSmallKitchen(getDriver());
        waitFor(3);
        homepage.clickBlender();
        String expectedResult="Blenders - Small Kitchen Appliances - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void juicerTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverSmallKitchen(getDriver());
        waitFor(3);
        homepage.clickJuicer();
        String expectedResult="Juicers - Small Kitchen Appliances - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void handMixerTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverSmallKitchen(getDriver());
        waitFor(3);
        homepage.clickHandMixer();
        String expectedResult="Hand Mixers - Mixers - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    //20
    @Test(enabled = true)
    public void standMixerTest(){
        HomeDecor homepage = new HomeDecor(getDriver());
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.hoverOverSmallKitchen(getDriver());
        waitFor(3);
        homepage.clickStandMixer();
        String expectedResult="Stand Mixers - Mixers - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
}

