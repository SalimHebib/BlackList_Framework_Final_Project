package pages.Ebay;


import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancedSearch extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AdvancedSearch.class);

    @FindBy(xpath = "//*[@id='gh-as-a']")
    private WebElement AdvancedBtn;

    @FindBy(xpath = "//*[@id='_nkw']")
    private WebElement enterkeyWords;

    @FindBy(xpath = "//*[@id='_ex_kw']")
    private WebElement excludeWords;

    @FindBy(xpath = "//div[3]/button[1]")
    private WebElement SearchBtn;

    @FindBy(xpath = "//*[@id='LH_TitleDesc']")
    private WebElement SearchButton;

    @FindBy(xpath = "//*[@id='_mPrRngCbx']")
    private WebElement price;

    @FindBy(xpath = "//*[@id='searchBtnLowerLnk']")
    private WebElement searchBtnLowerLnk;

    @FindBy(xpath = "//fieldset[3]/input[2]")
    private WebElement MinimumPrice;

    @FindBy(xpath = "//fieldset[3]/input[3]")
    private WebElement MaximumPrice;

    @FindBy(xpath = "//div[2]/div[1]/ul[1]/li[2]/a[1]")
    private WebElement FinStores;

    @FindBy(xpath = "//*[@id='_nkw']")
    private WebElement EnterStoreName;

    @FindBy(xpath = "//*[@id='mainContent']/div/ul/li/div[1]/a")
    private WebElement Store;

    @FindBy(xpath = "//a[contains(text(),'Clear options')]")
    private WebElement ClearOptions;

    @FindBy(xpath = "//a[contains(text(),'By item number')]")
    private WebElement ByItemNumber;

    @FindBy(xpath = "//input[@size='50']")
    private WebElement EnterByItemNumber;

    @FindBy(xpath = "//*[@id='LeftPanel']/div[1]/div/ul/li[2]/a")
    private WebElement OnEbayMotors;
    @FindBy(xpath = "//*[@id='fisc']/option[3]")
    private WebElement PartsAccessories;
    @FindBy(xpath = "//*[@id='Make']")
    private WebElement VehicleMake;
    @FindBy(xpath = "//*[@id='Make']/option[6]")
    private WebElement Audi;
    @FindBy(xpath = "//*[@id='Model']")
    private WebElement VehicleModel;
    @FindBy(xpath = "//*[@id='Model']/option[15]")
    private WebElement Q7;
    @FindBy(xpath = "//*[@id='adv_search_from']/ul[7]/li/span/button")
    private WebElement search;


    public AdvancedSearch(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickAdvancedBtn() {
        click(AdvancedBtn);
        LOG.info("Click Advanced button Successfully ");
        ;
    }

    public void enterkeyWords() {
        type(enterkeyWords, "Haier washer");
        LOG.info("Type Key Words Successfully ");
    }

    public void excludeWord() {
        type(excludeWords, "portable");
        LOG.info("Type Exclude Words Successfully ");
    }

    public void enterkeyWords2() {
        type(enterkeyWords, "Dell Laptop");
        LOG.info("Type Key Words2 Successfully ");
    }

    public void excludeWord2() {
        type(excludeWords, "inspiron");
        LOG.info("Type Exclude2 Words Successfully ");
    }

    public void clickSearchBtn() {
        click(SearchBtn);
        LOG.info("click Search Button Successfully ");
    }

    public void checkBoxPrice() {
        checkBoxIsChecked(price);
        LOG.info("check Box Successfully ");
    }

    public void typeMinimumPrice() {
        type(MinimumPrice, "10");
        LOG.info("Type Minimum Price Successfully ");
    }

    public void typeMaximumPrice() {
        type(MaximumPrice, "1000");
        LOG.info("Type Maximum Price Successfully ");
    }

    public void clickSearchBtnLowerLnk() {
        click(searchBtnLowerLnk);
        LOG.info("click Search Button Successfully ");
    }

    public void clickFindStores() {
        click(FinStores);
        LOG.info("Click find Store Successfully ");
    }

    public void searchElementAndEnter(String item) {
        typeAndEnter(EnterStoreName, item);
        LOG.info(" type and Enter Successfully ");
    }

    public void clickStore() {
        click(Store);
        LOG.info("click Store Successfully ");
    }

    public void clickClearOptions() {
        click(ClearOptions);
        LOG.info(" click Clear Option Successfully ");
    }

    public void clickByItemNumber() {
        click(ByItemNumber);
        LOG.info("Click By Item Number Successfully ");
    }

    public void typeItemAndEnter(String item) {
        type(EnterByItemNumber, item);
        LOG.info("Type Item Number and enter Successfully ");
    }

    public void clickOnEbayMotors() {
        click(OnEbayMotors);
        LOG.info("Click On ebay Motors Successfully ");
    }

    public void selectPartsAccessories() {
        click(PartsAccessories);
        LOG.info(" Select Parts Accessories Successfully ");
    }

    public void selectVehicleMake() {
        click(VehicleMake);
        LOG.info("Select Vehicle Successfully ");
    }

    public void selectAudi() {
        click(Audi);
        LOG.info("Select Audi Successfully ");
    }

    public void selectVehicleModel() {
        click(VehicleModel);
        LOG.info("Select Vehicle Model Successfully ");
    }

    public void selectQ7() {
        click(Q7);
        LOG.info("Select Q7 Successfully ");
    }

    public void clickSearch() {
        click(search);
        LOG.info("Click Search Successfully ");
    }

}
