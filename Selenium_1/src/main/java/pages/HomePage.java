package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver ;
//    private By formAuthenticationLink = By.linkText("Form Authentication") ;


    public HomePage(WebDriver webDriver){  /*Creating a contructor with one parameter :  webDriver */
        this.driver = webDriver ;

    }

    public LoginPage clickFormAuthentication(){  /*Method created . It returns LoginPage   */
//        driver.findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver) ;

    }
    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver) ;
    }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver) ;
    }
    public HoversPage clickHover(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver) ;
    }
    public HorizontalSliderPage clickHorizontalSliderPage(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    public JsAlertsPage clickJsAlerts(){
        clickLink("JavaScript Alerts");
        return new JsAlertsPage(driver) ;
    }
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver) ;
    }
    
//    public ContexMenu clickContextMenu(){
//        clickLink("");
//        return new ContexMenu(driver) ; @// TODO: 22.06.2020 : Contex Menu
//    }

    public WysiwygEditorPage  clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);

    }

    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver) ;

    }

    public Frames clickFrames(){
        clickLink("Frames");
        return new Frames(driver) ;
    }

    public LargeAndDeepDomPAge clickLargeAndDeep(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPAge(driver) ;
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver) ;

    }


    private void clickLink(String linkText){   //A generic method used to click the link on the Home Page. Private makes it not reachable by test classes.
        driver.findElement(By.linkText(linkText)).click();

    }


}
