package Homedepot;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homedepot.BeddingAndBath;


public class BeddingAndBathTest extends CommonAPI {


    @Test(enabled = true)
    public void towelSetTest(){
        BeddingAndBath homepage = new BeddingAndBath(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickTowelSet();
        String expectedResult="Towel Set - Bath Towels - Towels - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void toothbrushHolderTest(){
        BeddingAndBath homepage = new BeddingAndBath(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickToothbrushHolder();
        String expectedResult="Toothbrush Holders - Bathroom Decor - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void soapDishesTest(){
        BeddingAndBath homepage = new BeddingAndBath(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickSoapDishes();
        String expectedResult="Soap Dishes - Bathroom Decor - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void towelRackTest(){
        BeddingAndBath homepage = new BeddingAndBath(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickTowelRacks();
        String expectedResult="Towel Racks - Bathroom Hardware - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
   @Test(enabled = true)
    public void bathTubsTest(){
        BeddingAndBath homepage = new BeddingAndBath(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickBathTubs();
        String expectedResult="Bathtubs - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void bathroomVanitiesTest(){
        BeddingAndBath homepage = new BeddingAndBath(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickBathroomVanities();
        String expectedResult="Bathroom Vanities - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void bathroomSinkTest(){
        BeddingAndBath homepage = new BeddingAndBath(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickBathroomSinks();
        String expectedResult="Bathroom Sinks - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void bathRobesTest(){
        BeddingAndBath homepage = new BeddingAndBath(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickBathRobes();
        String expectedResult="Bath Robes - Bedding & Bath - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void bathroomRugsTest(){
        BeddingAndBath homepage = new BeddingAndBath(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickBathroomRugs();
        String expectedResult="Bathroom Rugs & Bath Mats - Bedding & Bath - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void electricBlanketsTest(){
        BeddingAndBath homepage = new BeddingAndBath(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickElectricBlankets();
        String expectedResult="Electric Blankets - Blankets - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

}
