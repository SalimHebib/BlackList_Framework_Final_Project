package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayHomePage.CollectiblesAndArt;


public class CollectiblesArtTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);


    @Test(enabled = true)
    public void ArtTest() {
        CollectiblesAndArt homePage = new CollectiblesAndArt(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Collectibles and Art Floating Menu successfully ");
        homePage.clickArtPainting();
        waitFor(3);
        LOG.info("Click Art Painting successfully ");
        homePage.clickNftS();
        LOG.info("Click Art NFTs successfully ");
        String expectedResult = "Art NFTs for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void MorganDollarsTest() {
        CollectiblesAndArt homePage = new CollectiblesAndArt(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Collectibles and Art Floating Menu successfully ");
        homePage.clickMorgan();
        waitFor(3);
        LOG.info("Click Morgan Dollars successfully ");
        homePage.clickNative();
        LOG.info("Click Native American Dollars successfully ");
        String expectedResult = "Native American Dollars (2000-Now) for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void AntiqueTest() {
        CollectiblesAndArt homePage = new CollectiblesAndArt(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Collectibles and Art Floating Menu successfully ");
        homePage.clickAntique();
        waitFor(3);
        LOG.info("Click Antique successfully ");
        homePage.clickManuscript();
        LOG.info("Click Antique Manuscripts successfully ");
        String expectedResult = "Antique Manuscripts for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void BullionTest() {
        CollectiblesAndArt homePage = new CollectiblesAndArt(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Collectibles and Art Floating Menu successfully ");
        homePage.clickBullion();
        waitFor(3);
        LOG.info("Click Bullion successfully ");
        homePage.clickGoldCoin();
        LOG.info("Click Gold Bullion successfully ");
        String expectedResult = "Gold Bullion Coins for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void BaseballCardsTest() {
        CollectiblesAndArt homePage = new CollectiblesAndArt(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Collectibles and Art Floating Menu successfully ");
        homePage.clickBaseBalls();
        waitFor(3);
        LOG.info("Click Baseball Trading Cards successfully ");
        homePage.clickPacks();
        LOG.info("Click Baseball Packs Cards successfully");
        String expectedResult = "Baseball Sealed Trading Card Packs for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void ComicsTest() {
        CollectiblesAndArt homePage = new CollectiblesAndArt(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Collectibles and Art Floating Menu successfully ");
        homePage.clickComics();
        waitFor(3);
        LOG.info("Click eBay Comics Bookstore successfully ");
        homePage.clickModernAge();
        LOG.info("Click Modern Age Comics (1992-Now) successfully ");
        String expectedResult = "Modern Age Comics (1992-Now) for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}