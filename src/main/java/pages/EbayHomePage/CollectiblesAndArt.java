package pages.EbayHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectiblesAndArt extends CommonAPI {

    public CollectiblesAndArt(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

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

    public void hoverOverFloatingMenu(WebDriver driver) {hoverOver(driver, FloatingMenu); }
    public void clickArtPainting() {click(ArtPainting);}
    public void clickNftS() {click(NftS);}
    public void clickMorgan() {click(MorganDollars); }
    public void clickNative() {click(NativeAmerican); }
    public void clickAntique() {click(Antiques);}
    public void clickManuscript(){click(ManuScripts);}
    public void clickBullion(){click(bullion);}
    public void clickGoldCoin(){click(GoldCoins);}
    public void clickBaseBalls(){click(BaseballCards);}
    public void clickPacks(){click(Packs);}
    public void clickComics(){click(comics);}
    public void clickModernAge(){click(modernAge);
    }
}