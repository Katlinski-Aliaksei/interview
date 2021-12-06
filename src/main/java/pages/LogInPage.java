package pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {
    @FindBy(xpath = "//input[contains(@id,\"login_username\")]")
    private WebElement loginField;
    @FindBy(xpath = "//span[text()=\"Sign in\"]")
    private WebElement signInButton;
    @FindBy(xpath = "//input[contains(@id,\"login_password\")]")
    private WebElement passwordField;

    @Inject
    public LogInPage(final WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LogInPage setEMail(String eMail) {
        waitForVisibility(loginField);
        loginField.sendKeys(eMail);

        return this;
    }

    public LogInPage clickSignInButton() {
        waitForVisibility(signInButton);
        signInButton.click();

        return this;
    }

    public LogInPage setPassword(String password) {
        waitForVisibility(passwordField);
        passwordField.sendKeys(password);

        return this;
    }
}
