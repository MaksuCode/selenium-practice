package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {

    private WebDriver driver ;
//    private By frame = By.id("mce_0_ifr") ;
    private String editorIframeId = "mce_0_ifr" ;
    private By textAre = By.id("tinymce") ;
    private By decreaseIndentButton = new By.ByCssSelector("#mceu_12 button");


    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver ;
    }

    private void switchToFrame(){
        driver.switchTo().frame(editorIframeId) ; //Entering Iframe
    }
    public void clearTextArea(){
        switchToFrame(); //Entering Iframe
        driver.findElement(textAre).clear();
        switchToMainArea() ; //Exiting Iframe
    }
    public void setTextArea(String text){
        switchToFrame();
        driver.findElement(textAre).sendKeys(text);
        switchToMainArea();
    }

    public void clickDecreaseIndentButton(){
        driver.findElement(decreaseIndentButton).click();
    }

    public String getTheText(){
        switchToFrame();
        String text =driver.findElement(textAre).getText();
        switchToMainArea();
        return text ;
    }

    private void  switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
