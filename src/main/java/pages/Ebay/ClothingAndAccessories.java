package pages.Ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClothingAndAccessories extends CommonAPI {

    public ClothingAndAccessories(WebDriver driver) {PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[7]/a")
    private WebElement FloatingMenu;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[7]/div[2]/div[1]/nav[2]/ul/li[1]/a")
    private WebElement DesignerHandBags;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0-0']/ul/li[1]/a")
    private WebElement LouisVuitton;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[7]/div[2]/div[1]/nav[2]/ul/li[3]/a")
    private WebElement WomenDresses;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-12-list']/li[4]/a/p")
    private WebElement Zara;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[7]/div[2]/div[1]/nav[1]/ul/li[6]/a")
    private WebElement MenAccessories;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[9]/a")
    private WebElement Hats;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[7]/div[2]/div[1]/nav[1]/ul/li[7]/a")
    private WebElement GirlsClothing;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[4]/a")
    private WebElement Dresses;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[7]/div[2]/div[1]/nav[1]/ul/li[8]/a")
    private WebElement BoysClothing;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[15]/a")
    private WebElement ShirtAndTShirt;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[7]/div[2]/div[1]/nav[2]/ul/li[2]/a")
    private WebElement CollectibleSneakers;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0-0-27[0]-0-toggle-button']/span")
    private WebElement Jordan;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0-0-27[0]-0']/ul/li[10]/a")
    private WebElement AirJordan10;

    public void hoverOverFloatingMenu(WebDriver driver) {hoverOver(driver, FloatingMenu);
        LOG.info("Clothing And Accessories Floating Menu successfully");}

    public void clickDesignerHandBags() {click(DesignerHandBags);
        LOG.info("Click Designer Handbags successfully ");}

    public void clickLouisVuitton() {click(LouisVuitton);
        LOG.info("Click Louis Vuitton Bags & Handbags successfully");}

    public void clickWomenDresses() {click(WomenDresses);
        LOG.info("Click Women's Dresses successfully");}

    public void clickZara() {click(Zara);
        LOG.info("Click Zara Women's Dresses successfully ");}

    public void clickMenAccessories() {click(MenAccessories);
        LOG.info("Click Men's Accessories successfully ");}

    public void clickHats(){click(Hats);
        LOG.info("Click Men's Hats successfully ");}

    public void clickGirlsClothing(){click(GirlsClothing);
        LOG.info("Click Girls' Clothing (Sizes 4 & Up) successfully ");}

    public void clickDresses(){click(Dresses);
        LOG.info("Girls' Dresses successfully ");}

    public void clickBoysClothing(){click(BoysClothing);
        LOG.info("Click Boys' Clothing (Sizes 4 & Up) successfully ");}

    public void clickShirtAndTShirt(){click(ShirtAndTShirt);
        LOG.info("Click Boys' Tops, Shirts & T-Shirts successfully ");}

    public void clickCollectibleSneakers(){click(CollectibleSneakers);
        LOG.info("Click Sneakers successfully ");}

    public void clickJordan(){click(Jordan);
        LOG.info("Click AirJordan successfully");}

    public void clickAirJorden10(){click(AirJordan10);
        LOG.info("Click Jordan 10 successfully ");}

}