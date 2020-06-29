package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JsAlertsPage;

public class AlertTest extends BaseTest {

    @Test
    public void testAcceptAlert(){
        JsAlertsPage jsAlertsPage = homePage.clickJsAlerts();
        jsAlertsPage.triggerAlert();
        jsAlertsPage.alert_clickToAccept();
        Assert.assertEquals(jsAlertsPage.getResultMessage(),"You successfuly clicked an alert","Incorrect result message!");
    }
    @Test
    public void testDismissAlert(){
        JsAlertsPage jsAlertsPage = homePage.clickJsAlerts();
        jsAlertsPage.triggerConfirm();
        String alertText =jsAlertsPage.getTextOfAlert();
        jsAlertsPage.alert_clickToCancel();
        Assert.assertEquals(alertText,"I am a JS Confirm","Incorrect alert message!");
        Assert.assertEquals(jsAlertsPage.getResultMessage(),"You clicked: Cancel","Incorrect result message!");
    }

    @Test
    public void testPromptAlert(){
        JsAlertsPage jsAlertsPage = homePage.clickJsAlerts();
        jsAlertsPage.triggerPrompt();
        String alertText = jsAlertsPage.getTextOfAlert();
        jsAlertsPage.enterTextInPrompt("Believe in yourself!");
        jsAlertsPage.alert_clickToAccept();
        Assert.assertEquals(alertText,"I am a JS prompt","Incorrect alert message!");
        Assert.assertEquals(jsAlertsPage.getResultMessage(),"You entered: Believe in yourself!","Incorrect result message!");

    }

}
