package pages.EbayHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Motors extends CommonAPI {

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


    public void clickCarsAndTrucks() {click(CarsAndTrucks);}
    public void clickConvertible() {click(Convertible);}
    public void clickAcura(){click(acura);}
    public void clickBoats(){click(Boats);}
    public void clickSailBoats(){click(Sailboats);}
    public void clickMotorcycles(){click(MotorsCycle);}
    public void clickCruiser(){click(cruiser);}
    public void clickPowerSports(){click(PowerSports);}
    public void clickAtvS(){click(AtvS);}
    public void clickClassics(){click(Classics);}
    public void clickCampers(){click(Campers);}
    public void clickAirstream(){click(AirStream);}

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver, floatingMenu);}
}



