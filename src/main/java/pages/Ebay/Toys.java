package pages.Ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Toys extends CommonAPI {

    public Toys(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @FindBy(xpath = "//div[6]/div[1]/ul[1]/li[8]/a[1]")
    private WebElement FloatingMenu;

    @FindBy(xpath = "//a[@href='https://www.ebay.com/b/LEGO-Sets-Packs/19006/bn_1920874']")
    private WebElement LegoSets;

    @FindBy(xpath = "//li[35]/div[1]/div[2]/a[1]/h3[1]")
    private WebElement TajMahal;

    @FindBy(xpath = "//*[@href='https://www.ebay.com/b/Dolls-Teddy-Bears/237/bn_1865477']")
    private WebElement DollsTeddyBear;

    @FindBy(xpath = "//*[@id='mainContent']/section[1]/div[2]/a[6]/div[2]")
    private WebElement DollHouses;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[8]/div[2]/div[1]/nav[2]/ul/li[8]/a")
    private WebElement ToysDeals;

    @FindBy(xpath = "//span[1]/button[1]")
    private WebElement ShowFeaturedItems;


    @FindBy(xpath = "//*[@id='s0-2-17-16-6-ebayDneSortDropdown-content-menu']/div[3]/span/span")
    private WebElement HighestFirst;

    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[8]/div[2]/div[1]/nav[1]/ul[1]/li[1]/a[1]")
    private WebElement ActionsFigure;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul[1]/li[7]/a[1]")
    private WebElement MixedLots;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul[1]/li[8]/div[2]/div[1]/nav[1]/ul[1]/li[4]/a[1]")
    private WebElement BuildingToys;

    @FindBy(xpath = "//*[@id=\'mainContent']/div[1]/ul/li[8]/div[2]/div[1]/nav[1]/ul/li[6]/a")
    private WebElement trains;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[3]/a")
    private WebElement RailRoads;



    public void hoverOverFloatingMenu(WebDriver driver) {hoverOver(driver, FloatingMenu);
        LOG.info("Floating Menu Successfully");}

    public void clickLegoSets() {click(LegoSets);
        LOG.info("Click legoSet successfully");}

    public void clickTajMahal() {click(TajMahal);
        LOG.info("Taj Mahal Shown");}

    public void clickDollsTeddyBear() {click(DollsTeddyBear);
        LOG.info("click Dolls Teddy Bear");}

    public void clickToysDeals() {click(ToysDeals);
        LOG.info("Click Toys Successfully");}

    public void clickHighestFirst(){click(HighestFirst);
            LOG.info("Select Highest First  Successfully");
    }
    public void clickShowFeaturedItems(){click(ShowFeaturedItems);
        LOG.info("Click Show Featured Item Successfully");}

    public void clickActionsFigure(){click(ActionsFigure);
        LOG.info("Click Actions Figure Successfully");}

    public void clickBuildingToys(){click(BuildingToys);
        LOG.info("Click building toys Successfully ");}

    public void clickMixedLots(){click(MixedLots);
        LOG.info("Click Mixed Lots Successfully");}

    public void clickTrains(){click(trains);
        LOG.info("Click Trains Successfully");}

    public void clickRailRoads(){click(RailRoads);
        LOG.info("Click RailsRoad & Trains Successfully ");}



}










