package pages;

import com.sun.xml.internal.bind.v2.TODO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {  // TODO: 23.06.2020 : How to find Frames on the page is a issue!
    private WebDriver driver ;
//    public String leftFrame = "frame-left" ;
//    public String buttomFrame = "frame-bottom"; //body body
//    public By leftFrame = By.name("frame-left") ;
//    public By buttomFrame = By.name("frame-button");
    public By frameTag = By.xpath("Iframe: /html/frameset/frame[2]");


    public NestedFramesPage(WebDriver driver){
        this.driver = driver ;
    }

    private void switchToFrame(int frameIndex){
        int size = driver.findElements(By.tagName("frame")).size();
        driver.switchTo().frame(frameIndex) ;
    }
    private void  switchToMainArea(){
        driver.switchTo().parentFrame();
    }



    public String getTextFromFrame(int frameIndex){
        switchToFrame(frameIndex);
        String text = driver.findElement(frameTag).getText() ;
        switchToMainArea();
        return text ;

    }

}
