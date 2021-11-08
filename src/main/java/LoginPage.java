import org.openqa.selenium.By;

public class LoginPage extends AbstractPage {
    //locators
    private static final By usernameBox = By.name("uid");
    private static final By passwordBox = By.name("passw");
    private static final By submitButton = By.name("btnSubmit");
    private static final By failureMessage = By.id("_ctl0__ctl0_Content_Main_message");

    public LoginPage() {
        LoginPage.url = "https://demo.testfire.net/login.jsp";
        LoginPage.title = "Altoro Mutual";
    }

    public void signIn(String username, String password) {
        Browser.driver.findElement(usernameBox).sendKeys(username);
        Browser.driver.findElement(passwordBox).sendKeys(password);
        Browser.driver.findElement(submitButton).click();
    }

    public boolean isFailedLogin() {
        if(this.isAlertPresent()) {
            return true;
        }
        try {
            return Browser.driver.findElement(failureMessage).isDisplayed();
        } catch (Exception e) {
            return false;
        }

    }

}
