package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage  {
    @FindBy(xpath = "//div[contains(@title,\"Interview\")]")
    private WebElement interviewCard;

    public MainPage openInterviewPage() {
        interviewCard.click();

        return this;
    }
}
