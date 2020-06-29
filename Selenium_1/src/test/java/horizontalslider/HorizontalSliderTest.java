package horizontalslider;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testSlider() throws InterruptedException {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderPage();
        horizontalSliderPage.clickOntheSlider();
        horizontalSliderPage.moveSlider("4");
        Assert.assertEquals(horizontalSliderPage.getRange(),"4","Incorrect final range!");

    }

}
