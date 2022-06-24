package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayHomePage.FilterSearch;

public class FilterSearchTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled = true)
    public void SmartWatchTest() {
        FilterSearch homepage = new FilterSearch(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homepage.searchElementAndEnter("Smart Watch");
        LOG.info("Type and enter successfully ");
        waitFor(3);
        homepage.selectSamsung();
        LOG.info("Select Samsung successfully");
        waitFor(3);
        homepage.selectBlack();
        LOG.info("Select Black successfully");
        String expectedResult = "smart watch: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void SmartTvTest() {
        FilterSearch homepage = new FilterSearch(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homepage.searchElementAndEnter("Smart Tv");
        LOG.info("Type and enter successfully ");
        homepage.selectCondition();
        LOG.info("Select condition successfully");
        homepage.selectNew();
        waitFor(3);
        LOG.info("Select New successfully");
        homepage.selectScreenSize();
        waitFor(3);
        LOG.info("Select screen size successfully");
        homepage.selectLg();
        LOG.info("Select Lg successfully");
        String expectedResult = "smart tv: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void GolfShoesTest() {
        FilterSearch homepage = new FilterSearch(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homepage.searchElementAndEnter("golf shoes");
        LOG.info("Type and enter successfully ");
        waitFor(3);
        homepage.selectSize();
        LOG.info("Select Size successfully");
        waitFor(3);
        homepage.selectSketcher();
        LOG.info("Select Sketcher successfully");
        String expectedResult = "golf shoes: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void philipsSonyCareTest() {
        FilterSearch homepage = new FilterSearch(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homepage.searchElementAndEnter("philips sonicare");
        LOG.info("Type and enter successfully ");
        waitFor(3);
        homepage.selectBrand();
        LOG.info("Select Brand successfully");
        homepage.clickSlide();
        waitFor(3);
        LOG.info("Click Slide successfully");
        homepage.selectModel();
        LOG.info("Select Model successfully");
        String expectedResult = "philips sonicare: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void OralBTest() {
        FilterSearch homepage = new FilterSearch(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homepage.searchElementAndEnter("oral-b - io series 9");
        LOG.info("Type and enter successfully ");
        waitFor(3);
        homepage.selectCondition();
        LOG.info("Select Condition successfully");
        waitFor(3);
        homepage.selectUsed();
        LOG.info("Select Used successfully");
        waitFor(3);
        String expectedResult = "oral-b - io series 9: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void hairDryerTest() {
        FilterSearch homepage = new FilterSearch(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homepage.searchElementAndEnter("hair dryer");
        LOG.info("Type and enter successfully ");
        waitFor(3);
        homepage.selectCondition();
        LOG.info("Select Condition successfully");
        waitFor(3);
        homepage.selectNew();
        LOG.info("Select New successfully");
        waitFor(3);
        homepage.selectBrushDryer();
        LOG.info("Select BrushDryer successfully");
        waitFor(3);
        homepage.selectDyson();
        LOG.info("Select Dyson successfully");
        String expectedResult = "hair dryer: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}