package pages.Ebay;


import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeAndGarden extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

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

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver, floatingMenu);
        LOG.info("Floating Menu Successfully");}

    public void clickHomeImprovement() {click(HomeImprovement);
        LOG.info("Click Home improvement Successfully");}

    public void clickHomeDecor() {click(HomeDecor);
        LOG.info("Click Home Decor Successfully");}

    public void clickGeorgJensen() {click(GeorgJensen);
        LOG.info("Click George Jensen Successfully");}

    public void clickCobraCandleHolder(){click(CobraCandleHolder);
        LOG.info("Click Cobra Candle Holder Successfully");}

    public void clickElectricalSupplies(){click(ElectricalSupplies);
        LOG.info("Click Electrical supplies Successfully");}

    public void clickOutletsAndSwitches(){click(OutletsAndSwitches);
        LOG.info("Click outlets And Switches Successfully");}

    public void clickBedding(){click(Bedding);
        LOG.info("Click Bedding Successfully");}

    public void clickBedSkirts(){click(BedSkirts);
        LOG.info("Click Bed Skirts Successfully");}

    public void clickVacuumCleaners(){click(VacuumCleaners);
        LOG.info("Click Vacuum Cleaner Successfully");}

    public void clickSteamCleaners(){click(SteamCleaners);
        LOG.info("Click Steam Cleaners Successfully");}

    public void clickFurniture(){click(Furniture);
        LOG.info("Click Furniture Successfully");}

    public void clickBedroomSets(){click(BedroomSets);
        LOG.info("Click Bedroom Sets Successfully");}

    public void clickAppliances(){click(Appliances);
        LOG.info("Click Appliances Successfully");}

    public void clickCrepeMaker(){click(CrepeMaker);
        LOG.info("Click Crepe Maker Successfully");}

}




