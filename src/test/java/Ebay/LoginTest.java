package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.Ebay.LoginPage;

public class LoginTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled = true)
    public void LogoTest(){
        LoginPage homepage = new LoginPage(getDriver());
        homepage.checkLogoIsPresent();

    }

    @Test(enabled = true)
    public void LoginTest(){
        LoginPage homepage = new LoginPage(getDriver());
        waitFor(3);
        homepage.clickOnSignInBtn();
        homepage.getHeaderText();
        homepage.clickSwitchAccount();
        homepage.typeUserId();
        homepage.clickSignInContinue();
        homepage.typePassword();
        homepage.clickOnSgnBT();




    }


}
