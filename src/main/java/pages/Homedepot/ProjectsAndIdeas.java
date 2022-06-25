package pages.Homedepot;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectsAndIdeas extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ProjectsAndIdeas.class);

    @FindBy(xpath = "//*[@id='header']/div[1]/div[4]/div/ul/li[3]/a")
    private WebElement projects;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[3]/div/ul/li[8]/a")
    private WebElement grills;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[1]/div/ul/li[1]/a")
    private WebElement bathroom;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[4]/div/ul/li[9]/a")
    private WebElement homeSafety;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[2]/div/ul/li[5]/a")
    private WebElement cooking;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[1]/div/ul/li[6]/a")
    private WebElement flooring;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[5]/div/ul/li[11]/a")
    private WebElement giftIdeas;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[3]/div/ul/li[2]/a")
    private WebElement gardening;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[1]/div/ul/li[1]/a")
    private WebElement bedrooms;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[1]/div/ul/li[2]/a")
    private WebElement livingRoom;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[1]/div/ul/li[3]/a")
    private WebElement paint;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[5]/div/ul/li[1]/a")
    private WebElement packing;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[1]/div/ul/li[7]/a")
    private WebElement hallway;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[3]/div/ul/li[6]/a")
    private WebElement deck;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[2]/div/ul/li[4]/a")
    private WebElement parties;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[4]/div/ul/li[5]/a")
    private WebElement plumbing;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[2]/div/ul/li[1]/a")
    private WebElement halloween;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[2]/div/ul/li[2]/a")
    private WebElement christmas;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[2]/div/ul/li[3]/a")
    private WebElement thanksGiving;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[4]/div/ul/li[6]/a")
    private WebElement heating;

    @FindBy(xpath = "//*[@id='diyFlyout']/section/div/div/div[4]/div/ul/li[2]/a")
    private WebElement windows;

    public ProjectsAndIdeas(WebDriver driver){PageFactory.initElements(driver, this);}

    public void hoverOverProjects(WebDriver driver){hoverOver(driver,projects);
     LOG.info("floating menu projects appears successfully");}
    public void clickGrills(){click(grills);
    LOG.info("click grills successfully");}
    public void clickBathroom(){click(bathroom);
    LOG.info("click bathroom successfully");}
    public void clickHomeSafety(){click((homeSafety));
    LOG.info("click home safety successfully");}
    public void clickCooking(){click(cooking);
    LOG.info("click cooking successfully");}
    public void clickFlooring(){click(flooring);
    LOG.info("click flooring successfully");}
    public void clickGiftIdeas(){click(giftIdeas);
    LOG.info("click gift ideas successfully");}
    public void clickGardening(){click(gardening);
    LOG.info("click gardening successfully");}
    public void clickBedrooms(){click(bedrooms);
    LOG.info("click bedrooms successfully");}
    public void clickLivingRoom(){click(livingRoom);
    LOG.info("click living room successfully");}
    public void clickPaint(){click(paint);
    LOG.info("click paint successfully");}
    public void clickPacking(){click(packing);
    LOG.info("click packing successfully");}
    public void clickHallway(){click((hallway));
    LOG.info("click hallway successfully");}
    public void clickDeck(){click(deck);
    LOG.info("click deck successfully");}
    public void clickParties(){click(parties);
    LOG.info("click parties successfully");}
    public void clickPlumbing(){click(plumbing);
    LOG.info("click plumbing successfully");}
    public void clickHalloween(){click(halloween);
    LOG.info("click halloween successfully");}
    public void clickChristmas(){click(christmas);
    LOG.info("click christmas successfully");}
    public void clickThanksGiving(){click(thanksGiving);
    LOG.info("click thanksgiving successfully");}
    public void clickHeating(){click(heating);
    LOG.info("click heating successfully");}
    public void clickWindows(){click(windows);
    LOG.info("click windows successfully");}
}
