package pages.Homedepot;

import base.CommonAPI;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(HomePage.class);

    @FindBy(xpath = "//*[@id='headerSearch']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id='headerSearchButton']/svg")
    private WebElement searchBtn;

    @FindBy(xpath = "//*[@id='ColumnRail_thd_20cf']/div/div[3]/nav/ul/li[2]/a")
    private WebElement Chandeliers;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div/div[6]/div[1]/div/div[3]/div/div[2]/div[1]/ul/li[2]/a")
    private WebElement PatioFurniture;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div/div[6]/div[1]/div/div[3]/div/div[2]/div[1]/ul/li[2]/a")
    private WebElement BedroomFurniture;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div/div[6]/div[1]/div/div[3]/div/div[2]/ul/li[1]/a")
    private WebElement Flooring;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div/div[6]/div[1]/div/div[3]/div/div[2]/div[1]/ul/li[2]/a")
    private WebElement Kitchen;

    @FindBy(xpath = "//*[@id='ColumnRail_thd_20cf']/div/div[1]/nav/ul/li[1]/a")
    private WebElement FloorTile;

    @FindBy(xpath = "//*[@id='browse-search-dimensions']/div/div[3]/div/div[2]/ul/ul/li[1]/a")
    private WebElement GardenFencing;

    @FindBy(xpath = "//*[@id='ColumnRail_thd_20cf']/div/div[1]/nav/ul/li[3]/a")
    private WebElement Pools;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div/div[6]/div[1]/div/div[3]/div/div[2]/div[1]/ul/li[1]/a")
    private WebElement DoorMat;

    @FindBy(xpath = "//*[@id='ColumnRail_thd_20cf']/div/div[4]/nav/ul/li[3]/a")
    private WebElement KamadoGrills;





    public HomePage(WebDriver driver){PageFactory.initElements(driver, this);}



    public void clickSearchBtn(){click(searchBtn);}
    public void clearSearchField(){clear(searchField);}
    public void searchElementAndEnter(String item) {typeAndEnter(searchField, item);
     LOG.info("search element and enter properly");}
    public void clickChandeliers(){click(Chandeliers);
     LOG.info(" click chandeliers successfully");}
    public void clickPatioFurniture(){click(PatioFurniture);
    LOG.info(" click patio furniture successfully");}
    public void clickBedroomFurniture(){click(BedroomFurniture);
     LOG.info(" click bedroom furniture successfully");}
    public void clickFlooring(){click(Flooring);
     LOG.info(" click flooring successfully");}
    public void clickKitchen(){click(Kitchen);
     LOG.info(" click kitchen successfully");}
    public void clickFloorTile(){click(FloorTile);
     LOG.info(" click floor tile successfully");}
    public void clickGardenFencing(){click(GardenFencing);
     LOG.info(" click garden fencing successfully");}
    public void clickPools(){click(Pools);
     LOG.info(" click pools successfully");}
    public void clickDoorMat(){click(DoorMat);
     LOG.info(" click door mat successfully");}
    public void clickKamadoGrills(){click(KamadoGrills);
     LOG.info(" click grills successfully");}


    }