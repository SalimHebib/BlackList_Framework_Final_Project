package pages.EbayHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessAndIndustrial extends CommonAPI {

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

    public void hoverOverFloatingMenu(WebDriver driver) {hoverOver(driver, FloatingMenu); }
    public void clickHeavyEquipment() {click(HeavyEquipment);}
    public void clickExcavators() {click(Excavators);}
    public void clickHealthCare() {click(HealthCare); }
    public void clickMedicalLabDentalSupplies() {click(MedicalLabDentalSupplies); }
    public void clickOffice() {click(Office);}
    public void clickOfficeFurniture(){click(OfficeFurniture);}
    public void clickRestaurantAndFoodService(){click(RestaurantAndFoodService);}
    public void clickBarBeverageEquipment(){click(BarBeverageEquipment);}
    public void clickHvacAndRefrigeration(){click(HvacAndRefrigeration);}
    public void clickHvacSystems(){click(HvacSystems);}
    public void clickShippingAndPackaging(){click(ShippingAndPackaging);}
    public void clickLetterFolders(){click(LetterFolders);}
}