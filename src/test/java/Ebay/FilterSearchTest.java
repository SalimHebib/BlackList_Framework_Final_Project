package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ebay.FilterSearch;

public class FilterSearchTest extends CommonAPI {



    @Test(enabled = true)
    public void SmartWatchTest() {
        FilterSearch homepage = new FilterSearch(getDriver());
        waitFor(3);
        homepage.searchElementAndEnter("Smart Watch");
        waitFor(3);
        homepage.selectSamsung();
        waitFor(3);
        homepage.selectBlack();
        String expectedResult = "smart watch: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void SmartTvTest() {
        FilterSearch homepage = new FilterSearch(getDriver());
        waitFor(3);
        homepage.searchElementAndEnter("Smart Tv");
        homepage.selectCondition();
        homepage.selectNew();
        waitFor(3);
        homepage.selectScreenSize();
        waitFor(3);
        homepage.selectLg();
        String expectedResult = "smart tv: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void GolfShoesTest() {
        FilterSearch homepage = new FilterSearch(getDriver());
        waitFor(3);
        homepage.searchElementAndEnter("golf shoes");
        waitFor(3);
        homepage.selectSize();
        waitFor(3);
        homepage.selectSketcher();
        String expectedResult = "golf shoes: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void philipsSonyCareTest() {
        FilterSearch homepage = new FilterSearch(getDriver());
        waitFor(3);
        homepage.searchElementAndEnter("philips sonicare");
        waitFor(3);
        homepage.selectBrand();
        homepage.clickSlide();
        waitFor(3);
        homepage.selectModel();
        String expectedResult = "philips sonicare: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void OralBTest() {
        FilterSearch homepage = new FilterSearch(getDriver());
        waitFor(3);
        homepage.searchElementAndEnter("oral-b - io series 9");
        waitFor(3);
        homepage.selectCondition();
        waitFor(3);
        homepage.selectUsed();
        waitFor(3);
        String expectedResult = "oral-b - io series 9: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void hairDryerTest() {
        FilterSearch homepage = new FilterSearch(getDriver());
        waitFor(3);
        homepage.searchElementAndEnter("hair dryer");
        waitFor(3);
        homepage.selectCondition();
        waitFor(3);
        homepage.selectNew();
        waitFor(3);
        homepage.selectBrushDryer();
        waitFor(3);
        homepage.selectDyson();
        String expectedResult = "hair dryer: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}