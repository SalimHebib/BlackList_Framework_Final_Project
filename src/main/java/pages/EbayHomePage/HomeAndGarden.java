package pages.EbayHomePage;


import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAndGarden extends CommonAPI {

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[6]/a" )
    private WebElement floatingMenu;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[6]/div[2]/div[1]/nav[1]/ul/li[2]/a")
    private WebElement HomeImprovement;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[4]/a")
    private WebElement ElectricalSupplies;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[6]/div[2]/div[1]/nav[1]/ul/li[5]/a")
    private WebElement HomeDecor;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0-0']/ul/li[2]/a")
    private WebElement GeorgJensen;

    @FindBy(xpath = "//*[@id='s0-28-9-0-1[0]-0-0']/ul/li[3]/div/div[2]/a/h3")
    private WebElement CobraCandleHolder;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-12-list']/li[2]/a/p")
    private WebElement OutletsAndSwitches;

    @FindBy(xpath = "//a[@_sp='p2481888.m1382.l3264']")
    private WebElement Bedding;

    @FindBy(xpath = "//section[1]/ul[1]/li[5]/a[1]")
    private WebElement BedSkirts;

    @FindBy(xpath = "//a[@_sp='p2481888.m1382.l3261']")
    private WebElement VacuumCleaners;

    @FindBy(xpath = "//section[1]/ul[1]/li[5]/a[1]")
    private WebElement SteamCleaners;

    @FindBy(xpath = "//a[@_sp='p2481888.m1382.l3257']")
    private WebElement Furniture;

    @FindBy(xpath = "//section[1]/ul[1]/li[8]/a[1]")
    private WebElement BedroomSets;
    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[6]/div[2]/div[1]/nav[1]/ul/li[3]/a")
    private WebElement Appliances;
    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[13]/a")
    private WebElement CrepeMaker;



    public HomeAndGarden(WebDriver driver){PageFactory.initElements(driver, this);}

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver, floatingMenu);}
    public void clickHomeImprovement() {click(HomeImprovement);}
    public void clickHomeDecor() {click(HomeDecor);}
    public void clickGeorgJensen() {click(GeorgJensen);}
    public void clickCobraCandleHolder(){click(CobraCandleHolder);}
    public void clickElectricalSupplies(){click(ElectricalSupplies);}
    public void clickOutletsAndSwitches(){click(OutletsAndSwitches);}
    public void clickBedding(){click(Bedding);}
    public void clickBedSkirts(){click(BedSkirts);}
    public void clickVacuumCleaners(){click(VacuumCleaners);}
    public void clickSteamCleaners(){click(SteamCleaners);}
    public void clickFurniture(){click(Furniture);}
    public void clickBedroomSets(){click(BedroomSets);}
    public void clickAppliances(){click(Appliances);}
    public void clickCrepeMaker(){click(CrepeMaker);}

}




