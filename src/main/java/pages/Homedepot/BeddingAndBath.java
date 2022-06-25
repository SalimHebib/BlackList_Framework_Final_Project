package pages.Homedepot;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeddingAndBath extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(BeddingAndBath.class);

    @FindBy(xpath = "//*[@id='header']/div[1]/div[4]/div/ul/li[2]/a")
    private WebElement floatingMenu;

    @FindBy(xpath = "//*[@id='bedding-and-bath']")
    private WebElement floatingMenu1;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[3]/div[1]/div[3]/a")
    private WebElement towelSet;

    @FindBy(xpath = "//*[@id='header']/div/div[6]/div[2]/section/div[3]/div[2]/div[8]/a")
    private WebElement toothbrushHolder;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[3]/div[2]/div[7]/a")
    private WebElement soapDishes;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[4]/div[1]/div[5]/a")
    private WebElement towelRacks;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[4]/div[2]/div[7]/a")
    private WebElement bathTubs;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[4]/div[2]/div[3]/a")
    private WebElement bathroomVanities;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[4]/div[2]/div[5]/a")
    private WebElement bathroomSinks;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[3]/div[3]/div[3]/a")
    private WebElement bathRobes;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[3]/div[2]/div[3]/a")
    private WebElement bathroomRugs;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[6]/div[2]/section/div[2]/div[1]/div[5]/a")
    private WebElement electricBlankets;




    public BeddingAndBath(WebDriver driver){PageFactory.initElements(driver, this);}

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver,floatingMenu);
    LOG.info("floating menu appears successfully");}
    public void hoverOverFloatingMenu1(WebDriver driver){hoverOver(driver,floatingMenu1);
    LOG.info("floating menu1 appears successfully");}
    public void clickTowelSet(){click(towelSet);
     LOG.info(" click towel set successfully");}
    public void clickToothbrushHolder(){click(toothbrushHolder);
     LOG.info(" click toothbrush holder successfully");}
    public void clickSoapDishes(){click(soapDishes);
     LOG.info(" click soap dishes successfully");}
    public void clickTowelRacks(){click(towelRacks);
     LOG.info(" click towel racks successfully");}
    public void clickBathTubs(){click(bathTubs);
     LOG.info(" click bath tubs successfully");}
    public void clickBathroomVanities(){click(bathroomVanities);
     LOG.info(" click bathroom vanities successfully");}
    public void clickBathroomSinks(){click(bathroomSinks);
     LOG.info(" click bathroom sinks successfully");}
    public void clickBathRobes(){click(bathRobes);
     LOG.info(" click bath robes successfully");}
    public void clickBathroomRugs(){click((bathroomRugs));
     LOG.info(" click bathroom rugs successfully");}
    public void clickElectricBlankets(){click(electricBlankets);
     LOG.info(" click electric blankets successfully");}

}
