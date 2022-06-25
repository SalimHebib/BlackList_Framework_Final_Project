package pages.Homedepot;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WallDecor extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(WallDecor.class);

    @FindBy(xpath = "//*[@id='header']/div[1]/div[4]/div/ul/li[2]/a")
    private WebElement floatingMenu;

    @FindBy(xpath = "//*[@id='wall-decor']")
    private WebElement floatingMenu1;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[2]/div[1]/div[7]/a")
    private WebElement wallMirrors;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[2]/div[1]/div[6]/a")
    private WebElement wallSigns;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[2]/div[1]/div[10]/a")
    private WebElement wallFrame;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[3]/div[1]/div[11]/a")
    private WebElement glassWallArt;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[2]/div[2]/div[3]/a")
    private WebElement floorMirror;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[3]/div[1]/div[10]/a")
    private WebElement woodWallArt;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[1]/div[1]/div[10]/a")
    private WebElement paintTable;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[4]/div[2]/div[3]/a")
    private WebElement corkBoard;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[1]/div[1]/div[3]/a")
    private WebElement wallPaperRoll;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[3]/div[1]/div[4]/a")
    private WebElement mixedMedia;



    public WallDecor(WebDriver driver){PageFactory.initElements(driver, this);}

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver,floatingMenu);
    LOG.info("floating menu appears successfully");}
    public void hoverOverFloatingMenu1(WebDriver driver){hoverOver(driver, floatingMenu1);
    LOG.info("floating menu1 appears successfully");}
    public void clickWallMirrors(){click(wallMirrors);
    LOG.info("click wall mirrors successfully");}
    public void clickWallSigns(){click(wallSigns);
     LOG.info("click wall signs successfully");}
    public void clickWallFrame(){click((wallFrame));
     LOG.info("click wall frame successfully");}
    public void clickGlassWallArt(){click(glassWallArt);
     LOG.info("click wall art successfully");}
    public void clickFloorMirror(){click(floorMirror);
     LOG.info("click floor mirror successfully");}
    public void clickWoodWallArt(){click(woodWallArt);
     LOG.info("click wood wall art successfully");}
    public void clickPaintTable(){click(paintTable);
     LOG.info("click paint table successfully");}
    public void clickCorkBord(){click(corkBoard);
     LOG.info("click cork bord successfully");}
    public void clickWallPaperRoll(){click(wallPaperRoll);
     LOG.info("click paper roll successfully");}
    public void clickMixedMedia(){click(mixedMedia);
     LOG.info("click mixed media successfully");}


}
