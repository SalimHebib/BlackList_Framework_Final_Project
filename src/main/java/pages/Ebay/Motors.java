package pages.Ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Motors extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[3]/a")
    private WebElement motors;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[3]/a" )
    private WebElement floatingMenu;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")
    private WebElement CarsAndTrucks;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0-0']/ul/li[1]/a")
    private WebElement Convertible;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[3]/a")
    private WebElement acura;


    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[7]/a")
    private WebElement Boats;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[5]/a")
    private WebElement Sailboats;


    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[3]/a")
    private WebElement MotorsCycle;

    @FindBy(xpath = "//a[contains(text(),'Cruiser')]")
    private WebElement cruiser;


    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[4]/a")
    private WebElement PowerSports;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[3]/a")
    private WebElement AtvS;


    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[2]/a")
    private WebElement Classics;


    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[5]/a")
    private WebElement Campers;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[1]-0-0-0']/ul/li[1]/a")
    private WebElement AirStream;


    public Motors(WebDriver driver){PageFactory.initElements(driver, this);}


    public void clickCarsAndTrucks() {click(CarsAndTrucks);
        LOG.info("Click Cars & Trucks successfully");}

    public void clickAcura(){click(acura);
        LOG.info("Click Acura successfully ");}

    public void clickBoats(){click(Boats);
        LOG.info("Click Boats successfully ");}

    public void clickSailBoats(){click(Sailboats);
        LOG.info("Click SailBoats successfully ");}

    public void clickMotorcycles(){click(MotorsCycle);
        LOG.info("Click Motorcycles successfully ");}

    public void clickCruiser(){click(cruiser);
        LOG.info("Click Cruiser successfully ");}

    public void clickPowerSports(){click(PowerSports);
        LOG.info("Click PowerSports successfully ");}

    public void clickAtvS(){click(AtvS);
        LOG.info("Click AtvS successfully ");}

    public void clickClassics(){click(Classics);
        LOG.info("Click Classics successfully ");}

    public void clickConvertible() {click(Convertible);
        LOG.info("Click Convertible successfully ");}

    public void clickCampers(){click(Campers);
        LOG.info("Click Campers successfully ");}

    public void clickAirstream(){click(AirStream);
        LOG.info("Click AirStream successfully ");}

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver, floatingMenu);
        LOG.info("Motors Floating Menu successfully");}
}



