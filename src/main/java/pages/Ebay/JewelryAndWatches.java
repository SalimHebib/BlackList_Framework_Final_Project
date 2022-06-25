package pages.Ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JewelryAndWatches extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

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


    public void hoverOverFloatingMenu(WebDriver driver) {hoverOver(driver, FloatingMenu);
        LOG.info("Jewelry & Watches Floating Menu successfully");}

    public void clickRolex() {click(Rolex);
        LOG.info("Click Rolex Watches successfully");}

    public void clickSubmariner() {click(Submariner);
        LOG.info("Click Rolex Submariner  successfully");}

    public void clickOmega() {click(Omega);
        LOG.info("Click OMEGA Watches successfully"); }

    public void clickSpeedMaster() {click(Speedmaster);
        LOG.info("Click OMEGA Speedmaster Watches successfully");}

    public void clickBreitling() {click(Breitling);
        LOG.info("Click Breitling Watches successfully");}

    public void clickNavitimer(){click(Navitimer);
        LOG.info("Click Breitling Navitimer Watches successfully");}

    public void clickTAGHeuer(){click(TAGHeuer);
        LOG.info("Click TAG Heuer Watches successfully");}

    public void clickAutavia(){click(Autavia);
        LOG.info("Click TAG Heuer Autavia Watches successfully");}

    public void clickPatekPhilippe(){click(PatekPhilippe);
        LOG.info("Click Patek Philippe Watches successfully");}

    public void clickCalatrava(){click(Calatrava);
        LOG.info("Click Patek Philippe Calatrava Watches successfully");}

    public void clickCartier(){click(Cartier);
        LOG.info("Click Cartier successfully");}

    public void clickCartierWatches(){click(CartierWatches);
        LOG.info("Click Cartier Watches successfully");}

    public void clickSantos(){click(Santos);
        LOG.info("Click Cartier Santos Watches successfully");}


}
