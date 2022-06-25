package pages.Ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DailyDeals extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @FindBy(xpath = "//*[@id='gh-p-1']/a")
    private WebElement DailyDeals;

    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")
    private WebElement FloatingMenuFashion;

    @FindBy(xpath = "//li[5]/a[1]/span[1]")
    private  WebElement FloatingMenuSportingGoods;

    @FindBy(xpath = "//div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]")
    private  WebElement FloatingMenuTech;

    @FindBy(xpath = "//*[@id='refit-spf-container']/div[1]/nav/ul/li[3]/div/div[2]/a[3]")
    private WebElement FineJewelry;

    @FindBy(xpath = "//*[@id='spokeResultSet']/div[1]/div/div[2]/div/div[1]/a/h3/span/span")
    private WebElement GrownDiamond;

    @FindBy(xpath = "//*[@id='refit-spf-container']/div[1]/nav/ul/li[5]/div/div[1]/a[2]")
    private WebElement Golf;

    @FindBy(xpath = "//*[@id='spokeResultSet']/div[1]/div/div[3]/div/div[1]/a/h3/span/span")
    private WebElement CobraSnake;

    @FindBy(xpath = "//*[@id='refit-spf-container']/div[1]/nav/ul/li[2]/div/div[2]/a[1]")
    private WebElement Ipads;

    @FindBy(xpath = "//*[@id='spokeResultSet']/div[1]/div/div[3]/div/div/a/h3/span/span")
    private WebElement AppleIPad;

    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]/span[1]")
    private WebElement FloatingMenuAutomotive;

    @FindBy(xpath = "//*[@id='refit-spf-container']/div[1]/nav/ul/li[6]/div/div[1]/a[4]")
    private WebElement CarAccessories;

    @FindBy(xpath = "//li[4]/a[1]/span[1]")
    private WebElement FloatingMenuHomeGarden;

    @FindBy(xpath = "//li[4]/div[1]/div[1]/a[1]")
    private WebElement KitchenDiningBar;

    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]/span[1]")
    private WebElement FloatingMenuOtherDeals;

    @FindBy(xpath = "//*[@id='refit-spf-container']/div[1]/nav/ul/li[7]/div/div[1]/a[5]")
    private WebElement Luggage;


    public DailyDeals(WebDriver driver) {PageFactory.initElements(driver, this); }

    public void clickDailyDeals(){click(DailyDeals);
        LOG.info("Click Daily Deals Successfully ");}

    public void clickGolf() {click(Golf);
        LOG.info("Click Golf Successfully");}

    public void clickCobraSnake(){click(CobraSnake);
        LOG.info("Click Cobra snake Successfully");}

    public void clickFineJewelry() {click(FineJewelry);
        LOG.info("Click Fine Jewelry Successfully ");}

    public void clickIpads(){click(Ipads);
        LOG.info("Click Ipads Successfully ");}

    public void clickAppleIPad(){click(AppleIPad);
        LOG.info("Click Apple Ipad Successfully ");}

    public void clickCarAccessories(){click(CarAccessories);
        LOG.info("Click Car Accessories Successfully ");}

    public void clickKitchenDiningBar(){click(KitchenDiningBar);
        LOG.info("Click Kitchen & dining & Bar Successfully ");}

    public void clickLuggage(){click(Luggage);
        LOG.info("Click Luggage Travel Successfully ");}

    public void hoverOverFloatingMenuFashion(WebDriver driver){hoverOver(driver, FloatingMenuFashion);
        LOG.info("Click Daily Deals Successfully ");}

    public void hoverOverFloatingMenuSportingGoods(WebDriver driver){hoverOver(driver, FloatingMenuSportingGoods);
        LOG.info("Floating Menu Successfully");}

    public void hoverOverFloatingMenuTech(WebDriver driver){hoverOver(driver, FloatingMenuTech);
        LOG.info("Floating Menu Successfully");}

    public void hoverOverFloatingMenuAutomotive(WebDriver driver){hoverOver(driver,FloatingMenuAutomotive);
        LOG.info("Floating Menu Successfully");}

    public void hoverOverFloatingMenuHomeGarden(WebDriver driver){hoverOver(driver,FloatingMenuHomeGarden);
        LOG.info("Floating Menu Successfully");}

    public void hoverOverFloatingMenuOtherDeals(WebDriver driver){hoverOver(driver,FloatingMenuOtherDeals);
        LOG.info("Floating Menu Successfully");}


}