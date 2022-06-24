package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayHomePage.BusinessAndIndustrial;


public class BusinessAndIndustrialTest extends CommonAPI {


    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);


    @Test(enabled = true)
    public void HeavyEquipmentTest() {
        BusinessAndIndustrial homePage = new BusinessAndIndustrial(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Business & Industrial Floating Menu successfully");
        homePage.clickHeavyEquipment();
        waitFor(3);
        LOG.info("Click Heavy Equipment successfully");
        homePage.clickExcavators();
        LOG.info("click Excavators successfully" );
        String expectedResult = "Excavators for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void HealthCareTest() {
        BusinessAndIndustrial homePage = new BusinessAndIndustrial(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Click Business & Industrial Floating Menu successfully");
        homePage.clickHealthCare();
        waitFor(3);
        LOG.info("Click Healthcare, Lab & Dental successfully");
        homePage.clickMedicalLabDentalSupplies();
        LOG.info("Click Medical, Lab & Dental Supplies successfully");
        String expectedResult = "Medical, Lab & Dental Supplies for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void OfficeTest() {
        BusinessAndIndustrial homePage = new BusinessAndIndustrial(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Click Business & Industrial Floating Menu successfully");
        homePage.clickOffice();
        waitFor(3);
        LOG.info("Click Office Supplies & Equipment successfully");
        homePage.clickOfficeFurniture();
        LOG.info("Click Office Furniture successfully");
        String expectedResult = "Office Furniture for Sale - eBay";
        Assert.assertEquals(expectedResult, getPageTitle());

    }

    @Test(enabled = true)
    public void RestaurantAndFoodServiceTest() {
        BusinessAndIndustrial homePage = new BusinessAndIndustrial(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Click Business & Industrial Floating Menu successfully");
        homePage.clickRestaurantAndFoodService();
        waitFor(3);
        LOG.info("Click Restaurant & Food Service successfully");
        homePage.clickBarBeverageEquipment();
        LOG.info("Click Bar & Beverage Equipment successfully");

    }

    @Test(enabled = true)
    public void HVACRefrigerationTest() {
        BusinessAndIndustrial homePage = new BusinessAndIndustrial(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Click Business & Industrial Floating Menu successfully");
        homePage.clickHvacAndRefrigeration();
        waitFor(3);
        LOG.info("Click HVAC & Refrigeration successfully");
        homePage.clickHvacSystems();
        LOG.info("Click HVAC & Refrigeration Systems successfully");
        String expectedResult = "HVAC & Refrigeration Systems for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void ShippingAndPackagingTest() {
        BusinessAndIndustrial homePage = new BusinessAndIndustrial(getDriver());
        LOG.info("Home Page Login successfully ");
        homePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        LOG.info("Business & Industrial Floating Menu successfully");
        homePage.clickShippingAndPackaging();
        waitFor(3);
        LOG.info("Click Packing & Shipping Supplies successfully");
        homePage.clickLetterFolders();
        LOG.info("Click Letter Folders successfully");
        String expectedResult = "Letter Folders for sale | eBay";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}