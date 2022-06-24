package pages.EbayHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryAndWatches extends CommonAPI {

    public JewelryAndWatches(WebDriver driver) {
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[11]/a")
    private WebElement FloatingMenu;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[11]/div[2]/div[1]/nav[2]/ul/li[1]/a")
    private WebElement Rolex;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-12-list']/li[1]/a/p")
    private WebElement Submariner;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[11]/div[2]/div[1]/nav[2]/ul/li[2]/a")
    private WebElement Omega;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-12-list']/li[2]/a/p")
    private WebElement Speedmaster;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[11]/div[2]/div[1]/nav[2]/ul/li[3]/a")
    private WebElement Breitling;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-12-list']/li[1]/a/p")
    private WebElement Navitimer;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[11]/div[2]/div[1]/nav[2]/ul/li[4]/a")
    private WebElement TAGHeuer;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-12-list']/li[4]/a/p")
    private WebElement Autavia;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[11]/div[2]/div[1]/nav[2]/ul/li[5]/a")
    private WebElement PatekPhilippe;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-12-list']/li[2]/a/p")
    private WebElement Calatrava;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[11]/div[2]/div[1]/nav[2]/ul/li[6]/a")
    private WebElement Cartier;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[2]/a")
    private WebElement CartierWatches;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-12-list']/li[2]/a/p")
    private WebElement Santos;


    public void hoverOverFloatingMenu(WebDriver driver) {hoverOver(driver, FloatingMenu); }
    public void clickRolex() {click(Rolex);}
    public void clickSubmariner() {click(Submariner);}
    public void clickOmega() {click(Omega); }
    public void clickSpeedMaster() {click(Speedmaster); }
    public void clickBreitling() {click(Breitling);}
    public void clickNavitimer(){click(Navitimer);}
    public void clickTAGHeuer(){click(TAGHeuer);}
    public void clickAutavia(){click(Autavia);}
    public void clickPatekPhilippe(){click(PatekPhilippe);}
    public void clickCalatrava(){click(Calatrava);}
    public void clickCartier(){click(Cartier);}
    public void clickCartierWatches(){click(CartierWatches);}
    public void clickSantos(){click(Santos);}


}
