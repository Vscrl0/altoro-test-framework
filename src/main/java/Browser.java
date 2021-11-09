import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser {
    static WebDriver driver;

    public static void goTo(String url) {
        driver.get(url);
    }

    public static String title() {
        return driver.getTitle();
    }

    public static void close() {
        driver.close();
    }

    public static void quit() {
        driver.quit();
    }

    public static void useFirefox() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        Browser.driver = new FirefoxDriver(options);
    }

    public static void useChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        Browser.driver = new ChromeDriver(options);
    }

    public static boolean isAlertPresent() {
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            driver.switchTo().alert().accept();
            return true;
        }catch(Exception e) {
            return false;
        }
    }
}
