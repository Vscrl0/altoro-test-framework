import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
        Browser.driver = new FirefoxDriver();
    }

    public static void useChrome() {
        Browser.driver = new ChromeDriver();
    }

}
