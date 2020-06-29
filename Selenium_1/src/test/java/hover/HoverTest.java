package hover;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoverTest extends BaseTest {

    @Test
    public void testHoveruser1(){
        HoversPage hoversPage = homePage.clickHover();
        HoversPage.FigureCaption caption = hoversPage.hoverOverImage(1) ;
        Assert.assertTrue(caption.isCaptionDisplayed(),"Caption is not displayed!");
        Assert.assertEquals(caption.getTitle(),"name: user1","Caption title is incorrect!");
        Assert.assertEquals(caption.getLinkText(),"View profile","Caption link is incorrect!");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrec!");

    }
}
