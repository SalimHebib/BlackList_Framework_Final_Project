package pages.Ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Electronics extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[4]/a" )
    private WebElement floatingMenu;

    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[4]/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
    private WebElement CamerasAndPhoto;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[3]/a")
    private WebElement CameraDrones;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[7]/a")
    private WebElement HeadPhones;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[4]/a")
    private WebElement HeadphoneParts;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-1[0]-0-12-list']/li[2]/a/div/img")
    private WebElement White;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[2]/a")
    private WebElement VideoGames;

    @FindBy(xpath = "//li[2]/a[1]/p[1]")
    private WebElement Ps5;

    @FindBy(xpath = "//li[4]/div[2]/div[1]/nav[2]/ul[1]/li[3]/a[1]")
    private WebElement Nintendo;

    @FindBy(xpath = "//section[1]/ul[1]/li[5]/a[1]")
    private WebElement Batteries;

    @FindBy(xpath = "//a[@_sp='p2481888.m1380.l3256']")
    private WebElement VehicleElectronics;

    @FindBy(xpath = "//section[1]/ul[1]/li[8]/a[1]")
    private WebElement CarVideo;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[8]/a")
    private WebElement SmartHome;

    @FindBy(xpath = "/html/body")
    private WebElement SmartPlugs;



    public Electronics(WebDriver driver){PageFactory.initElements(driver, this);}


    public void clickCamerasAndPhoto() {click(CamerasAndPhoto);
        LOG.info("Click Camera And Photo Successfully");}

    public void clickCameraDrones() {click(CameraDrones);
        LOG.info("Click Camera Drones Successfully");}

    public void clickHeadPhones(){click(HeadPhones);
        LOG.info("Click Head Phones Successfully");}

    public void clickHeadPhoneParts(){click(HeadphoneParts);
        LOG.info("Click Head Phones Parts Successfully");}

    public void clickWhite(){click(White);
        LOG.info("Click white Successfully");}

    public void clickVideoGames(){click(VideoGames);
        LOG.info("Click Video Games Successfully");}

    public void clickPs5(){click(Ps5);
        LOG.info("Click Ps5 Successfully");}

    public void clickNintendo(){click(Nintendo);
        LOG.info("Click Nintendo Successfully");}

    public void clickBatteries(){click(Batteries);
        LOG.info("Click Batteries Successfully");}

    public void clickVehicleElectronics(){click(VehicleElectronics);
        LOG.info("Click Vehicle Electronics Successfully");}

    public void clickCarVideo(){click(CarVideo);
        LOG.info("Click Car Video Successfully");}

    public void clickSmartHome(){click(SmartHome);
        LOG.info("Click Smart Home Successfully");}

    public void clickSmartPlugs(){click(SmartPlugs);
        LOG.info("Click Smart Plugs Successfully");}

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver, floatingMenu);
        LOG.info("Floating Menu Successfully");}
}
