package iframe;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

public class IframeTest extends BaseTest {

    @Test
    public void testIframe(){

        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygEditor();
        wysiwygEditorPage.clearTextArea();
        wysiwygEditorPage.setTextArea("Hello,");
        wysiwygEditorPage.clickDecreaseIndentButton();
        wysiwygEditorPage.setTextArea("World!");
        Assert.assertEquals(wysiwygEditorPage.getTheText(),"Hello,World!","Incorrect Text!");


    }
}
