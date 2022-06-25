package Homedepot;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homedepot.ProjectsAndIdeas;

public class ProjectsAndIdeasTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled = true)
    public void grillsTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickGrills();
        waitFor(3);
        String expectedResult = "Grill Guides - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void bathroomTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickBathroom();
        waitFor(3);
        String expectedResult = "Bathroom Ideas & Projects - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void homeSafetyTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickHomeSafety();
        waitFor(3);
        String expectedResult = "Home Safety & Security - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void cookingTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickCooking();
        waitFor(3);
        String expectedResult = "Cooking Guides - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void flooringTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickFlooring();
        waitFor(3);
        String expectedResult = "Flooring Ideas & Projects - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void giftIdeasTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickGiftIdeas();
        waitFor(3);
        String expectedResult = "Gift Ideas - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void gardeningTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickGardening();
        waitFor(3);
        String expectedResult = "Garden Ideas & Projects - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void bedroomsTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickBedrooms();
        waitFor(3);
        String expectedResult = "Bathroom Ideas & Projects - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void livingRoomTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickLivingRoom();
        waitFor(3);
        String expectedResult = "Living Room Ideas & Projects - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void paintTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickPaint();
        waitFor(3);
        String expectedResult = "Paint Ideas & Projects - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void packingTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickPacking();
        waitFor(3);
        String expectedResult = "Moving Tips - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void hallwayTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickHallway();
        waitFor(3);
        String expectedResult = "Hallway & Wall Ideas & Projects - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void deckTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickDeck();
        waitFor(3);
        String expectedResult = "Deck & Fence Ideas - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void partiesTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickParties();
        waitFor(3);
        String expectedResult = "Parties & Events - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void plumbingTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickPlumbing();
        waitFor(3);
        String expectedResult = "DIY Plumbing - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }

    @Test(enabled = true)
    public void halloweenTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickHalloween();
        waitFor(3);
        String expectedResult = "Halloween Ideas & Projects - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void christmasTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickChristmas();
        waitFor(3);
        String expectedResult = "Christmas Ideas & Projects - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void thanksGivingTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickThanksGiving();
        waitFor(3);
        String expectedResult = "Thanksgiving Ideas & Projects - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    @Test(enabled = true)
    public void heatingTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickHeating();
        waitFor(3);
        String expectedResult = "Home Heating & Cooling Guides - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
    //20
    @Test(enabled = true)
    public void windowsTest() {
        ProjectsAndIdeas homepage = new ProjectsAndIdeas(getDriver());
        homepage.hoverOverProjects(getDriver());
        waitFor(3);
        homepage.clickWindows();
        waitFor(3);
        String expectedResult = "Windows & Window Treatment Ideas - The Home Depot";
        Assert.assertEquals(expectedResult, getPageTitle());
    }
}
