package pages.Ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SearchByCategory extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @FindBy(xpath = "//*[@id='gh-shop-a']")
    private WebElement shopByCategory;

    @FindBy(xpath = "//*[@id='gh-sbc']/tbody/tr/td[1]/h3[1]/a")
    private WebElement Motors;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[1]-0-0-0-27[0]-0-toggle-button']/span" )
    private WebElement Vehicles;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[1]-0-0-0-27[0]-0']/ul/li[5]/a")
    private WebElement ElectricHybridCar;

    @FindBy(xpath = "//*[@id='gh-sbc']/tbody/tr/td[2]/h3[2]/a")
    private WebElement BusinessIndustrial;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[2]-0-0-0']/ul/li[2]/a")
    private WebElement Dental;

    @FindBy(xpath = "//*[@id='gh-sbc']/tbody/tr/td[3]/h3[3]/a")
    private WebElement OtherCategories;

    @FindBy(xpath = "//*[@id=\"collectibles-and-art\"]/div/div[4]/div/ul/li[1]/a")
    private WebElement AntiqueFurniture;

    @FindBy(xpath = "//td[2]/h3[3]/a[1]")
    private WebElement JewelryWatches;

    @FindBy(xpath = "//li[5]/button[1]/span[1]" )
    private WebElement  FineJewelry;

    @FindBy(xpath = "//li[5]/ul[1]/li[9]/a[1]")
    private WebElement FineRings;

    @FindBy(xpath = "//td[3]/h3[1]/a[1]")
    private WebElement CollectiblesArt;

    @FindBy(xpath = "//li[10]/button[1]/span[1]")
    private WebElement Stamps;

    @FindBy(xpath = "//li[10]/ul[1]/li[2]/a[1]")
    private WebElement AfricanStamps;

    @FindBy(xpath = "//*[@id='gh-sbc']/tbody/tr/td[1]/h3[2]/a")
    private WebElement clothing;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0-27[0]-0-toggle-button']/span")
    private WebElement Women;
    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0-27[0]-0']/ul/li[4]/a")
    private WebElement WomenClothing;



    public SearchByCategory(WebDriver driver) {PageFactory.initElements(driver, this);}

    public void clickShopByCategory(){click(shopByCategory);
        LOG.info("Click ShopByCategory successfully ");}

    public void clickMotors(){click(Motors);
        LOG.info("ClickMotors successfully ");}

    public void clickVehicles(){click(Vehicles);
        LOG.info("Click Vehicle successfully ");}

    public void clickElectricHybridCar(){click(ElectricHybridCar);
        LOG.info("ClickElectric Hybrid car successfully ");}

    public void clickBusinessIndustrial(){click(BusinessIndustrial);
        LOG.info("Click Business Industrial successfully ");}

    public void clickDental(){click(Dental);
        LOG.info("Click Dental successfully ");}

    public void clickOtherCategories(){click(OtherCategories);
        LOG.info("Click Other Categories successfully ");}

    public void clickAntiqueFurniture(){click(AntiqueFurniture);
        LOG.info("Click antique Furniture successfully ");}

    public void clickJewelryWatches(){click(JewelryWatches);
        LOG.info("Click Jewelry &  Watches successfully ");}

    public void clickFineJewelry(){click(FineJewelry);
        LOG.info("Click fine Jewelry successfully ");}

    public void clickFineRings(){click(FineRings);
        LOG.info("Click Fine Rings successfully ");}

    public void clickCollectiblesArt(){click(CollectiblesArt);
        LOG.info("Click Collectibles Art successfully ");}

    public void clickStamps(){click(Stamps);
        LOG.info("Click Stamps successfully ");}

    public void clickAfricanStamps(){click(AfricanStamps);
        LOG.info("Click African Stamps successfully ");}

    public void clickClothing(){click(clothing);
        LOG.info("Click Clothing successfully ");}

    public void clickWomen(){click(Women);
        LOG.info("Click Women successfully ");}

    public void selectWomenClothing(){click(WomenClothing);
        LOG.info("Click WomenClothing  successfully ");}

}
