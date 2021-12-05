package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InterviewPage {
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

    public InterviewPage startDemo() {
        demoButton.click();

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
        maleCheckbox.click();

        return this;
    }

    public InterviewPage chooseYesOrNo() {
        yesCheckbox.click();

        return this;
    }

    public InterviewPage setDate(String date) {
        dateField.sendKeys(date);

        return this;
    }

    public InterviewPage openDropdownAndChoose() {
        dropdownButton.click();
        noInDropdown.click();

        return this;
    }

    public InterviewPage clickCancelButton() {
        cancelButton.click();

        return this;
    }

    public String getDemoStatus() {
        return demoStatus.getText();
    }
}
