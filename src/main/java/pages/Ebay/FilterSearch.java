package pages.Ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FilterSearch extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @FindBy(xpath = "//div[1]/input[1]")
    private WebElement searchField;


    @FindBy(xpath = "//*[@id='gh-btn']")
    private WebElement searchBtn;

    @FindBy(xpath = "//li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/a[1]/div[1]")
    private WebElement Samsung;

    @FindBy(xpath = "//*[@id='s0-50-12-6-3-query_answer1-answer-3-1-1-list']/li[2]/div/a")
    private WebElement black;

    @FindBy(xpath = "//*[@id='s0-50-12-6-3-query_answer1-answer-3-1-1-list']/li[4]/div[1]/a[1]/div[1]")
    private WebElement screenSize;

    @FindBy(xpath = "//div[2]/span[1]/button[1]/span[1]")
    private WebElement Condition;

    @FindBy(xpath = "//div[2]/span[1]/span[1]/div[1]/div[2]/span[1]")
    private WebElement New;

    @FindBy(xpath = "//*[@id='s0-50-12-6-3-query_answer1-answer-3-1-1-list']/li[4]/div[1]/a[1]")
    private WebElement lg;

    @FindBy(xpath = "//*[@id='s0-50-12-6-3-query_answer1-answer-3-1-1-list']/li[4]/div/a/div")
    private WebElement Size;

    @FindBy(xpath = "//*[@id='s0-50-12-6-3-query_answer1-answer-3-1-1-list']/li[5]/div/a/div")
    private WebElement Sketcher;

    @FindBy(xpath = "//*[@id='s0-50-12-6-3-query_answer1-answer-3-1-1-list']/li[1]/div/a/div")
    private WebElement Brand;

    @FindBy(xpath = "//*[@id='s0-50-12-6-3-query_answer1-answer-3-1-1-next']")
    private WebElement slide;

    @FindBy(xpath = "//*[@id='s0-50-12-6-3-query_answer1-answer-3-1-1-list']/li[5]/div/a/div")
    private WebElement Model;

    @FindBy(xpath = "//span[contains(text(),'Used')]")
    private WebElement used;

    @FindBy(xpath = "//*[@id='x-refine__group_1__0']/ul/li[3]/div/a/div/div/div/span[1]")
    private WebElement BrushDryer;

    @FindBy(xpath = "//*[@id=\"x-refine__group_1__1\"]/ul/li[3]/div/a/div/div/div/span[1]")
    private WebElement Dyson;

    public FilterSearch(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchElementAndEnter(String item) {typeAndEnter(searchField, item);
        LOG.info("Type and enter successfully ");}

    public void selectSamsung(){click(Samsung);
        LOG.info("Select Samsung successfully");}

    public void selectBlack(){click(black);
        LOG.info("Select Black successfully");}

    public void selectCondition(){click(Condition);
        LOG.info("Select condition successfully");}

    public void selectNew(){click(New);
        LOG.info("Select New successfully");}

    public void selectScreenSize(){click(screenSize);
        LOG.info("Select Screen size successfully") ;}

    public void selectLg(){click(lg);
        LOG.info("Select Lg successfully"); }

    public void selectSize(){click(Size);
        LOG.info("Select Size successfully");}

    public void selectSketcher(){click(Sketcher);
        LOG.info("Select Sketcher successfully");}

    public void selectBrand(){click(Brand);
        LOG.info("Select Brand successfully");}

    public void clickSlide(){click(slide);
        LOG.info("Click Slide successfully");}

    public void selectModel(){click(Model);
        LOG.info("Select Model successfully");}

    public void selectUsed(){click(used);
        LOG.info("Select Used successfully");}

    public void selectBrushDryer(){click(BrushDryer);
        LOG.info("Select BrushDryer successfully");}

    public void selectDyson(){click(Dyson);
        LOG.info("Select Dyson successfully");}

}