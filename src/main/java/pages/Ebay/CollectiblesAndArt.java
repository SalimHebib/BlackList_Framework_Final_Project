package pages.Ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CollectiblesAndArt extends CommonAPI {

    public CollectiblesAndArt(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[5]/a")
    private WebElement FloatingMenu;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[1]/a")
    private WebElement ArtPainting;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[4]/a")
    private WebElement NftS;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[2]/a")
    private WebElement MorganDollars;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[10]/a")
    private WebElement NativeAmerican;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[5]/div[2]/div[1]/nav[1]/ul/li[4]/a")
    private WebElement Antiques;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[6]/a")
    private WebElement ManuScripts;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[5]/div[2]/div[1]/nav[1]/ul/li[5]/a")
    private WebElement bullion;

    @FindBy(xpath = "//*[@id='mainContent']/section[1]/div[2]/a[1]/div[2]")
    private WebElement GoldCoins;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[6]/a")
    private WebElement BaseballCards;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0-0']/ul/li[2]/a")
    private WebElement Packs;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[5]/div[2]/div[1]/nav[1]/ul/li[8]/a")
    private WebElement comics;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[1]-0-0-0']/ul/li[1]/a")
    private WebElement modernAge;

    public void hoverOverFloatingMenu(WebDriver driver) {hoverOver(driver, FloatingMenu);
        LOG.info("Collectibles and Art Floating Menu successfully ");}

    public void clickArtPainting() {click(ArtPainting);
        LOG.info("Click Art Painting successfully ");}

    public void clickNftS() {click(NftS);
        LOG.info("Click Art NFTs successfully ");}

    public void clickMorgan() {click(MorganDollars);
        LOG.info("Click Morgan Dollars successfully ");}

    public void clickNative() {click(NativeAmerican);
        LOG.info("Click Native American Dollars successfully ");}

    public void clickAntique() {click(Antiques);
        LOG.info("Click Antique successfully ");}

    public void clickManuscript(){click(ManuScripts);
        LOG.info("Click Antique Manuscripts successfully ");}

    public void clickBullion(){click(bullion);
        LOG.info("Click Bullion successfully ");}

    public void clickGoldCoin(){click(GoldCoins);
        LOG.info("Click Gold Bullion successfully ");}

    public void clickBaseBalls(){click(BaseballCards);
        LOG.info("Click Baseball Trading Cards successfully ");}

    public void clickPacks(){click(Packs);
        LOG.info("Click Baseball Packs Cards successfully");}

    public void clickComics(){click(comics);
        LOG.info("Click eBay Comics Bookstore successfully ");}

    public void clickModernAge(){click(modernAge);
        LOG.info("Click Modern Age Comics (1992-Now) successfully ");}
}