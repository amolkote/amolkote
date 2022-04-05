package page_object.switch_window;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.BasePage;

import java.util.ArrayList;
import java.util.Collections;

public class SwitchWindow extends BasePage {


    private final By Open_New_Tab = By.id("new-tab-button");


    By AlertButton = By.id("alert-button");

    By Componants = By.className("navbarDropdownMenuLink");

    public SwitchWindow(WebDriver driver) {
        super(driver);
    }

    public  boolean clickonOpenTabButton() {

        return clickElement(Open_New_Tab);

    }

    public void WindowHandles(){

      //  ArrayList<String> nwTab =new ArrayList<String>(driver.getWindowHandles());
        String   window1 =driver.getWindowHandle();

        for(String window2 :driver.getWindowHandles() )

            driver.switchTo().window(window2);

        System.out.println("Switched to window := "+ driver.getTitle());

        }

    }



