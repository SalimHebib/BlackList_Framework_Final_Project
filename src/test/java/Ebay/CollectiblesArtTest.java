package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ebay.CollectiblesAndArt;


public class CollectiblesArtTest extends CommonAPI {




    @Test(enabled = true)
    public void ArtTest() {
        CollectiblesAndArt homePage = new CollectiblesAndArt(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickArtPainting();
        waitFor(3);
        homePage.clickNftS();
        String expectedResult = "Art NFTs for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void MorganDollarsTest() {
        CollectiblesAndArt homePage = new CollectiblesAndArt(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickMorgan();
        waitFor(3);
        homePage.clickNative();
        String expectedResult = "Native American Dollars (2000-Now) for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void AntiqueTest() {
        CollectiblesAndArt homePage = new CollectiblesAndArt(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickAntique();
        waitFor(3);
        homePage.clickManuscript();
        String expectedResult = "Antique Manuscripts for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void BullionTest() {
        CollectiblesAndArt homePage = new CollectiblesAndArt(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickBullion();
        waitFor(3);
        homePage.clickGoldCoin();
        String expectedResult = "Gold Bullion Coins for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void BaseballCardsTest() {
        CollectiblesAndArt homePage = new CollectiblesAndArt(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickBaseBalls();
        waitFor(3);
        homePage.clickPacks();
        String expectedResult = "Baseball Sealed Trading Card Packs for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void ComicsTest() {
        CollectiblesAndArt homePage = new CollectiblesAndArt(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickComics();
        waitFor(3);
        homePage.clickModernAge();
        String expectedResult = "Modern Age Comics (1992-Now) for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}