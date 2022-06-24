package pages.EbayHomePage;


import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvancedSearch extends CommonAPI {

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




    public AdvancedSearch(WebDriver driver) {PageFactory.initElements(driver, this); }
    public void clickAdvancedBtn(){click(AdvancedBtn);}
    public void enterkeyWords(){type(enterkeyWords, "Haier washer");}
    public void excludeWord(){type(excludeWords,"portable");}
    public void enterkeyWords2(){type(enterkeyWords, "Dell Laptop");}
    public void excludeWord2(){type(excludeWords,"inspiron");}

    public void clickSearchBtn(){click(SearchBtn);}
    public void checkBoxPrice(){checkBoxIsChecked(price);}
    public void typeMinimumPrice(){type(MinimumPrice,"10");}
    public void typeMaximumPrice(){type(MaximumPrice,"1000");}
    public void clickSearchBtnLowerLnk(){click(searchBtnLowerLnk);}
    public void clickFindStores(){click(FinStores);}
    public void searchElementAndEnter(String item){typeAndEnter(EnterStoreName, item);}
    public void clickStore(){click(Store);}
    public void clickClearOptions(){click(ClearOptions);}
    public void clickByItemNumber(){click(ByItemNumber);}
    public void typeItemAndEnter(String item){type(EnterByItemNumber, item);}
    public void clickOnEbayMotors(){click(OnEbayMotors);}
    public void selectPartsAccessories(){click(PartsAccessories);}
    public void selectVehicleMake(){click(VehicleMake);}
    public void selectAudi(){click(Audi);}
    public void selectVehicleModel(){click(VehicleModel);}
    public void selectQ7(){click(Q7);}
    public void clickSearch(){click(search);}



}
