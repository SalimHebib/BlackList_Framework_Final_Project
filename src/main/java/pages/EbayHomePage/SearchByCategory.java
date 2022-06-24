package pages.EbayHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchByCategory extends CommonAPI {


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



    public SearchByCategory(WebDriver driver) {PageFactory.initElements(driver, this); }
    public void clickShopByCategory(){click(shopByCategory);}
    public void clickMotors(){click(Motors);}
    public void clickElectricHybridCar(){click(ElectricHybridCar);}
    public void clickVehicles(){click(Vehicles);}
    public void clickBusinessIndustrial(){click(BusinessIndustrial);}
    public void clickDental(){click(Dental);}
    public void clickOtherCategories(){click(OtherCategories);}
    public void clickAntiqueFurniture(){click(AntiqueFurniture);}
    public void clickJewelryWatches(){click(JewelryWatches);}
    public void clickFineJewelry(){click(FineJewelry);}
    public void clickFineRings(){click(FineRings);}
    public void clickCollectiblesArt(){click(CollectiblesArt);}
    public void clickStamps(){click(Stamps);}
    public void clickAfricanStamps(){click(AfricanStamps);}
    public void clickClothing(){click(clothing);}
    public void clickWomen(){click(Women);}
    public void selectWomenClothing(){click(WomenClothing);}

}
