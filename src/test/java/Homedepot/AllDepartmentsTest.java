package Homedepot;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homedepot.AllDepartments;



public class AllDepartmentsTest extends CommonAPI {


    @Test(enabled = true)
    public void electronicsTest(){
        AllDepartments homepage = new AllDepartments(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.clickElectronics();
        String expectedResult="Doors & Windows - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
   @Test(enabled = true)
    public void paintTest(){
        AllDepartments homepage = new AllDepartments(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.clickPaint();
        String expectedResult="Paint - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void cleaningTest(){
        AllDepartments homepage = new AllDepartments(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.clickCleaning();
        String expectedResult="Building Materials - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void smartHomeTest(){
        AllDepartments homepage = new AllDepartments(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.clickSmartHome();
        String expectedResult = "Smart Home - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void plumbingTest(){
        AllDepartments homepage = new AllDepartments(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.clickPlumbing();
        String expectedResult = "Plumbing - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void buildingMaterialsTest(){
        AllDepartments homepage = new AllDepartments(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.clickBuildingMaterials();
        waitFor(3);
        homepage.clickCeilings();
        String expectedResult = "Ceilings - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void appliancesTest(){
        AllDepartments homepage = new AllDepartments(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.clickAppliances();
        waitFor(3);
        homepage.clickLaundryCenters();
        String expectedResult = "Laundry Centers - Washers &amp; Dryers - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void hardwareTest(){
        AllDepartments homepage = new AllDepartments(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.clickHardware();
        waitFor(3);
        homepage.clickSmartLocks();
        String expectedResult = "Smart Locks - Smart Home Security - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void lightingTest(){
        AllDepartments homepage = new AllDepartments(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.clickLighting();
        waitFor(3);
        homepage.clickTrackLighting();
        String expectedResult = "Track Lighting - Lighting - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void storageTest(){
        AllDepartments homepage = new AllDepartments(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.clickStorage();
        waitFor(3);
        homepage.clickGarageCabinets();
        String expectedResult = "Garage Cabinets - Garage Storage - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
}
