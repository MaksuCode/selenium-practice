package uploadfile;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import static org.assertj.core.api.Assertions.assertThat;


public class UploadFileTest extends BaseTest {

    @Test
    public void testUploadfile(){
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.chooseFolder("C:\\Users\\maksu\\Desktop\\Selenium_Notes.txt");
        fileUploadPage.click_UploadButton();
        Assert.assertEquals(fileUploadPage.getText(),"Selenium_Notes.txt","Incorrect file name!");



    }
}
