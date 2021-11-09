import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NavBar {
    //locators
    private static final By logoButton = By.id("HyperLink1");
    private static final By loginButton = By.id("LoginLink");
    private static final By contactUsButton = By.id("HyperLink3");
    private static final By feedbackButton = By.id("HyperLink4");
    private static final By searchBox = By.id("query");

    public boolean isLoggedIn() {
        return Browser.driver.findElement(loginButton).getText().equals("Sign Off");
    }

    public void clickLogin() {
        Browser.driver.findElement(loginButton).click();
    }

    public void clickContactUs() {
        Browser.driver.findElement(contactUsButton).click();
    }

    public void clickFeedback() {
        Browser.driver.findElement(feedbackButton).click();
    }

    public void clickLogo() {
        Browser.driver.findElement(logoButton).click();
    }

    public void searchFor(String query) {
        Browser.driver.findElement(searchBox).sendKeys(query + Keys.RETURN);
    }

    public NavBar() {

    }
}
