package Pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LogInPage {
    @FindBy(xpath = "//input[contains(@id,\"login_username\")]")
    private WebElement loginField;
    //By loginField = By.xpath("//input[contains(@id,\"login_username\")]");
    @FindBy(xpath = "//span[text()=\"Sign in\"]")
    private WebElement signInButton;
    @FindBy(xpath = "//input[contains(@id,\"login_password\")]")
    private WebElement passwordField;

    ChromeDriver driver;

    @Inject
    public LogInPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public LogInPage openBrowser(String url) {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return this;
    }

    public LogInPage setEMail(String eMail) {
        loginField.sendKeys(eMail);
        //driver.findElement(loginField).sendKeys(eMail);

        return this;
    }

    public LogInPage clickSignInButton() {
        signInButton.click();

        return this;
    }

    public LogInPage setPassword(String password) {
        passwordField.sendKeys(password);

        return this;
    }
}
