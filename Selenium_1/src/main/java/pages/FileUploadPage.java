package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver ;
    private By chooseFolder = By.id("file-upload") ;
    private By uploadButton = By.id("file-submit") ;
    private By uploadedFileNotification = By.id("uploaded-files") ;

    public FileUploadPage(WebDriver driver){
        this.driver = driver ;
    }
    public void click_UploadButton(){
        driver.findElement(uploadButton).click();
    }
    public void chooseFolder(String absolutePathOfFile){
        driver.findElement(chooseFolder).sendKeys(absolutePathOfFile); ///C:\\Users\\maksu\\Desktop\\Selenium_Notes.txt"
    }
    public String getText(){
        return driver.findElement(uploadedFileNotification).getText();


    }

}
