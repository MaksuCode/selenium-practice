package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;  //used to select from drop down menu

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {

    private WebDriver driver ;
    private By dropDown = By.id("dropdown") ;

    public DropDownPage(WebDriver driver){
        this.driver = driver ;
    }
    public void selectFromDropDown(String option){
//        Select dropDownElement = new Select(driver.findElement(dropDown));
        findDropDownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        List<WebElement> selectedWebElements =
                findDropDownElement().getAllSelectedOptions();
        return selectedWebElements.stream().map(e->e.getText()).collect(Collectors.toList());  ///****????////

    }
    private Select findDropDownElement(){
        return new Select(driver.findElement(dropDown));
    }

    public void dropDownElementsWithJS(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('multiple','')") ;
    }

    public void setOptionWithJs(){

    }






}
