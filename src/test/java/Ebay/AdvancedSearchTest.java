package Ebay;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ebay.AdvancedSearch;


public class AdvancedSearchTest extends CommonAPI {



    @Test(enabled =true)
    public void AdvancedSearchTest1() {
        AdvancedSearch homepage = new AdvancedSearch(getDriver());
        waitFor(3);
        homepage.clickAdvancedBtn();
        homepage.enterkeyWords();
        homepage.excludeWord();
        homepage.clickSearchBtn();
        String expectedResult = "Haier washer -portable for sale: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void AdvancedSearchTest2() {
        AdvancedSearch homepage = new AdvancedSearch(getDriver());
        waitFor(3);
        homepage.clickAdvancedBtn();
        homepage.enterkeyWords2();
        homepage.excludeWord2();
        homepage.checkBoxPrice();
        homepage.typeMinimumPrice();
        homepage.typeMaximumPrice();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1400)", "");
        homepage.clickSearchBtnLowerLnk();
        String expectedResult = "Dell Laptop -inspiron for sale: Search Result | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void FindStoresTest() {
        AdvancedSearch homepage = new AdvancedSearch(getDriver());
        waitFor(3);
        homepage.clickAdvancedBtn();
        homepage.clickFindStores();
        homepage.searchElementAndEnter("139 Studio NYC");
        homepage.clickStore();
        String expectedResult = "139 Studio NYC | eBay Stores";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void ClearOptionsTest() {
        AdvancedSearch homepage = new AdvancedSearch(getDriver());

        waitFor(3);
        homepage.clickAdvancedBtn();
        homepage.enterkeyWords();
        homepage.excludeWord();
        homepage.checkBoxPrice();
        homepage.typeMinimumPrice();
        homepage.typeMaximumPrice();
        waitFor(5);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1400)", "");
        homepage.clickClearOptions ();
        String expectedResult = "eBay Search: Advanced Search";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void SearchByItemNumberTest() {
        AdvancedSearch homepage = new AdvancedSearch(getDriver());
        waitFor(3);
        homepage.clickAdvancedBtn();
        homepage.clickByItemNumber();
        homepage.typeItemAndEnter("195111557159");
        String expectedResult = "eBay Search: Advanced Search";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void SearchOnEbayMotorsTest() {
        AdvancedSearch homepage = new AdvancedSearch(getDriver());
        waitFor(3);
        homepage.clickAdvancedBtn();
        homepage.clickOnEbayMotors();
        homepage.selectPartsAccessories();
        waitFor(3);
        homepage.selectVehicleMake();
        homepage.selectAudi();
        waitFor(3);
        homepage.selectVehicleModel();
        homepage.selectQ7();
        waitFor(3);
        homepage.clickSearch();
        String expectedResult = "ATV, Side-by-Side & UTV Parts & Accessories | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }
}