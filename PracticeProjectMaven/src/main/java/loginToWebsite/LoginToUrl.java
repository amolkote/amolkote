package loginToWebsite;

import navigation.Navigator;
import org.openqa.selenium.WebDriver;
import page_object.BasePage;

public class LoginToUrl extends BasePage {

    private  String LOGIN_URL ;

    public LoginToUrl(WebDriver driver) {
        super(driver);
    }
public Navigator navigateToGivenUrl ;

    public  void LogintoGivenUrl(){

        navigateToGivenUrl =new Navigator(driver);
       navigateToGivenUrl.navigateToGivenUrl(LOGIN_URL);

    }
}
