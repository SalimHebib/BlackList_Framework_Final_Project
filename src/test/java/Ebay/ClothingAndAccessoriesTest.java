package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ebay.ClothingAndAccessories;


public class ClothingAndAccessoriesTest extends CommonAPI {




    @Test(enabled = true)
    public void DesignerHandBagsTest() {
        ClothingAndAccessories homePage = new ClothingAndAccessories(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickDesignerHandBags();
        waitFor(3);
        homePage.clickLouisVuitton();
        String expectedResult = "Louis Vuitton Bags & Handbags for Women | Authenticity Guaranteed | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void WomenDressesTest() {
        ClothingAndAccessories homePage = new ClothingAndAccessories(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickWomenDresses();
        waitFor(3);
        homePage.clickZara();
        String expectedResult = "Zara Women's Dresses for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void MenAccessoriesTest() {
        ClothingAndAccessories homePage = new ClothingAndAccessories(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickMenAccessories();
        waitFor(3);
        homePage.clickHats();
        String expectedResult = "Men's Hats for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void GirlsClothingTest() {
        ClothingAndAccessories homePage = new ClothingAndAccessories(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickGirlsClothing();
        waitFor(3);
        homePage.clickDresses();
        String expectedResult = "Girls' Dresses for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void BoysClothingTest() {
        ClothingAndAccessories homePage = new ClothingAndAccessories(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickBoysClothing();
        waitFor(3);
        homePage.clickShirtAndTShirt();
        String expectedResult = "Boys' Tops, Shirts & T-Shirts for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void CollectibleSneakersTest() {
        ClothingAndAccessories homePage = new ClothingAndAccessories(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickCollectibleSneakers();
        waitFor(3);
        homePage.clickJordan();
        homePage.clickAirJorden10();
        String expectedResult = "Jordan 10 for Sale | Authenticity Guaranteed | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}
