package Ebay;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayHomePage.AdvancedSearch;


public class AdvancedSearchTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled =true)
    public void AdvancedSearchTest1() {
        AdvancedSearch homepage = new AdvancedSearch(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homepage.clickAdvancedBtn();
        LOG.info("Click Advanced button Successfully ");
        homepage.enterkeyWords();
        LOG.info("Type Key Words Successfully ");
        homepage.excludeWord();
        LOG.info("Type Exclude Words Successfully ");
        homepage.clickSearchBtn();
        LOG.info("click Search Button Successfully ");
        String expectedResult = "Haier washer -portable for sale: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void AdvancedSearchTest2() {
        AdvancedSearch homepage = new AdvancedSearch(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homepage.clickAdvancedBtn();
        LOG.info("Click Advanced button Successfully ");
        homepage.enterkeyWords2();
        LOG.info("Type Key Words Successfully ");
        homepage.excludeWord2();
        LOG.info("Type Exclude Words Successfully ");
        homepage.checkBoxPrice();
        LOG.info("check Box Successfully ");
        homepage.typeMinimumPrice();
        LOG.info("Type Minimum Price Successfully ");
        homepage.typeMaximumPrice();
        LOG.info("Type Maximum Price Successfully ");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1400)", "");
        LOG.info("Type Exclude WordsPage Scroll Down Successfully ");
        homepage.clickSearchBtnLowerLnk();
        LOG.info("click Search Button Successfully ");
        String expectedResult = "Dell Laptop -inspiron for sale: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void FindStoresTest() {
        AdvancedSearch homepage = new AdvancedSearch(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homepage.clickAdvancedBtn();
        LOG.info("Click Advanced button Successfully ");
        homepage.clickFindStores();
        LOG.info("Click find Store Successfully ");
        homepage.searchElementAndEnter("139 Studio NYC");
        LOG.info(" type and Enter Successfully ");
        homepage.clickStore();
        LOG.info("click Store Successfully ");
        String expectedResult = "139 Studio NYC | eBay Stores";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void ClearOptionsTest() {
        AdvancedSearch homepage = new AdvancedSearch(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homepage.clickAdvancedBtn();
        LOG.info("Click Advanced button Successfully ");
        homepage.enterkeyWords();
        LOG.info("Type Keywords Successfully ");
        homepage.excludeWord();
        LOG.info("Type Exclude Words Successfully ");
        homepage.checkBoxPrice();
        LOG.info("Check Box Successfully ");
        homepage.typeMinimumPrice();
        LOG.info("type Minimum Price Successfully ");
        homepage.typeMaximumPrice();
        waitFor(5);
        LOG.info("Type Maximum Price Successfully ");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1400)", "");
        LOG.info("Page Scroll down Successfully ");
        homepage.clickClearOptions ();
        LOG.info(" click Clear Option Successfully ");
        String expectedResult = "eBay Search: Advanced Search";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void SearchByItemNumberTest() {
        AdvancedSearch homepage = new AdvancedSearch(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homepage.clickAdvancedBtn();
        LOG.info("Click Advanced button Successfully ");
        homepage.clickByItemNumber();
        LOG.info("Click By Item Number Successfully ");
        homepage.typeItemAndEnter("195111557159");
        LOG.info("Type Item Number Successfully ");
        String expectedResult = "eBay Search: Advanced Search";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void SearchOnEbayMotorsTest() {
        AdvancedSearch homepage = new AdvancedSearch(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homepage.clickAdvancedBtn();
        LOG.info("Click Advanced button Successfully ");
        homepage.clickOnEbayMotors();
        LOG.info("Click On ebay Motors Successfully ");
        homepage.selectPartsAccessories();
        waitFor(3);
        LOG.info(" Select Parts Accessories Successfully ");
        homepage.selectVehicleMake();
        LOG.info("Select Vehicle Successfully ");
        homepage.selectAudi();
        waitFor(3);
        LOG.info("Select Audi Successfully ");
        homepage.selectVehicleModel();
        LOG.info("Select Vehicle Model Successfully ");
        homepage.selectQ7();
        waitFor(3);
        LOG.info("Select Q7 Successfully ");
        homepage.clickSearch();
        LOG.info("Click Search Successfully ");
        String expectedResult = "ATV, Side-by-Side & UTV Parts & Accessories | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }
}