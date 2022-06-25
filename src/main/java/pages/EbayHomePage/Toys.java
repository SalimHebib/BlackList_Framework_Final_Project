package pages.EbayHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Toys extends CommonAPI {

    public Toys(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

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



    public void hoverOverFloatingMenu(WebDriver driver) {hoverOver(driver, FloatingMenu); }
    public void clickLegoSets() {click(LegoSets);}
    public void clickTajMahal() {click(TajMahal);}
    public void clickDollsTeddyBear() {click(DollsTeddyBear); }
    public void clickDollHouses() {click(DollHouses); }
    public void clickToysDeals() {click(ToysDeals);}
    public void clickHighestFirst(){click(HighestFirst);}
    public void clickShowFeaturedItems(){click(ShowFeaturedItems);}
    public void clickActionsFigure(){click(ActionsFigure);}
    public void clickBuildingToys(){click(BuildingToys);}
    public void clickMixedLots(){click(MixedLots);}
    public void clickTrains(){click(trains);}
    public void clickRailRoads(){click(RailRoads);
    }



}










