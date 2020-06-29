package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPageEx1;
import pages.DynamicLoadingPageEx2;

public class WaitTest extends BaseTest {

    @Test
    public void testWaitUntilHidden(){
        DynamicLoadingPageEx1 dynamicLoadingPage = homePage.clickDynamicLoading().clickExample1();
        dynamicLoadingPage.clickStartButton();
        Assert.assertEquals(dynamicLoadingPage.getLoadedText(),"Hello World!","Incorrect loaded text!");
    }

    @Test
    public void testWaitUntilRendered(){
        DynamicLoadingPageEx2 dynamicLoadingPageEx2 = homePage.clickDynamicLoading().clickExample2();
        dynamicLoadingPageEx2.clickStartButton();
        Assert.assertEquals(dynamicLoadingPageEx2.getLoadedText(),"Hello World!","Incorrect loaded text!");

    }


}
