package pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InterviewPage extends BasePage {
    @FindBy(xpath = "//div[contains(text(),\"Demo\")]")
    private WebElement demoButton;
    @FindBy(xpath = "//input[contains(@id,\"name\")]")
    private WebElement nameField;
    @FindBy(xpath = "//input[contains(@id,\"e_mail\")]")
    private WebElement eMailField;
    @FindBy(xpath = "//div[text()=\"male\"]")
    private WebElement maleCheckbox;
    @FindBy(xpath = "//div[text()=\"Yes\"]")
    private WebElement yesCheckbox;
    @FindBy(xpath = "//input[@id=\"date\"]")
    private WebElement dateField;
    @FindBy(xpath = "//button[@id=\"dropdown_button\"]")
    private WebElement dropdownButton;
    @FindBy(xpath = "//a[text()=\"No\"]")
    private WebElement noInDropdown;
    @FindBy(xpath = "//div[@class=\"sectionPanelTitle inlineControl\"]")
    private WebElement statusDemo;
    @FindBy(xpath = "//div[@class=\"myHealthButtonsBottom\"]//span[text()=\"Cancel\"]")
    private WebElement cancelButton;
    @FindBy(xpath = "//div[@class=\"crfStatusAvailable\"]")
    private WebElement demoStatus;

    @Inject
    public InterviewPage(final WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public InterviewPage startDemo() {
        waitElementToBeClickableAndClick(demoButton);

        return this;
    }

    public InterviewPage setUserFirstName(String name) {
        nameField.sendKeys(name);

        return this;
    }

    public InterviewPage setEMail(String eMail) {
        eMailField.sendKeys(eMail);

        return this;
    }

    public InterviewPage chooseGender() {
        waitElementToBeClickableAndClick(maleCheckbox);

        return this;
    }

    public InterviewPage chooseYesOrNo() {
        waitElementToBeClickableAndClick(yesCheckbox);

        return this;
    }

    public InterviewPage setDate(String date) {
        dateField.sendKeys(date);

        return this;
    }

    public InterviewPage openDropdownAndChoose() {
        waitElementToBeClickableAndClick(dropdownButton);
        waitElementToBeClickableAndClick(noInDropdown);

        return this;
    }

    public InterviewPage clickCancelButton() {
        waitElementToBeClickableAndClick(cancelButton);

        return this;
    }

    public void waitElementToBeClickableAndClick(WebElement element) {
        waitForVisibility(element);
        element.click();
    }

    public String getDemoStatus() {
        return demoStatus.getText();
    }
}
