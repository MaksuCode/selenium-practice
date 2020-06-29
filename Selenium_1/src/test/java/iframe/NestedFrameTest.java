package iframe;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Frames;
import pages.NestedFramesPage;

public class NestedFrameTest extends BaseTest {

    @Test
    public void testNestedFrames(){
        Frames frames = homePage.clickFrames();
        NestedFramesPage nestedFramesPage =frames.clickNestedFrames();
        String leftFrame =nestedFramesPage.getTextFromFrame(1) ;
        System.out.println(leftFrame);


    }


}
