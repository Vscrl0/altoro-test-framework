import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class MyAccount extends AbstractPage {
    //locators
    private static final By accountSummary = By.id("MenuHyperLink1");
    private static final By recentTransactions = By.id("MenuHyperLink2");
    private static final By transferFunds = By.id("MenuHyperLink3");
    private static final By accountList = By.id("listAccounts");
    private static final By goButton = By.id("btnGetAccount");
    private static final By accountBalance = By.cssSelector(".fl > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(2)");
    private static final By helloText = By.cssSelector(".fl > h1:nth-child(1)");

    public MyAccount() {
        MyAccount.url = "https://demo.testfire.net/bank/main.jsp";
        MyAccount.title = "Altoro Mutual";
    }

    public void clickAccountSummary() {
        Browser.driver.findElement(accountSummary).click();
    }

    public void clickRecentTransactions() {
        Browser.driver.findElement(recentTransactions).click();
    }

    public void clickTransferFunds() {
        Browser.driver.findElement(transferFunds).click();
    }

    public String getAccountBalance(Account account) {
        Select dropdown = new Select(Browser.driver.findElement(accountList));
        dropdown.selectByVisibleText(account.getName());
        Browser.driver.findElement(goButton).click();
        String balance = Browser.driver.findElement(accountBalance).getText().substring(1);
        this.goTo();
        return balance;

    }

    public String getHelloText() {
        return Browser.driver.findElement(helloText).getText();
    }

}
