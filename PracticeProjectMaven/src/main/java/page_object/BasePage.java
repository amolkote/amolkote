package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wait_times.WaitTimes;

import java.time.Duration;

public class BasePage {
    public WaitTimes waitTimes = new WaitTimes();

   public WebDriver driver ;

   public BasePage(WebDriver driver){
       this.driver = driver ;
   }

    public boolean clickElement(By locator) {
        try {
            WebElement clickElement =  new WebDriverWait(driver,waitTimes.DEFAULT_WAIT).until(ExpectedConditions.elementToBeClickable(locator));

            clickElement.click();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
}
 public void WindowHandles(){

      System.out.println(driver.getWindowHandles());

 }





}
