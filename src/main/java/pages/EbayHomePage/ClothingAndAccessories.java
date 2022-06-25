package pages.EbayHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothingAndAccessories extends CommonAPI {

    public ClothingAndAccessories(WebDriver driver) {PageFactory.initElements(driver, this);}

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

    public void hoverOverFloatingMenu(WebDriver driver) {hoverOver(driver, FloatingMenu); }
    public void clickDesignerHandBags() {click(DesignerHandBags);}
    public void clickLouisVuitton() {click(LouisVuitton);}
    public void clickWomenDresses() {click(WomenDresses); }
    public void clickZara() {click(Zara); }
    public void clickMenAccessories() {click(MenAccessories);}
    public void clickHats(){click(Hats);}
    public void clickGirlsClothing(){click(GirlsClothing);}
    public void clickDresses(){click(Dresses);}
    public void clickBoysClothing(){click(BoysClothing);}
    public void clickShirtAndTShirt(){click(ShirtAndTShirt);}
    public void clickCollectibleSneakers(){click(CollectibleSneakers);}
    public void clickJordan(){click(Jordan);}
    public void clickAirJorden10(){click(AirJordan10);}

}