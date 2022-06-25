package pages.Ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusinessAndIndustrial extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    public BusinessAndIndustrial(WebDriver driver) {
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[10]/a")
    private WebElement FloatingMenu;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[10]/div[2]/div[1]/nav[1]/ul/li[1]/a")
    private WebElement HeavyEquipment;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[10]/a")
    private WebElement Excavators;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[10]/div[2]/div[1]/nav[1]/ul/li[3]/a")
    private WebElement HealthCare;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[6]/a")
    private WebElement MedicalLabDentalSupplies;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[10]/div[2]/div[1]/nav[1]/ul/li[5]/a")
    private WebElement Office;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[5]/a")
    private WebElement OfficeFurniture;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[10]/div[2]/div[1]/nav[1]/ul/li[7]/a")
    private WebElement RestaurantAndFoodService;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[3]/a")
    private WebElement BarBeverageEquipment;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[10]/div[2]/div[1]/nav[2]/ul/li[8]/a")
    private WebElement HvacAndRefrigeration;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[4]/a")
    private WebElement HvacSystems;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[10]/div[2]/div[1]/nav[2]/ul/li[2]/a")
    private WebElement ShippingAndPackaging;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0']/ul/li[8]/a")
    private WebElement LetterFolders;

    @FindBy(xpath = "//*[@id='s0-17-12-0-1[0]-0-0-0-27[0]-0']/ul/li[10]/a")
    private WebElement AirJordan10;

    public void hoverOverFloatingMenu(WebDriver driver) {hoverOver(driver, FloatingMenu);
        LOG.info("Business & Industrial Floating Menu successfully");}

    public void clickHeavyEquipment() {click(HeavyEquipment);
        LOG.info("Click Heavy Equipment successfully");}

    public void clickExcavators() {click(Excavators);
        LOG.info("click Excavators successfully" );}

    public void clickHealthCare() {click(HealthCare);
        LOG.info("Click Healthcare, Lab & Dental successfully");}

    public void clickMedicalLabDentalSupplies() {click(MedicalLabDentalSupplies);
        LOG.info("Click Medical, Lab & Dental Supplies successfully");}

    public void clickOffice() {click(Office);
        LOG.info("Click Office Supplies & Equipment successfully");}

    public void clickOfficeFurniture(){click(OfficeFurniture);
        LOG.info("Click Office Furniture successfully");}

    public void clickRestaurantAndFoodService(){click(RestaurantAndFoodService);
        LOG.info("Click Restaurant & Food Service successfully");}

    public void clickBarBeverageEquipment(){click(BarBeverageEquipment);
        LOG.info("Click Bar & Beverage Equipment successfully");}

    public void clickHvacAndRefrigeration(){click(HvacAndRefrigeration);
        LOG.info("Click HVAC & Refrigeration successfully");}

    public void clickHvacSystems(){click(HvacSystems);
        LOG.info("Click HVAC system successfully");}

    public void clickShippingAndPackaging(){click(ShippingAndPackaging);
        LOG.info("Click Packing & Shipping Supplies successfully");}

    public void clickLetterFolders(){click(LetterFolders);
        LOG.info("Click Letter Folders successfully");}
}