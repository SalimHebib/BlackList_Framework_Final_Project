package pages.EbayHomePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FilterSearch extends CommonAPI {

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

    public void searchElementAndEnter(String item) {
        typeAndEnter(searchField, item);
    }
    public void selectSamsung(){click(Samsung);}
    public void selectBlack(){click(black);}
    public void selectCondition(){click(Condition);}
    public void selectNew(){click(New);}
    public void selectScreenSize(){click(screenSize);}
    public void selectLg(){click(lg);}
    public void selectSize(){click(Size);}
    public void selectSketcher(){click(Sketcher);}
    public void selectBrand(){click(Brand);}
    public void clickSlide(){click(slide);}
    public void selectModel(){click(Model);}
    public void selectUsed(){click(used);}
    public void selectBrushDryer(){click(BrushDryer);}
    public void selectDyson(){click(Dyson);}

}