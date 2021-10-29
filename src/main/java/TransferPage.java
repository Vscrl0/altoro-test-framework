import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TransferPage extends AbstractPage {
    //locators
    private static final By fromAccount = By.id("fromAccount");
    private static final By toAccount = By.id("toAccount");
    private static final By transferButton = By.id("transfer");
    private static final By transferAmount = By.id("transferAmount");

    public void transfer(String amount, Account fromAccount, Account toAccount) {
        Select fromDropdown = new Select(Browser.driver.findElement(TransferPage.fromAccount));
        Select toDropdown = new Select(Browser.driver.findElement(TransferPage.toAccount));
        fromDropdown.selectByVisibleText(fromAccount.getName());
        toDropdown.selectByVisibleText(toAccount.getName());
        Browser.driver.findElement(transferAmount).sendKeys(amount);
        Browser.driver.findElement(transferButton).click();

    }

    public TransferPage() {
        TransferPage.url = "https://demo.testfire.net/bank/transfer.jsp";
        TransferPage.title = "Altoro Mutual";
    }


}
