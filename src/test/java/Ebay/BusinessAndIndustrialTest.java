package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ebay.BusinessAndIndustrial;


public class BusinessAndIndustrialTest extends CommonAPI {





    @Test(enabled = true)
    public void HeavyEquipmentTest() {
        BusinessAndIndustrial homePage = new BusinessAndIndustrial(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickHeavyEquipment();
        waitFor(3);
        homePage.clickExcavators();
        String expectedResult = "Excavators for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void HealthCareTest() {
        BusinessAndIndustrial homePage = new BusinessAndIndustrial(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickHealthCare();
        waitFor(3);
        homePage.clickMedicalLabDentalSupplies();
        String expectedResult = "Medical, Lab & Dental Supplies for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void OfficeTest() {
        BusinessAndIndustrial homePage = new BusinessAndIndustrial(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickOffice();
        waitFor(3);
        homePage.clickOfficeFurniture();
        String expectedResult = "Office Furniture for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void RestaurantAndFoodServiceTest() {
        BusinessAndIndustrial homePage = new BusinessAndIndustrial(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickRestaurantAndFoodService();
        waitFor(3);
        homePage.clickBarBeverageEquipment();
        String expectedResult = "Bar Beverage Equipment for sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void HVACRefrigerationTest() {
        BusinessAndIndustrial homePage = new BusinessAndIndustrial(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickHvacAndRefrigeration();
        waitFor(3);
        homePage.clickHvacSystems();
        String expectedResult = "HVAC & Refrigeration Systems for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void ShippingAndPackagingTest() {
        BusinessAndIndustrial homePage = new BusinessAndIndustrial(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homePage.clickShippingAndPackaging();
        waitFor(3);
        homePage.clickLetterFolders();
        String expectedResult = "Letter Folders for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}