package pages.Jannatel;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LoginPage.class);

    @FindBy(css = "")
    private WebElement headerText;

    @FindBy(xpath = "")
    private WebElement websiteLogo;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String getHeaderText(){
        return getElementText(headerText);
    }

    public boolean checkLogoIsPresent(){
        return isPresent(websiteLogo);
    }
}
