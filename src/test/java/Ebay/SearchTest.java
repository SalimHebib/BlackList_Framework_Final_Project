package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ebay.SearchHomePage;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class SearchTest extends CommonAPI {



    @Test(enabled = true)
    public void SearchIPhoneTest() {
        SearchHomePage homePage = new SearchHomePage(getDriver());
        waitFor(3);
        homePage.searchElementAndEnter("iphone 13 pro max");
        homePage.selectOptionFromMenuDropdown("Cell Phones & Accessories");

    }

    @Test(enabled = true)
    public void SearchSkinCareProductsTest() {
        SearchHomePage homePage = new SearchHomePage(getDriver());
        waitFor(3);
        homePage.searchElementAndEnter("Proactive");
        homePage.selectOptionFromMenuDropdown("Acne & Blemish Treatments");


    }

    @Test(enabled = true)
    public void getDropdownList() {
        SearchHomePage homePage = new SearchHomePage(getDriver());
        for (String str : homePage.getHomePageDropdownOptions()) {
            System.out.println(str);
        }
    }

    @Test(enabled = true)
    public void selectArtOptionFromDropdown() {
        SearchHomePage homePage = new SearchHomePage(getDriver());
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
        waitFor(3);
        homePage.searchElementAndEnter("wireless keyboard and mouse");
        waitFor(3);
        homePage.clickApple();
        waitFor(3);
        String expectedResult = "wireless keyboard and mouse: Search Result | eBay";
        Assert.assertEquals(expectedResult,getPageTitle());


    }
}