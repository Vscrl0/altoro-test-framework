import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

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
        Browser.driver = new FirefoxDriver(options);
    }

    public static void useChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        Browser.driver = new ChromeDriver(options);
    }

}
