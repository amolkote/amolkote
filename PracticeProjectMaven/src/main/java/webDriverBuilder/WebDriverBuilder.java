package webDriverBuilder;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverBuilder {

    public WebDriver getDriver() {

        WebDriverManager.chromedriver().setup();
       ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-agent=DEMO_QA_AUTOMATION"); // --user-agent ⊗	A string used to override the default user agent with a custom one

        options.addArguments("start-maximized");    // --window-size ⊗	Sets the initial window size. Provided as string in the format "800,600". ↪ --window-size=1400,800

        return new ChromeDriver();
    }

    }


