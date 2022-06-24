package pages.EbayHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LoginPage.class);


    @FindBy(xpath = "//*[@id='gh-logo']")
    private WebElement EbayLogo;

    @FindBy(xpath = "//*[@id='greeting-msg']")
    private WebElement headerText;

    @FindBy(xpath = "//*[text()='Sign in']")
    private WebElement signInBtn;

    @FindBy(xpath = "//*[@id='userid']")
    private WebElement userId;

    @FindBy(xpath = "//*[@id='signin-continue-btn']")
    private WebElement SignInContinue;

    @FindBy(xpath = "//*[@id='pass']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='sgnBt']")
    private WebElement sgnBt;

    @FindBy(xpath = "//*[@id='switch-account-anchor']")
    private WebElement SwitchAccount;

    @FindBy(xpath = "//*[@id='checkbox']")
    private WebElement Captcha;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public boolean checkLogoIsPresent(){
        return isPresent(EbayLogo);
    }
    public String getHeaderText(){return getElementText(headerText);
    }
    public void clickOnSignInBtn(){click(signInBtn); }
    public void clickSignInContinue(){click(SignInContinue);}
    public void clickOnSgnBT(){click(sgnBt);}
    public void clickSwitchAccount(){click(SwitchAccount);}
    public void typeUserId(){type(userId,"**********");}
    public void typePassword(){type(password,"**********");}



}

