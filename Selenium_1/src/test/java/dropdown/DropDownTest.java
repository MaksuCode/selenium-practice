package dropdown;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

public class DropDownTest extends BaseTest {

    private WebDriver driver ;


    @Test
    public void testSelectOption(){
        String option = "Option 1" ;
        DropDownPage dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(),1,"ıncorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option),"Option not selected");

    }
}
