package login;

import base.BaseTest;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.* ;

public class LoginTest extends BaseTest {   //* Inherit BaseTest class.

    @Test
    public void testSuccesfullLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage =loginPage.clickLogin();
        secureAreaPage.getSecureAreaMessage();
        Assert.assertTrue(secureAreaPage.getSecureAreaMessage()
                .contains("You logged into a secure area!"),
                "Message text is incorrect!") ;

    }
    @Test
    public void testWrongUsernameLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("mustafa");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.getInvalidLoginMessage()
                .contains("Your username is invalid!"),
                "Not invalid username test!");


    }
    @Test
    public void testWrongPasswordLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("WrongPassword!");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.getInvalidLoginMessage()
                        .contains("Your password is invalid!"),
                "Not invalid password test!");

    }

}
