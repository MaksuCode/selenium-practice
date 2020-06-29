package javascript;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeAndDeepDomPAge;

public class JavaScriptTest extends BaseTest {

    @Test
    public void scrollToElementTest(){
        homePage.clickLargeAndDeep().scrollToTable();
    }

    @Test
    public void scrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
