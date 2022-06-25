package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayHomePage.SearchHomePage;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class SearchTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled = true)
    public void SearchIPhoneTest() {
        SearchHomePage homePage = new SearchHomePage(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.searchElementAndEnter("iphone 13 pro max");
        LOG.info("Type And Enter successfully ");
        homePage.selectOptionFromMenuDropdown("Cell Phones & Accessories");

    }

    @Test(enabled = true)
    public void SearchSkinCareProductsTest() {
        SearchHomePage homePage = new SearchHomePage(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.searchElementAndEnter("Proactive");
        LOG.info("Type And Enter Successfully");
        homePage.selectOptionFromMenuDropdown("Acne & Blemish Treatments");


    }

    @Test(enabled = true)
    public void getDropdownList() {
        SearchHomePage homePage = new SearchHomePage(getDriver());
        LOG.info("Home Page Login successfully ");
        for (String str : homePage.getHomePageDropdownOptions()) {
            System.out.println(str);
        }
    }

    @Test(enabled = true)
    public void selectArtOptionFromDropdown() {
        SearchHomePage homePage = new SearchHomePage(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.selectOptionFromMenuDropdownWithSelectOptions("Art");


    }

    @Test(enabled = true)
    public void searchMultipleItems() {
        ExcelReader excelReader = new ExcelReader(Utility.currentDir + "/data/TestData.xlsx");
        List<String> items = excelReader.getEntireColumnForGivenHeader("Sheet1", "item");
        SearchHomePage homePage = new SearchHomePage(getDriver());
        for (String item : items) {
            homePage.searchElementAndEnter(item);
            homePage.clearSearchField();
        }
    }

    @Test
    public void SearchWireLessProductsTest() {
        SearchHomePage homePage = new SearchHomePage(getDriver());
        LOG.info("Home Page Login successfully ");
        waitFor(3);
        homePage.searchElementAndEnter("wireless keyboard and mouse");
        waitFor(3);
        homePage.clickApple();
        waitFor(3);
        String expectedResult = "wireless keyboard and mouse: Search Result | eBay";
        Assert.assertEquals(expectedResult,getPageTitle());


    }
}