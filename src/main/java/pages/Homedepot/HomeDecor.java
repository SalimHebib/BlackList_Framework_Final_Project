package pages.Homedepot;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeDecor extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(HomeDecor.class);

    @FindBy(xpath = "//*[@id='header']/div/div[4]/div/ul/li[2]/a")
    private WebElement floatingMenu1;

    @FindBy(xpath = "//*[@id='furniture']")
    private WebElement floatingMenu2;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[1]/div[1]/div[4]/a")
    private WebElement loveSeats;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[1]/div[1]/div[3]/a")
    private WebElement sofas;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[1]/div[1]/div[12]/a")
    private WebElement TVStand;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[1]/div[1]/div[5]/a")
    private WebElement sofaBeds;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div/div[6]/div[1]/div/div[3]/div/div[2]/div[1]/ul/li[1]/a")
    private WebElement furniture;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[3]/div[1]/div[3]/a")
    private WebElement beds;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div/div[6]/div[1]/div/div[3]/div/div[2]/ul/li[3]/a")
    private WebElement canopyBeds;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[3]/div[1]/div[5]/a")
    private WebElement dresser;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[3]/div[1]/div[7]/a")
    private WebElement armoires;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[3]/div[1]/div[8]/a")
    private WebElement nightstands;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[4]/div[1]/div[3]/a")
    private WebElement mattressCovers;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[4]/div[2]/div[3]/a")
    private WebElement outdoor;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[3]/div[1]/div[10]/a")
    private WebElement dayBeds;

    @FindBy(xpath = "//*[@id='small-kitchen-appliances']")
    private WebElement smallKitchen;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[1]/div[1]/div[3]/a")
    private WebElement airFriers;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[1]/div[1]/div[4]/a")
    private WebElement cookers;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[1]/div[1]/div[10]/a")
    private WebElement riceCooker;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[1]/div[1]/div[9]/a")
    private WebElement eggCooker;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[1]/div[1]/div[8]/a")
    private WebElement deepFryers;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[2]/div[2]/div[3]/a")
    private WebElement blender;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[2]/div[2]/div[6]/a")
    private WebElement juicer;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[2]/div[1]/div[5]/a")
    private WebElement handMixer;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[2]/div[1]/div[3]/a")
    private WebElement standMixer;



    public HomeDecor(WebDriver driver){PageFactory.initElements(driver, this);}

    public void clickLoveSeats(){click(loveSeats);}
    public void hoverOverFloatingMenu1(WebDriver driver){hoverOver(driver,floatingMenu1);}
    public void hoverOverFloatingMenu2(WebDriver driver){hoverOver(driver,floatingMenu2);}
    public void clickSofas(){click(sofas);
     LOG.info(" click sofas successfully");}
    public void clickTVStand(){click(TVStand);
     LOG.info(" click TV stand successfully");}
    public void clickSofaBeds(){click(sofaBeds);
     LOG.info(" click sofa beds successfully");}
    public void clickFurniture(){click(furniture);
     LOG.info(" click furniture successfully");}
    public void clickBeds(){click(beds);
     LOG.info(" click beds successfully");}
    public void clickCanopyBeds(){click(canopyBeds);
     LOG.info(" click canopy beds successfully");}
    public void clickDresser(){click(dresser);
     LOG.info(" click dresser successfully");}
    public void clickArmories(){click(armoires);
     LOG.info(" click armories successfully");}
    public void clickNightstands(){click(nightstands);
     LOG.info(" click night stands successfully");}
    public void clickMattressCovers(){click(mattressCovers);
     LOG.info(" click mattress covers successfully");}
    public void clickOutdoor(){click(outdoor);
     LOG.info(" click outdoor successfully");}
    public void clickDayBeds(){click(dayBeds);
     LOG.info(" click daybeds successfully");}
    public void hoverOverSmallKitchen(WebDriver driver){hoverOver(driver,smallKitchen);
     LOG.info(" small kitchen appears successfully");}
    public void clickAirFriers(){click(airFriers);
     LOG.info(" click air friers successfully");}
    public void clickCookers(){click(cookers);
     LOG.info(" click cookers successfully");}
    public void clickRiceCooker(){click(riceCooker);
     LOG.info(" click rice cookers successfully");}
    public void clickEggCooker(){click(eggCooker);
     LOG.info(" click egg cooker successfully");}
    public void clickDeepFryers(){click(deepFryers);
     LOG.info(" click deep fryers successfully");}
    public void clickBlender(){click(blender);
     LOG.info(" click blender successfully");}
    public void clickJuicer(){click(juicer);
     LOG.info(" click juicer successfully");}
    public void clickHandMixer(){click(handMixer);
     LOG.info(" click hand mixer successfully");}
    public void clickStandMixer(){click(standMixer);
     LOG.info(" click stand mixer successfully");}



}
