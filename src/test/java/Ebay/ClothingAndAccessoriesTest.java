package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayHomePage.ClothingAndAccessories;


public class ClothingAndAccessoriesTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);


    @Test(enabled = true)
    public void DesignerHandBagsTest() {
        ClothingAndAccessories homePage = new ClothingAndAccessories(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Clothing And Accessories Floating Menu successfully");
        homePage.clickDesignerHandBags();
        waitFor(3);
        LOG.info("Click Designer Handbags successfully ");
        homePage.clickLouisVuitton();
        LOG.info("Click Louis Vuitton Bags & Handbags successfully");
        String expectedResult = "Louis Vuitton Bags & Handbags for Women | Authenticity Guaranteed | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void WomenDressesTest() {
        ClothingAndAccessories homePage = new ClothingAndAccessories(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Clothing And Accessories Floating Menu successfully");
        homePage.clickWomenDresses();
        waitFor(3);
        LOG.info("Click Women's Dresses successfully");
        homePage.clickZara();
        LOG.info("Click Zara Women's Dresses successfully ");
        String expectedResult = "Zara Women's Dresses for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void MenAccessoriesTest() {
        ClothingAndAccessories homePage = new ClothingAndAccessories(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Clothing And Accessories Floating Menu successfully");
        homePage.clickMenAccessories();
        waitFor(3);
        LOG.info("Click Men's Accessories successfully ");
        homePage.clickHats();
        LOG.info("Click Men's Hats successfully ");
        String expectedResult = "Men's Hats for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void GirlsClothingTest() {
        ClothingAndAccessories homePage = new ClothingAndAccessories(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Clothing And Accessories Floating Menu successfully ");
        homePage.clickGirlsClothing();
        waitFor(3);
        LOG.info("Click Girls' Clothing (Sizes 4 & Up) successfully ");
        homePage.clickDresses();
        LOG.info("Girls' Dresses successfully ");
        String expectedResult = "Girls' Dresses for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void BoysClothingTest() {
        ClothingAndAccessories homePage = new ClothingAndAccessories(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Clothing And Accessories Floating Menu successfully ");
        homePage.clickBoysClothing();
        waitFor(3);
        LOG.info("Click Boys' Clothing (Sizes 4 & Up) successfully ");
        homePage.clickShirtAndTShirt();
        LOG.info("Click Boys' Tops, Shirts & T-Shirts successfully ");
        String expectedResult = "Boys' Tops, Shirts & T-Shirts for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void CollectibleSneakersTest() {
        ClothingAndAccessories homePage = new ClothingAndAccessories(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Clothing And Accessories Floating Menu successfully ");
        homePage.clickCollectibleSneakers();
        waitFor(3);
        LOG.info("Click Sneakers successfully ");
        homePage.clickJordan();
        LOG.info("Click AirJordan successfully");
        homePage.clickAirJorden10();
        LOG.info("Click Jordan 10 successfully ");
        String expectedResult = "Jordan 10 for Sale | Authenticity Guaranteed | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}
