package passwordretrieve;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.RetrivePasswordPage;

public class PasswordRetrieveTest extends BaseTest {

    private WebDriver driver ;

    @Test
    public void testSuccesfullPasswordRetrieve(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("mustafaksu4@gmail.com");
        RetrivePasswordPage retrivePasswordPage = forgotPasswordPage.clickRetrieveButton() ;
        retrivePasswordPage.getEmailSentNotification();
        Assert.assertTrue(retrivePasswordPage.getEmailSentNotification().contains("Your e-mail's been sent!"),"Incorrect Message Text!");


    }

}
