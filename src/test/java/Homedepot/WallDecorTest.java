package Homedepot;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homedepot.WallDecor;

public class WallDecorTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled = true)
    public void bathroomRugsTest(){
        WallDecor homepage = new WallDecor(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickWallMirrors();
        String expectedResult="Wall Mirrors - Mirrors - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void wallSingTest(){
        WallDecor homepage = new WallDecor(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickWallSigns();
        String expectedResult="Wall Signs - Wall Decor - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void wallFrameTest(){
        WallDecor homepage = new WallDecor(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickWallFrame();
        String expectedResult="Picture Frames - Home Decor - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void glassWallArtTest(){
        WallDecor homepage = new WallDecor(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickGlassWallArt();
        String expectedResult="Glass - Wall Art - Wall Decor - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void floorMirrorTest(){
        WallDecor homepage = new WallDecor(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickFloorMirror();
        String expectedResult="Floor Mirrors - Mirrors - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void woodWallArtTest(){
        WallDecor homepage = new WallDecor(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickWoodWallArt();
        String expectedResult="Wood Work - Wall Sculptures - Wall Decor - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void paintTableTest(){
        WallDecor homepage = new WallDecor(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickPaintTable();
        String expectedResult="Paintable - Wallpaper - Home Decor - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    @Test(enabled = true)
    public void corkBoardTest(){
        WallDecor homepage = new WallDecor(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickCorkBord();
        String expectedResult="Cork Board - Memo Boards - Wall Decor - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }

    @Test(enabled = true)
    public void wallPaperRollTest(){
        WallDecor homepage = new WallDecor(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickWallPaperRoll();
        String expectedResult="Wallpaper Rolls - Wallpaper - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
    //10
    @Test(enabled = true)
    public void mixedMediaTest(){
        WallDecor homepage = new WallDecor(getDriver());
        homepage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        homepage.hoverOverFloatingMenu1(getDriver());
        waitFor(3);
        homepage.clickMixedMedia();
        String expectedResult="Mixed Media - Wall Art - The Home Depot";
        Assert.assertEquals(expectedResult,getPageTitle());
    }
}
