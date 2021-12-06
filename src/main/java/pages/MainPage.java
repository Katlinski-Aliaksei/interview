package pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    @FindBy(xpath = "//div[contains(@title,\"Interview\")]")
    private WebElement interviewCard;

    @Inject
    public MainPage(final WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MainPage openInterviewPage() {
        interviewCard.click();

        return this;
    }
}
