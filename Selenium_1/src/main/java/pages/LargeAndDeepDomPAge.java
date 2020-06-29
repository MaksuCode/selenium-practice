package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LargeAndDeepDomPAge {

    private WebDriver driver ;
    private By table = By.id("large-table") ;

    public LargeAndDeepDomPAge(WebDriver driver){
        this.driver = driver ;
    }

    public void scrollToTable(){
        WebElement tableElement = driver.findElement(table);
        String script ="arguments[0].scrollIntoView();"; //////cast our driver to JSExecuter
        ((JavascriptExecutor)driver).executeScript(script,tableElement);

    }

}
