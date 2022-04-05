package login_test;

import navigation.Navigator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wait_times.WaitTimes;
import webDriverBuilder.WebDriverBuilder;

public class BaseLoginTest {
    static public WebDriver driver;
    static String loginurl =   "https://formy-project.herokuapp.com/switch-window";


    @Before
    public  void driverSetup() {

        WebDriverBuilder wbd = new WebDriverBuilder();
        driver = wbd.getDriver();
        Navigator nav = new Navigator(driver);

        nav.navigateToGivenUrl(loginurl);

    }

    @After
    public void driverCleanup() {
        driver.quit();
    }

}









