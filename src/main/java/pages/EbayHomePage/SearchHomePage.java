package pages.EbayHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class SearchHomePage extends CommonAPI {


    private final Logger LOG = LoggerFactory.getLogger(SearchHomePage.class);

    @FindBy(xpath = "//*[@id='gh-ac']")
    private WebElement searchField;


    @FindBy(xpath = "//*[@id='gh-btn']")
    private WebElement searchBtn;

    @FindBy(xpath = "//select[@id='gh-cat']")
    private WebElement menuDropdown;

    @FindBy(xpath = "//*[@id='gh-cat'] option")
    private WebElement menuDropdownOptions;

    @FindBy(xpath = "//*[@id='srp-river-results']/ul/li[3]/div/div[2]/a/h3")
    private WebElement apple;



    public SearchHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public List<String> getHomePageDropdownOptions() {
        List<String> options = new ArrayList<>();
        List<WebElement> elements = getDropDownOptions(menuDropdown);
        for (WebElement element : elements) {
            options.add(element.getText());
        }
        return options;
    }

    public void searchElementAndEnter(String item) {
        typeAndEnter(searchField, item);
        LOG.info("type in search field and enter success");
    }

    public void selectOptionFromMenuDropdown(String option) {
        selectFromDropdown(menuDropdown, option);
        LOG.info("{} selected from menu dropdown", option);
    }

    public void clickSearchBtn() {
        click(searchBtn);
        LOG.info("click on search button success");
    }


    public void selectOptionFromMenuDropdownWithSelectOptions(String option) {
        List<WebElement> elements = getDropDownOptions(menuDropdown);
        for (WebElement element : elements) {
            if (element.getText().equalsIgnoreCase(option)) {
                element.click();
            }
        }
    }


    public void clearSearchField() {clear(searchField);
        LOG.info("clear search field success");}
    public void clickApple(){click(apple);}



}





