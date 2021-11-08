import org.openqa.selenium.NoAlertPresentException;

public abstract class AbstractPage {
    static String url;
    static String title;

    public void goTo() {
        Browser.goTo(url);
    }
    public boolean isAlertPresent() {
        try {
            Browser.driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException Ex) {
            return false;
        }
    }
}
