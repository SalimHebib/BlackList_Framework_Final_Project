package Ebay;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.EbayHomePage.LoginPage;

public class LoginTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CommonAPI.class);

    @Test(enabled = true)
    public void LogoTest(){
        LoginPage homepage = new LoginPage(getDriver());
        LOG.info("login HomePage Successfully ");
        homepage.checkLogoIsPresent();
        LOG.info(" Check EbayLogo");
    }

    @Test(enabled = true)
    public void LoginTest(){
        LoginPage homepage = new LoginPage(getDriver());
        LOG.info("login HomePage Successfully ");
        waitFor(3);
        homepage.clickOnSignInBtn();
        LOG.info("click On SignIn Button Successfully ");
        homepage.getHeaderText();
        LOG.info("header text visible Successfully ");
        homepage.clickSwitchAccount();
        LOG.info("login HomePage Successfully ");
        homepage.typeUserId();
        LOG.info("login HomePage Successfully ");
        homepage.clickSignInContinue();
        LOG.info("click SignIn HomePage Successfully ");
        homepage.typePassword();
        LOG.info("type Password Successfully ");
        homepage.clickOnSgnBT();
        LOG.info("Click On SignInButton Successfully ");
        LOG.info("login HomePage SignIn Failed ");



    }


}
