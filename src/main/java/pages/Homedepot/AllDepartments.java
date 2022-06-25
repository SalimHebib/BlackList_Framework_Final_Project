package pages.Homedepot;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllDepartments extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AllDepartments.class);

    @FindBy(xpath = "//*[@id='header']/div/div[4]/div/ul/li[1]/a")
    private WebElement floatingMenu;

    @FindBy(xpath = "//*[@id='allDepartmentsFlyout']/section[1]/div/ul/li[8]/a")
    private WebElement electronics;

    @FindBy(xpath = "//*[@id='allDepartmentsFlyout']/section[1]/div/ul/li[16]/a")
    private WebElement paint;

    @FindBy(xpath = "//*[@id='allDepartmentsFlyout']/section[1]/div/ul/li[5]/a")
    private WebElement cleaning;

    @FindBy(xpath = "//*[@id='allDepartmentsFlyout']/section[1]/div/ul/li[20]/a")
    private WebElement smartHome;

    @FindBy(xpath = "//*[@id='allDepartmentsFlyout']/section[1]/div/ul/li[18]/a")
    private WebElement plumbing;

    @FindBy(xpath = "//*[@id='allDepartmentsFlyout']/section[1]/div/ul/li[5]/a")
    private WebElement buildingMaterials;

    @FindBy(xpath = "//*[@id='ColumnRail_thd_20cf']/div/div[2]/nav/ul/li[10]/a")
    private WebElement ceilings;

    @FindBy(xpath = "//*[@id='allDepartmentsFlyout']/section[1]/div/ul/li[2]/a")
    private WebElement appliances;

    @FindBy(xpath = "//*[@id='ColumnRail_thd_20cf']/div/div[4]/nav/ul/li[3]/a")
    private WebElement laundryCenters;

    @FindBy(xpath = "//*[@id='allDepartmentsFlyout']/section[1]/div/ul/li[11]/a")
    private WebElement hardware;

    @FindBy(xpath = "//*[@id='ColumnRail_thd_20cf']/div/div[1]/nav/ul/li[1]/a")
    private WebElement smartLocks;

    @FindBy(xpath = "//*[@id='allDepartmentsFlyout']/section[1]/div/ul/li[15]/a")
    private WebElement lighting;

    @FindBy(xpath = "//*[@id='ColumnRail_thd_20cf']/div/div[3]/nav/ul/li[6]/a")
    private WebElement trackLighting;

    @FindBy(xpath = "//*[@id='allDepartmentsFlyout']/section[1]/div/ul/li[21]/a")
    private WebElement storage;

    @FindBy(xpath = "//*[@id='ColumnRail_thd_20cf']/div/div[2]/nav/ul/li[1]/a")
    private WebElement garageCabinets;


    public AllDepartments(WebDriver driver){PageFactory.initElements(driver, this);}


    public void clickElectronics(){click(electronics);
    LOG.info("click electronics successfully");}
    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver,floatingMenu);
    LOG.info("floating menu appears successfully");}
    public void clickPaint(){click(paint);
    LOG.info("click paint successfully");}
    public void clickCleaning(){click(cleaning);
    LOG.info("click cleaning successfully");}
    public void clickSmartHome(){click(smartHome);
    LOG.info("click smart home successfully");}
    public void clickPlumbing(){click(plumbing);
    LOG.info("click plumbing successfully");}
    public void clickBuildingMaterials(){click(buildingMaterials);
    LOG.info("click electronics successfully");}
    public void clickCeilings(){click(ceilings);
    LOG.info("click ceilings successfully");}
    public void clickAppliances(){click(appliances);
    LOG.info("click appliances successfully");}
    public void clickLaundryCenters(){click(laundryCenters);
    LOG.info("click laundry center successfully");}
    public void clickHardware(){click(hardware);
    LOG.info("click hardware successfully");}
    public void clickSmartLocks(){click(smartLocks);
    LOG.info("click smart locks successfully");}
    public void clickLighting(){click(lighting);
    LOG.info("click lighting successfully");}
    public void clickTrackLighting(){click(trackLighting);
    LOG.info("click track lighting successfully");}
    public void clickStorage(){click(storage);
    LOG.info("click storage successfully");}
    public void clickGarageCabinets(){click(garageCabinets);
    LOG.info("click garage cabinets successfully");}






}
